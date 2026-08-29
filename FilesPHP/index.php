<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio PHP</title>
</head>
<body>
    <h1>Ejercicio de PHP</h1>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Assumenda optio eius eveniet sint veritatis recusandae placeat, odio iusto porro voluptatibus quae eum accusamus cum earum laborum similique neque corrupti quam.</p>
</body>
</html>

<?php
// Arreglo de cadena
    $arreglo = ["Don Quijote de la Mancha", "Seda", "Pedro Páramo", "Ubik", "Fundación"];

// Ciclo FOR
//Arreglar el ciclo FOR para que imprima los títulos de los libros
    for($i = 0; $i < count($arreglo); $i++){
        echo "{$i} <br>";
    }

//Implementar un ciclo FOREACH para imprimir los títulos de los libros


?>