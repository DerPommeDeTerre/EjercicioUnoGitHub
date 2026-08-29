<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio POST</title>
</head>

<body>
    <h2>Ejercicio POST</h2>

    <form action="post.php" method="POST">
        <label for="cancion">Canción: </label>
        <input type="text" id="cancion" name="cancion">
        <br>

        <label for="artista">Artista: </label>
        <input type="text" id="artista" name="artista">
        <br>

        <label for="disco">Disco: </label>
        <input type="text" id="disco" name="disco">
        <br>

        <input type="submit" value="Guardar">
    </form>
</body>

</html>
<?php
    //Imprimir en pantalla los valores clave:valor del POST
    //recorriendo el POST con un FOREACH

    //Ejemplo
    if(!empty($_POST)){
        //Función FOREACH
    }
?>