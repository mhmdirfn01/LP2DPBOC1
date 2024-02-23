<?php

class Product {
    public $idProduct;
    public $name;
    public $brand;
    public $price;
}

class Clothing extends Product {
    public $size;
    public $material;
    public $gender;
}

class Shirt extends Clothing {
    public $color;
    public $sleeve_type;
}

class TableDisplay {
    public $listShirts = array();

    public function tampil() {
        if (count($this->listShirts) == 0) {
            echo "<p>Data tidak ada</p>";
        } else {
            echo "<table>";
            echo "<tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Brand</th>
                    <th>Price</th>
                    <th>Size</th>
                    <th>Material</th>
                    <th>Gender</th>
                    <th>Color</th>
                    <th>Sleeve Type</th>
                </tr>";

            foreach ($this->listShirts as $shirt) {
                echo "<tr>
                        <td>{$shirt->idProduct}</td>
                        <td>{$shirt->name}</td>
                        <td>{$shirt->brand}</td>
                        <td>{$shirt->price}</td>
                        <td>{$shirt->size}</td>
                        <td>{$shirt->material}</td>
                        <td>{$shirt->gender}</td>
                        <td>{$shirt->color}</td>
                        <td>{$shirt->sleeve_type}</td>
                    </tr>";
            }

            echo "</table>";
        }
    }
}

?>
