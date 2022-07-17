
/*Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

- Tu nombre (string)

- Tu edad (number)

- ¿Eres desarrollador? (boolean)

- Tu fecha de nacimiento (Date)

- Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)
*/
const nombre="Sebastian";
const edad=28;
const desarrollador=true;
const nacimiento= new Date(1994,01,14);
const libro ={
    titulo:"Pastas italianas",
    autor:"Donatto",
    fecha:new Date(2005,03,15),
    url:"Http:/urlAutor.com"
}

const lista = new Array(nombre,edad,desarrollador,nacimiento, libro);

console.log(lista)