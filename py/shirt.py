# shirt_classes.py

class Product:
    def __init__(self):
        self.idProduct = 0
        self.name = ""
        self.brand = ""
        self.price = 0.0

class Clothing(Product):
    def __init__(self):
        super().__init__()
        self.size = ""
        self.material = ""
        self.gender = ""

class Shirt(Clothing):
    def __init__(self):
        super().__init__()
        self.color = ""
        self.sleeve_type = ""

class TableDisplay:
    def __init__(self):
        self.listShirts = []

    def tampil(self):
        if len(self.listShirts) == 0:
            print("Data tidak ada")
        else:
            maxid, maxName, maxBrand, maxPrice, maxSize, maxMaterial, maxGender, maxColor, maxSleeveType = 2, 4, 6, 6, 4, 8, 6, 5, 10

            for shirt in self.listShirts:
                maxid = max(maxid, len(str(shirt.idProduct)))
                maxName = max(maxName, len(shirt.name))
                maxBrand = max(maxBrand, len(shirt.brand))
                maxPrice = max(maxPrice, len(str(shirt.price)))
                maxSize = max(maxSize, len(shirt.size))
                maxMaterial = max(maxMaterial, len(shirt.material))
                maxGender = max(maxGender, len(shirt.gender))
                maxColor = max(maxColor, len(shirt.color))
                maxSleeveType = max(maxSleeveType, len(shirt.sleeve_type))

            print("-" * (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27))

            print(f"| ID{' ' * (maxid - 2)} | Name{' ' * (maxName - 4)} | Brand{' ' * (maxBrand - 6)} | Price{' ' * (maxPrice - 6)} | Size{' ' * (maxSize - 4)} | Material{' ' * (maxMaterial - 8)} | Gender{' ' * (maxGender - 6)} | Color{' ' * (maxColor - 5)} | Sleeve Type{' ' * (maxSleeveType - 10)} |")

            print("-" * (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27))

            for shirt in self.listShirts:
                print(f"| {shirt.idProduct}{' ' * (maxid - len(str(shirt.idProduct)))} | {shirt.name}{' ' * (maxName - len(shirt.name))} | {shirt.brand}{' ' * (maxBrand - len(shirt.brand))} | {shirt.price}{' ' * (maxPrice - len(str(shirt.price)))} | {shirt.size}{' ' * (maxSize - len(shirt.size))} | {shirt.material}{' ' * (maxMaterial - len(shirt.material))} | {shirt.gender}{' ' * (maxGender - len(shirt.gender))} | {shirt.color}{' ' * (maxColor - len(shirt.color))} | {shirt.sleeve_type}{' ' * (maxSleeveType - len(shirt.sleeve_type))} |")

                print("-" * (maxid + maxName + maxBrand + maxPrice + maxSize + maxMaterial + maxGender + maxColor + maxSleeveType + 27))

