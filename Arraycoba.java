import java.util.Scanner;
public class Arraycoba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input jumlah data
        System.out.println("Enter object :");
        int object = in.nextInt();

        Product[] p = new Product[object];
        for (int i= 0; i < p.length; i++) {
            System.out.println("Enter number : ");
            int number = in.nextInt();
            System.out.println("Enter Name : ");
            String name = in.nextLine();
            System.out.println("Enter quantity : ");
            int quantity = in.nextInt();
            System.out.println("Enter Pripce : ");
            double price = in.nextDouble();
            p[i] = new Product (number, name, quantity,price);
            p[i].print();
        }

        p[1] = new Product();
        CD[] c = new CD[5];
        c[4] = new CD();

    }
    
}
