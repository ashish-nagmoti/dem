import java.util.Scanner;

class Invalid extends Exception {
    public Invalid(String d) {
        super(d);
    }
}

class Excep {
    int age, income, wheeler;
    String city;

    Excep(int age, int income, int wheeler, String city) {
        this.age = age;
        this.income = income;
        this.wheeler = wheeler;
        this.city = city;
    }

    void validate() throws Invalid {
        if ((age < 18) || (age > 55)) {
            throw new Invalid("invalid age");
        }
        if ((income < 50000) || (income > 100000)) {
            throw new Invalid("invalid income");
        }
        if (wheeler != 4) {
            throw new Invalid("Invalid vehicle");
        }
        if (!((city.equals("pune")) || (city.equals("mumbai")) || (city.equals("banglore"))
                || (city.equals("chennai")))) {
            throw new Invalid("invalid city");
        }
    }

    void display() {
        System.out.println("Age:" + age);
        System.out.println("Income:" + income);
        System.out.println("Wheeler:" + wheeler);
        System.out.println("City:" + city);

    }
}

public class Pa3 {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("city:");
            String city;
            city = sc.nextLine();

            System.out.println("Age:");
            int age, wheeler, income;
            age = sc.nextInt();
            System.out.println("Income:");
            income = sc.nextInt();
            System.out.println("Wheel of vehicle:");
            wheeler = sc.nextInt();
            Excep ex = new Excep(age, income, wheeler, city);
            ex.validate();
            ex.display();
            sc.close();
        } catch (Invalid e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}
