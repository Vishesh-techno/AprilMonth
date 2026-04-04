public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThred t1 = new MyThred(counter);
        MyThred t2 = new MyThred(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());
    }
}
