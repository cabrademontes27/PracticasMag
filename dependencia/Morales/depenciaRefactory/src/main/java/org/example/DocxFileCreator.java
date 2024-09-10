package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocxFileCreator implements FileCreator {

    private static String type = "docx";

    @Override
    public void createFile(String content, String fileName) {
        try (
                XWPFDocument document = new XWPFDocument();
                FileOutputStream out = new FileOutputStream(fileName + ".docx")
        ) {
            document.createParagraph().createRun().setText(content);
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getType() {
        return type;
    }
}