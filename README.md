# springBoot整合设计模式实例介绍
springBoot整合设计模式实例介绍

创建型模式
```
描述:这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。	
* 工厂模式（Factory Pattern）
    描述:该模式针对一个接口，有多种不同的实现类，根据不同的需求类型调用不同的实现类，并实现对应的功能
    model目录下factory/factoryModel为启动类，object/factory目录下为对应的接口和实现类，Shape抽取了实现过程的共有方法，对应三个/impl/目录下的实现类分别实现对应的需求逻辑
    优点:共用同一个接口，根据需求实现不同的逻辑

* 抽象工厂模式（Abstract Factory Pattern）
    描述:是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式
        在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
     mode目录下abstractFactory/AbstractFactoryModel为启动类，object/abstractFactory目录下为对应的接口和实现类，Shape/Color抽取了实现过程的共有方法，对应六个/impl/目录下的实现类分别实现对应的需求逻辑
     优点:根据需求调用对应的对象，并可以在对应的对象中实现相应的功能逻辑

* 单例模式（Singleton Pattern）
      描述:单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
      这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
      这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
      mode目录下singleton/SingletonModel为启动类，object/singleton目录下为对应六种实现过程的逻辑
      优点:在内存里只有一个实例，减少了内存的开销,尤其是频繁的创建和销毁实例，避免对资源的多重占用
      该模式以六种方式进行实现,分别为:懒汉式(线程不安全)、懒汉式(线程安全)、饿汉式、双检锁/双重校验锁、登记式/静态内部类、枚举式(推荐使用)
      注意:在以上例子中可能会有同学会使用反人类的方式构建反射机制来创建对象，因此，需要在各个空参构造方法中加上报错等逻辑，禁止构造对象

* 建造者模式（Builder Pattern）

* 原型模式（Prototype Pattern）
```

结构型模式

```
描述:这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
* 适配器模式（Adapter Pattern）
* 桥接模式（Bridge Pattern）
* 过滤器模式（Filter、Criteria Pattern）
* 组合模式（Composite Pattern）
* 装饰器模式（Decorator Pattern）
* 外观模式（Facade Pattern）
* 享元模式（Flyweight Pattern）
* 代理模式（Proxy Pattern）
```
行为型模式

```
描述:这些设计模式特别关注对象之间的通信。
* 责任链模式（Chain of Responsibility Pattern）
* 命令模式（Command Pattern）
* 解释器模式（Interpreter Pattern）
* 迭代器模式（Iterator Pattern）
* 中介者模式（Mediator Pattern）
* 备忘录模式（Memento Pattern）
* 观察者模式（Observer Pattern）
* 状态模式（State Pattern）
* 空对象模式（Null Object Pattern）
    描述:在空对象模式（Null Object Pattern）中，一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。
        这样的 Null 对象也可以在数据不可用的时候提供默认的行为.
    model目录下nullObject/NullObejctModel为启动类，NullObejctFactory为该实例的工厂封装，object/nullObject目录下为对应的实现逻辑。

* 策略模式（Strategy Pattern）
    描述:为了简化代码中的if else结构就可以使用该模式进行书写咋们的代码
    model目录下strategy/StrategyModel为启动类，分别根据实现逻辑调用对应的功能策略,object/strategy目录下,StrategyLogic为逻辑分配调用类，
   StrategyFather则为策略接口,对应下面StrategyA、StrategyB....则为实现类处理业务逻辑,拓展性强,新增业务逻辑的情况下新增多一个实现类即可。

* 模板模式（Template Pattern）
    描述:模版模式就是为了将公共有的代码抽取出来并封装到一个抽象类中，在需求中需要地方可以直接继承自该方法，并可以针对已有的方法进行增强,
    model目录下template/TemplateModel为启动类,创建实现类调用对应的方法进行增强,object/template目录下,Game为该模型的抽象方法抽取需求中共有方法
    /impl/目录下为Game的继承类，并重写抽象类中的抽象方法，当前抽象方法就是我们的共有的代码需求。

* 访问者模式（Visitor Pattern）
```

J2EE 模式

```
描述:这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
* MVC 模式（MVC Pattern）
* 业务代表模式（Business Delegate Pattern）
* 组合实体模式（Composite Entity Pattern）
* 数据访问对象模式（Data Access Object Pattern）
* 前端控制器模式（Front Controller Pattern）
* 拦截过滤器模式（Intercepting Filter Pattern）
* 服务定位器模式（Service Locator Pattern）
* 传输对象模式（Transfer Object Pattern）
```
