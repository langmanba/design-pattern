package main.java.facade;

public class Facade {
    private Class1 c1 = new Class1();
    private Class2 c2 = new Class2();
    private Class3 c3 = new Class3();

    void getAll() {
        c1.run();
        c2.run();
        c3.run();
    }

    void getC2C1(){
        c1.run();
        c2.run();
    }
}
