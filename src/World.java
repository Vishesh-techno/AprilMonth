public class World extends Thread{
    public static void main(String[] args) {
        ThreeApril tapril = new ThreeApril();
        tapril.start();

        for(; ;){
            System.out.println("World");
        }
    }
}
