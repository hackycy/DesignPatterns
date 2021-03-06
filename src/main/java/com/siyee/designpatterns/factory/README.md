1.在抽象工厂模式中,产品等级结构即产品的继承结构，产品族是指由同一个工厂生产的位于不同产品等级结构中的一组产品。

2.抽象工厂模式提供-个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式是一种对象创建型模式。

3.抽象工厂模式包含抽象工厂、具体工厂、抽象产品和具体产品4个角色。其中，抽象工厂声明了一组用于创建一族产品的方法，
每一一个方法对应一 一种产品; 具体工厂实现了在抽象工厂中声明的创建产品的方法，生成一组具体产品，
这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中;抽象产品为每种产品声明接口,
在抽象产品中声明了产品所具有的业务方法;具体产品定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法。

4.抽象工厂模式的优点主要是隔离了具体类的生成，使得客户端并不需要知道什么被创建;
当一个产品族中的多个对象被设计成一起工作时，它能够保证客户端始终只使用同-一个产品族中的对象;
增加新的产品族很方便,无须修改已有系统，符合开闭原则。其缺点主要是增加新的产品等级结构麻烦，
需要对原有系统进行较大的修改,甚至需要修改抽象层代码,违背了开闭原则。

5.抽象工厂模式适用于以下环境:一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节;
系统中有多于一个的产品族，而每次只使用其中某一产品族;属于同个产品族的产品将在一起使用，
这一约束必须在系统的设计中体现出来;产品等级结构稳定,在设计完成之后不会向系统中增加新的产品
等级结构或者删除已有的产品等级结构。

6. 抽象工厂模式以一种倾斜的方式来满足开闭原则。对于增加新的产品族,抽象工厂模式很好地支持了开闭原则;
对于增加新的产品等级结构，需要修改所有的工厂角色，违背了开闭原则。