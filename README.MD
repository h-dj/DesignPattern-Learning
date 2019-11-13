### 设计模式初涉

#### 一、开发原则
1. 单一原则
2. 里氏替换原则
3. 接口隔离原则
4. 依赖倒置原则（面向接口编程）
5. 迪米特法则
6. 开闭原则
#### 二、设计模式
- [x] 单例模式
- [x] 工厂模式
- [x] 建造者模式
    - JDK 中的StringBuilder
- [x] 原型模式
    - JDK 中Object.clone；Cloneable
- [x] 适配器模式
    - JDK中字节流和字符流的转换：InputStreamReader和OutputStreamWriter
- [x] 代理模式
    - 动态代理；RMI
- [x] 桥接者模式
- [x] 组合模式
- [x] 享元模式
    - Integer.valueOf(int i)
    - String常量池
- [x] 外观模式(门面模式)
    - java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer
    - java.util.Collections#synchronizedXXX()
    - java.util.Collections#unmodifiableXXX()
- [x] 访问者模式
    - java.nio.file.FileVisitor接口
- [x] 中介者模式
    - MVC 框架
    - java.lang.reflect.Method.invoke方法
- [x] 命令模式
- [x]　责任链模式
    - javax.servlet.Filter#doFilter()


#### 三、参考
- https://www.kancloud.cn/sstd521/design/193631
- https://design-patterns.readthedocs.io/zh_CN/latest/
- https://www.codeproject.com/Articles/28359/Design-pattern-FAQ-Part-Design-pattern-training
- http://c.biancheng.net/view/1383.html
- https://github.com/iluwatar/java-design-patterns