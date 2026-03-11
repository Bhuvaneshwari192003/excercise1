import java.util.Scanner;

public class StudentMarklist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int m1, m2, m3, total;
        double average;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        average = total / 3.0;

        System.out.println("\n--- Student Mark List ---");
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + m1);
        System.out.println("Mark 2: " + m2);
        System.out.println("Mark 3: " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

    }
}