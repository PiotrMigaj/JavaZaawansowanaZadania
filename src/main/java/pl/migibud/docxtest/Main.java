package pl.migibud.docxtest;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		XWPFDocument document = new XWPFDocument();
		XWPFParagraph paragraph = document.createParagraph();
		XWPFRun run = paragraph.createRun();
		run.setText("Czesc to pierwszy word");


		FileOutputStream out = new FileOutputStream( new File("ms_word.docx"));

		document.write(out);
		out.close();

		XWPFDocument docx = new XWPFDocument(new FileInputStream("ms_word.docx"));

		XWPFWordExtractor we = new XWPFWordExtractor(docx);
		System.out.println(we.getText());






	}
}
