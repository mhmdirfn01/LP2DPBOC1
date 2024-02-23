import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    public int idProduct;
    public String name;
    public String brand;
    public double price;
}

class Clothing extends Product {
    public String size;
    public String material;
    public String gender;
}

class Shirt extends Clothing {
    public String color;
    public String sleeve_type;
}

class TableDisplay {
    public List<Shirt> listShirts = new ArrayList<>();

    public void tampil() {
        if (listShirts.size() == 0) {
            System.out.println("Data tidak ada");
        } else {
            int maxid = 2, maxName = 4, maxBrand = 6, maxPrice = 6, maxSize = 4, maxMaterial = 8, maxGender = 6, maxColor = 5, maxSleeveType = 10;

            for (Shirt shirt : listShirts) {
                maxid = Math.max(maxid, String.valueOf(shirt.idProduct).length());
                maxName = Math.max(maxName, shirt.name.length());
                maxBrand = Math.max(maxBrand, shirt.brand.length());
                maxPrice = Math.max(maxPrice, String.valueOf(shirt.price).length());
                maxSize = Math.max(maxSize, shirt.size.length());
                maxMaterial = Math.max(maxMaterial, shirt.material.length());
                maxGender = Math.max(maxGender, shirt.gender.length());
                maxColor = Math.max(maxColor, shirt.color.length());
                maxSleeveType = Math.max(maxSleeveType, shirt.sleeve_type.length());
            }

            for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) {
                System.out.print("-");
            }
            System.out.println();

            System.out.print("| ID");
            for (int j = 2; j < maxid; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Name");
            for (int j = 4; j < maxName; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Brand");
            for (int j = 6; j < maxBrand; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Price");
            for (int j = 6; j < maxPrice; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Size");
            for (int j = 4; j < maxSize; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Material");
            for (int j = 8; j < maxMaterial; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Gender");
            for (int j = 6; j < maxGender; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Color");
            for (int j = 5; j < maxColor; j++) {
                System.out.print(" ");
            }
            System.out.print(" | Sleeve Type");
            for (int j = 10; j < maxSleeveType; j++) {
                System.out.print(" ");
            }
            System.out.println(" |");

            for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) {
                System.out.print("-");
            }
            System.out.println();

            for (Shirt shirt : listShirts) {
                System.out.print("| " + shirt.idProduct);
                for (int j = String.valueOf(shirt.idProduct).length(); j < maxid; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.name);
                for (int j = shirt.name.length(); j < maxName; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.brand);
                for (int j = shirt.brand.length(); j < maxBrand; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.price);
                for (int j = String.valueOf(shirt.price).length(); j < maxPrice; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.size);
                for (int j = shirt.size.length(); j < maxSize; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.material);
                for (int j = shirt.material.length(); j < maxMaterial; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.gender);
                for (int j = shirt.gender.length(); j < maxGender; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.color);
                for (int j = shirt.color.length(); j < maxColor; j++) {
                    System.out.print(" ");
                }
                System.out.print(" | " + shirt.sleeve_type);
                for (int j = shirt.sleeve_type.length(); j < maxSleeveType; j++) {
                    System.out.print(" ");
                }
                System.out.println(" |");

                for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}

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
