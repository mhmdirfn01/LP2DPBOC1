#include <iostream>
#include "TableDisplay.h"

int main() {
    TableDisplay tableDisplay;

    for (int i = 1; i <= 3; ++i) {
        Shirt shirt;
        std::cout << "Enter Shirt " << i << " details:\n";
        std::cout << "ID: ";
        std::cin >> shirt.idProduct;
        std::cout << "Name: ";
        std::cin >> shirt.name;
        std::cout << "Brand: ";
        std::cin >> shirt.brand;
        std::cout << "Price: ";
        std::cin >> shirt.price;
        std::cout << "Size: ";
        std::cin >> shirt.size;
        std::cout << "Material: ";
        std::cin >> shirt.material;
        std::cout << "Gender: ";
        std::cin >> shirt.gender;
        std::cout << "Color: ";
        std::cin >> shirt.color;
        std::cout << "Sleeve Type: ";
        std::cin >> shirt.sleeve_type;

        tableDisplay.listShirts.push_back(shirt);
    }

    // Displaying data using the TableDisplay class
    tableDisplay.tampil();

    return 0;
}
