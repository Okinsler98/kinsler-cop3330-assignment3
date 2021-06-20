/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex43.base;

import java.io.*;

public class FileManager {
    File website = new File ("website");

    public void fileOutput(String name, String author, boolean jFileBool, boolean cFileBool) throws IOException {
        website.mkdir();

        File siteName = new File(website.toPath() + "\\" + name);
        siteName.mkdir();

        System.out.println("Created ./website/" + name);

        createHtml(name, author);
        createJavaFile(jFileBool, siteName, name);
        createCssFile(cFileBool, siteName, name);
    }

    public void createHtml(String name, String author) throws IOException {
        String indexInfo = "<html><head><meta name=\"author\" content=\"" + author + "\"><ttle>" + name + "</title></head><body><p></p></body></html>";

        FileWriter indexWriter = new FileWriter(website.getPath() + "\\" + name + "\\index.html");
        indexWriter.write(indexInfo);
        indexWriter.close();

        System.out.println("Created ./website/" + name + "/index.html");
    }

    public void createJavaFile(boolean jFileBool, File siteFile, String name) throws FileNotFoundException {
        if (jFileBool){
            File jFile = new File(siteFile.toPath() + "\\js");
            if (!jFile.exists()){
                jFile.mkdir();
                System.out.println("Created ./website/" + name + "/js/");
            }
        }
    }

    public void createCssFile(boolean cFileBool, File siteFile, String name) throws FileNotFoundException {
        if (cFileBool){
            File cFile = new File(siteFile.toPath() + "\\css");
            if (!cFile.exists()){
                cFile.mkdir();
                System.out.println("Created ./website/" + name + "/css/");
            }
        }
    }
}
