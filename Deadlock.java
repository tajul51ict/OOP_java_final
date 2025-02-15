class Resource {
    synchronized void method1(Resource another) {
        System.out.println("Method 1");
        another.method2();
    }

    synchronized void method2() {
        System.out.println("Method 2");
    }
}

public class Deadlock {
    public static void main(String[] args) {
        final Resource resource1 = new Resource();
        final Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.method1(resource2));
        Thread t2 = new Thread(() -> resource2.method1(resource1));

        t1.start();
        t2.start();
    }
}