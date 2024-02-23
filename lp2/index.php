<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shirt Details</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<?php
require_once('main.php');

// Creating hardcoded shirt details
$shirt1 = new Shirt();
$shirt1->idProduct = 1;
$shirt1->name = "Casual Shirt";
$shirt1->brand = "Brand A";
$shirt1->price = 29.99;
$shirt1->size = "M";
$shirt1->material = "Cotton";
$shirt1->gender = "Male";
$shirt1->color = "Blue";
$shirt1->sleeve_type = "Short Sleeve";

$shirt2 = new Shirt();
$shirt2->idProduct = 2;
$shirt2->name = "Formal Shirt";
$shirt2->brand = "Brand B";
$shirt2->price = 39.99;
$shirt2->size = "L";
$shirt2->material = "Polyester";
$shirt2->gender = "Male";
$shirt2->color = "White";
$shirt2->sleeve_type = "Long Sleeve";

$shirt3 = new Shirt();
$shirt3->idProduct = 3;
$shirt3->name = "Printed Shirt";
$shirt3->brand = "Brand C";
$shirt3->price = 25.99;
$shirt3->size = "S";
$shirt3->material = "Silk";
$shirt3->gender = "Female";
$shirt3->color = "Red";
$shirt3->sleeve_type = "Short Sleeve";

$tableDisplay = new TableDisplay();
$tableDisplay->listShirts = [$shirt1, $shirt2, $shirt3];

// Displaying data using the TableDisplay class
$tableDisplay->tampil();

?>

</body>
</html>
