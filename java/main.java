import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TableDisplay tableDisplay = new TableDisplay();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; ++i) {
            Shirt shirt = new Shirt();
            System.out.println("Enter Shirt " + i + " details:");
            System.out.print("ID: ");
            shirt.idProduct = scanner.nextInt();
            System.out.print("Name: ");
            shirt.name = scanner.next();
            System.out.print("Brand: ");
            shirt.brand = scanner.next();
            System.out.print("Price: ");
            shirt.price = scanner.nextDouble();
            System.out.print("Size: ");
            shirt.size = scanner.next();
            System.out.print("Material: ");
            shirt.material = scanner.next();
            System.out.print("Gender: ");
            shirt.gender = scanner.next();
            System.out.print("Color: ");
            shirt.color = scanner.next();
            System.out.print("Sleeve Type: ");
            shirt.sleeve_type = scanner.next();

            tableDisplay.listShirts.add(shirt);
        }

        // Displaying data using the TableDisplay class
        tableDisplay.tampil();
    }
}
