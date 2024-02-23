#include <iostream>
#include <algorithm>
#include "TableDisplay.h"

void TableDisplay::tampil() {
    if (listShirts.empty()) {
        std::cout << "Data tidak ada" << std::endl;
    } else {
        int maxid = 2, maxName = 4, maxBrand = 6, maxPrice = 6, maxSize = 4, maxMaterial = 8, maxGender = 6, maxColor = 5, maxSleeveType = 10;

        for (const Shirt& shirt : listShirts) {
            maxid = std::max(maxid, std::to_string(shirt.idProduct).length());
            maxName = std::max(maxName, shirt.name.length());
            maxBrand = std::max(maxBrand, shirt.brand.length());
            maxPrice = std::max(maxPrice, std::to_string(shirt.price).length());
            maxSize = std::max(maxSize, shirt.size.length());
            maxMaterial = std::max(maxMaterial, shirt.material.length());
            maxGender = std::max(maxGender, shirt.gender.length());
            maxColor = std::max(maxColor, shirt.color.length());
            maxSleeveType = std::max(maxSleeveType, shirt.sleeve_type.length());
        }

        for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) std::cout << "-";
        std::cout << std::endl;

        std::cout << "| ID";
        for (int j = 2; j < maxid; j++) std::cout << " ";
        std::cout << " | Name";
        for (int j = 4; j < maxName; j++) std::cout << " ";
        std::cout << " | Brand";
        for (int j = 6; j < maxBrand; j++) std::cout << " ";
        std::cout << " | Price";
        for (int j = 6; j < maxPrice; j++) std::cout << " ";
        std::cout << " | Size";
        for (int j = 4; j < maxSize; j++) std::cout << " ";
        std::cout << " | Material";
        for (int j = 8; j < maxMaterial; j++) std::cout << " ";
        std::cout << " | Gender";
        for (int j = 6; j < maxGender; j++) std::cout << " ";
        std::cout << " | Color";
        for (int j = 5; j < maxColor; j++) std::cout << " ";
        std::cout << " | Sleeve Type";
        for (int j = 10; j < maxSleeveType; j++) std::cout << " ";
        std::cout << " |";
        std::cout << std::endl;

        for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) std::cout << "-";
        std::cout << std::endl;

        for (const Shirt& shirt : listShirts) {
            std::cout << "| " << shirt.idProduct;
            for (int j = std::to_string(shirt.idProduct).length(); j < maxid; j++) std::cout << " ";
            std::cout << " | " << shirt.name;
            for (int j = shirt.name.length(); j < maxName; j++) std::cout << " ";
            std::cout << " | " << shirt.brand;
            for (int j = shirt.brand.length(); j < maxBrand; j++) std::cout << " ";
            std::cout << " | " << shirt.price;
            for (int j = std::to_string(shirt.price).length(); j < maxPrice; j++) std::cout << " ";
            std::cout << " | " << shirt.size;
            for (int j = shirt.size.length(); j < maxSize; j++) std::cout << " ";
            std::cout << " | " << shirt.material;
            for (int j = shirt.material.length(); j < maxMaterial; j++) std::cout << " ";
            std::cout << " | " << shirt.gender;
            for (int j = shirt.gender.length(); j < maxGender; j++) std::cout << " ";
            std::cout << " | " << shirt.color;
            for (int j = shirt.color.length(); j < maxColor; j++) std::cout << " ";
            std::cout << " | " << shirt.sleeve_type;
            for (int j = shirt.sleeve_type.length(); j < maxSleeveType; j++) std::cout << " ";
            std::cout << " |";
            std::cout << std::endl;

            for (int j = 0; j < (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27); j++) std::cout << "-";
            std::cout << std::endl;
        }
    }
    std::cout << std::endl;
}
