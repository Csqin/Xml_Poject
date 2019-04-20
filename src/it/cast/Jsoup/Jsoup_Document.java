package it.cast.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup_Document {
    /**
     * /*
     2. Document：文档对象。代表内存中的dom树
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {


        String path = Jsoup_Document.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path), "utf-8");
        //根据标签名称获取元素对象集合
        Elements elements = document.getElementsByTag("students");
       System.out.println(elements);

        System.out.println("------------------------------------------------------------------");
        //根据属性名称获取元素对象集合

        Elements elements1 = document.getElementsByAttribute("id");
       System.out.println(elements1);

        System.out.println("------------------------------------------------------------------");

        //根据对应的属性名和属性值获取元素对象集合
        Elements elements2 = document.getElementsByAttributeValue("id", "001");
       System.out.println(elements2);
    }
}
