# main.py
from shirt import Shirt, TableDisplay

if __name__ == "__main__":
    table_display = TableDisplay()

    for i in range(1, 4):
        shirt = Shirt()
        print(f"Enter Shirt {i} details:")
        shirt.idProduct = int(input("ID: "))
        shirt.name = input("Name: ")
        shirt.brand = input("Brand: ")
        shirt.price = float(input("Price: "))
        shirt.size = input("Size: ")
        shirt.material = input("Material: ")
        shirt.gender = input("Gender: ")
        shirt.color = input("Color: ")
        shirt.sleeve_type = input("Sleeve Type: ")

        table_display.listShirts.append(shirt)

    # Displaying data using the TableDisplay class
    table_display.tampil()
