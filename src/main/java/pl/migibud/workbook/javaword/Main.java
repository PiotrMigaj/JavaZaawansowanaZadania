package pl.migibud.workbook.javaword;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.documents.BookmarksNavigator;
import com.spire.doc.interfaces.IDocument;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document("src/main/java/pl/migibud/workbook/javaword/test.docx");
        BookmarksNavigator bookmarksNavigator = new BookmarksNavigator(doc);

        bookmarksNavigator.moveToBookmark("zakladka");
        doc.setEmbedFontsInFile(true);

        Document newDoc = new Document();
        doc.cloneDefaultStyleTo(newDoc);
        doc.cloneThemesTo(newDoc);
        doc.cloneCompatibilityTo(newDoc);


        bookmarksNavigator.replaceBookmarkContent("This is new content", false);


        doc.saveToFile("src/main/java/pl/migibud/workbook/javaword/ReplaceWithText.docx", FileFormat.Docx);

        Document template = new Document();
        template.loadFromFile("src/main/java/pl/migibud/workbook/javaword/ReplaceWithText.docx");

        IDocument replaceDoc = new Document();
        replaceDoc.loadFromFile("src/main/java/pl/migibud/workbook/javaword/ReplaceWithText.docx");

        // Replace specified text with the other document
        template.replace("${content}", replaceDoc, false, true);

        template.saveToFile("src/main/java/pl/migibud/workbook/javaword/copytest.docx", FileFormat.Docx);


    }
}
