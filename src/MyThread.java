public class MyThread extends Thread {

//    @Override
//    public void run() {
//        System.out.println("Thread is running...");
//    }

//    @Override
//    public void run() {
//        for (int i=1; i<=10; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
//    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public MyThread(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low");
        MyThread m = new MyThread("Medium");
        MyThread h = new MyThread("HIgh");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
