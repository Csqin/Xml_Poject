package it.cast.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class Jsoup_Element {
    /**

     3. Elements：元素Element对象的集合。可以当做 ArrayList<Element>来使用
     4. Element：元素对象

     * @param args
     */
    public static void main(String[] args) throws IOException {

        String path = Jsoup_Document.class.getClassLoader().getResource("student.xml").getPath();

        Document document = Jsoup.parse(new File(path), "utf-8");

        //获取第一个名字为student标签对象
        Element element = document.getElementsByTag("student").get(0);

        //String attr(String key)：根据当前标签属性名称获取属性值（不能通过子标签属性名获取属性值）
        String number = element.attr("number");

        //获取所有纯文本内容
        String text = element.text();

        System.out.println("number:"+number);
        System.out.println("所有纯文本："+text);
    }
}
