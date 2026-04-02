class Home {
    int length = 55;
    int width = 12;
    int members = 4;
    int rooms = 2;
    int kitchen = 1;
    int washroom = 1;

    void live() {
        System.out.println(members);
    }

    void area() {
        System.out.println(length * width);
    }

    void totalSpace() {
        System.out.println(rooms + kitchen + washroom);
    }
}

public class TwoApril {
    public static void main(String[] args) {
        Home h = new Home();
        h.live();
        h.area();
        h.totalSpace();
    }
}
