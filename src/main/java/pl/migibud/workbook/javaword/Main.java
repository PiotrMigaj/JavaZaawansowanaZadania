package pl.migibud.workbook.javaword;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;
import com.spire.doc.documents.BookmarksNavigator;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document("src/main/java/pl/migibud/workbook/javaword/test.docx");
        BookmarksNavigator bookmarksNavigator = new BookmarksNavigator(doc);

        bookmarksNavigator.moveToBookmark("zakladka");

        bookmarksNavigator.replaceBookmarkContent("This is new content", false);

        doc.saveToFile("src/main/java/pl/migibud/workbook/javaword/ReplaceWithText.docx", FileFormat.Docx);


    }
}
