import java.util.Scanner;

class Figure {
    double dim1, dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    Triangle(int len, int base) {
        super(len, base);

    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class Rectangle extends Figure {

    Rectangle(int len, int bre) {
        super(len, bre);

    }

    double area() {
        return dim1 * dim2;
    }
}

public class pa4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length and bridth of rectangle");
        int len = sc.nextInt();
        int width = sc.nextInt();
        Rectangle r = new Rectangle(len, width);
        double a = r.area();
        System.out.println("Area of rectangle:" + a);
        System.out.println("Length and base of triangle");
        int leng = sc.nextInt();
        int hei = sc.nextInt();
        Triangle t = new Triangle(leng, hei);
        double ar = t.area();
        System.out.println("Area of triangle:" + ar);
        sc.close();
    }

}
