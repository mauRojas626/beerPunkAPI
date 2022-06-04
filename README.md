# beerPunkAPI

En el archivo application.properties, cambiar los datos de la base de datos MySQL que se vaya a utilizar.

Al ejecutar el programa se crea la Base de datos automaticamente.

Los APIs sn los siguientes:

https://localhost:8080/beers para listar todas las cervezas;
https://localhost:8080/beers/random para seleccionar una cerveza al azar;
https://localhost:8080/beers/{name} donde {name} es una palabra que si requere espacio se usa guión bajo (_) que devuelve las cervezas que incluyan la paalbra en el nombre.

