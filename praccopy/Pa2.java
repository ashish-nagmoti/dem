//java.lang.Exception;
class Publish {
    String title;
    int price;

    Publish(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title:" + title);
        System.out.println("Price:" + price);
    }
}

class Book extends Publish {
    int pagecount;

    Book(String title, int price, int pagecount) {
        super(title, price);
        this.pagecount = pagecount;
    }

    void display1() {
        display();
        System.out.println("Pagecount:" + pagecount);
    }
}

class Audio extends Publish {
    int playtime;

    Audio(String title, int price, int playtime) {
        super(title, price);
        this.playtime = playtime;
    }

    void display2() {
        display();
        System.out.println("Playtime:" + playtime);
    }
}

public class Pa2 {
    public static void main(String args[]) {
        try {
            Book b = new Book("hp", 100, 10);
            if ((b.title == null) || (b.price == 0) || (b.pagecount == 0)) {
                throw new Exception("invalid");
            }
            b.display1();
            Audio a = new Audio("hp", 80, 30);
            a.display2();
        } catch (Exception e) {
            System.out.println("All values set to 0 after exception");
            Book ba = new Book(null, 0, 0);
            ba.display1();
            Audio aa = new Audio(null, 0, 0);
            aa.display2();
        }
    }
}
