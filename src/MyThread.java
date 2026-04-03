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
        System.out.println("start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
        System.out.println("I have been waiting for 5 seconds");
    }
}
