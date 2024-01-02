class Person {
    String name;
    int num;

    Person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void display() {
        System.out.println("name:" + name);
        System.out.println("num:" + num);
    }
}

class Acad extends Person {
    int per;
    String deg;

    Acad(String name, int num, String deg, int per) {
        super(name, num);
        this.deg = deg;
        this.per = per;
    }

    void display1() {
        display();
        System.out.println("degree:" + deg);
        System.out.println("Percentage:" + per);
    }
}

class Sports extends Person {
    String sports;
    int score;

    Sports(String name, int num, String sports, int score) {
        super(name, num);
        this.sports = sports;
        this.score = score;
    }

    void display2() {
        display();
        System.out.println("Sports:" + sports);
        System.out.println("score:" + score);
    }
}

public class Pa1 { 
        public static void main(String args[])
    {   
        Acad a = new Acad("John",3,"engg",95);
        a.display1();
   
        Sports s = new Sports("ash",12,"cricket",5);
        s.display2();
    }
}
