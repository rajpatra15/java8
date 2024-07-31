interface Test1 {

    default  void m1() {
        System.out.println("default method in test1");
    }

    static void m2(){
        System.out.println("static method ");
    }
}

interface  Test2 {

    default void m1() {
        System.out.println("default method in Test2");
    }
}

public class DefaultDemo implements Test2 {

    public static void main(String[] args) {
        DefaultDemo demo = new DefaultDemo();
        demo.m1();
        Test1.m2();

    }

    @Override
    public void m1() {
        Test2.super.m1();
        System.out.println("m1 implementation in demo");
    }
}
