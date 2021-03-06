package com.siyee.designpatterns.factory.simple;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Client {

    /**
     * 简单工厂模式
     * 优点：
     * 1、工厂类包含必要的逻辑判断，可以决定什么时候创建哪一个产品类的实例。客户端可以免除直接创建产品对象的职责，而仅仅‘消费’产品，
     *    简单工厂模式实现了对象创建和使用的分离。
     * 2、客户端无需知道创建的具体产品类，只需要知道具体产品类所对应的参数即可。
     * 3、也可以通过配置文件方式，可以在不修改客户端代码情况下更换和增加新的具体产品类，提高灵活性
     * 缺点：
     * 1、由于工厂类集中了所有的产品的创建逻辑，职责过重，一旦不能正常工作，整个系统都会收到影响。
     * 2、使用简单工厂模式势必会增加类的个数，增加了系统的复杂度和理解难度。
     * 3、系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，在产品类型较多时有可能造成工厂逻辑过于复杂，不利于系统的扩展和维护。
     * 4、简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。
     * 适用环境：
     * 1、工厂类负责创建的对象比较少，创建对象较少就不会造成工厂方法中的业务逻辑太过复杂
     * 2、客户端只需要传入工厂类参数，对于如何创建对象并不关心
     */
    public static void main(String[] args) {

//        Product p = ProductFactory.create("A");
//        Product p = ProductFactory.create("B");
//        if (p != null) {
//            p.methodDiff();
//            p.methodSame();
//        }

        // Or 根据配置文件读取

        Product p = ProductFactory.create(getProductType());
        if (p != null) {
            p.methodDiff();
            p.methodSame();
        }
    }

    public static String getProductType() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/main/resources/config.xml"));
            // 获取节点
            NodeList nl = doc.getElementsByTagName("productType");
            Node firstChild = nl.item(0).getFirstChild();
            return firstChild.getNodeValue().trim();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
