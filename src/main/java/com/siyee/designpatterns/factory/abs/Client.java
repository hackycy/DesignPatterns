package com.siyee.designpatterns.factory.abs;

import com.siyee.designpatterns.factory.abs.summer.SummerSkinFactory;

public class Client {

    public static void main(String[] args) {

        /**
         * 抽象工厂模式两个很重要的概念：
         * 产品族：例如电视机、冰箱、空调 这是一个产品族。
         * 产品等级结构： TCL的电视机、海尔的电视机、格力的电视机
         * 一个工厂就创建一个产品族，例如海尔工厂就创建海尔电视机、海尔冰箱、海尔空调，总之就是一个牌子的。就是一个产品族。
         *
         * 优点：
         * 1、抽象工厂模式隔离了具体类的生成，使得客户端并不需要知道什么时候被创建。由于这种隔离，更换一个具体工厂就变得相对容易，
         *    所有的具体工厂都实现了抽象工厂中定义的那些公共接口，因此只需要改变具体工厂的实例就可以在某种程度上改变整个软件系统的行为。
         * 2、当一个产品族的多个对象被设计在一起工作时，它能够保证客户端始终只使用同一个产品族中的对象。
         * 3、增加新的产品组很方便，无须修改已有的系统，符合开闭原则。
         *
         * 缺点：
         * 1、增加新的产品等级结构很麻烦，需要对原有系统进行较大的修改，甚至需要修改抽象层代码，这会带来很多的不便，违背了开闭原则。
         *
         * 适用环境：
         * 1、一个系统不应当依赖产品类实例如何被创建、组合和表达的细节，这对于所有类型的工厂模式都是很重要的，用户无需关心对象的创建过程，
         *    将对象的创建和使用解耦。
         * 2、系统中有多余一个的产品族，而每次只使用其中某一产品族。可以通过配置文件等方式来使用户能够动态改变产品族，也可以很方便的增加新的产品族。
         * 3、属于同一个产品族的产品将在一起使用，这一约束必须在系统的设计中体现出来。同一个产品族中的产品可以是没有任何关系的对象，但是它们都具有
         *    一些共同的约束，如同一个操作系统下的按钮和文本框，按钮和文本框之间没有直接关系，但是它们都属于某一操作系统的，此时具有一个共同的约束条件，
         *    即操作系统的类型。
         * 4、产品等级结构稳定，在设计完成之后不会向系统中增加新的产品等级结构或者删除已有的产品等级结构。
         */

        SkinFactory factory;
        Button b;
        CheckBox cb;
        ProgressBar pb;
        TextField tf;
        factory = new SummerSkinFactory();
        // 切换样式可以很方便的切换
        // new SpringSkinFactory();
        b = factory.createButton();
        cb = factory.createCheckBox();
        pb = factory.createProgressBar();
        tf = factory.createTextField();
        b.display();
        cb.display();
        pb.display();
        tf.display();
    }

}
