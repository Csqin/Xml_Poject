package it.cast.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Jsoup_TG {
    /**
     * 1. Jsoup：工具类，可以解析html或xml文档，返回Document
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {


        String path = Jsoup_TG.class.getClassLoader().getResource("student.xml").getPath();

        //parse​(File in, String charsetName)：解析xml或html文件的。
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);

        System.out.println("-----------------------------------------------------");
        //parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url=new URL("https://github.com/");
        Document document1 = Jsoup.parse(url, 5000);
        System.out.println(document1);
    }
}
