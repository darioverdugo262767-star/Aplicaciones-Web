console.log("Seccion de funciones");


// Funcion declarada
function saludar(nombre="Invitado", edad=0) {
    return "Hola: " + nombre + " Edad: " + edad;
} 

console.log(saludar("Dario", 20));
console.log(saludar());

// Funcion anonima
let suma = function(num1, num2){
    return num1 + num2;
}

console.log("Resultado suma: " + suma(1, 63));

// Funcion flecha
let resta = (num1, num2) => {
    return num1 - num2;
}

console.log("Resultado resta: " + resta (5, 1));

// Funcion autoinvocada
(async function () {
    console.log("Hola desde funcion autoinvocada")
})();

console.log("Arreglos Dinamicos")

let numeros = [1, 2, 3];
console.log("Arreglo inicial ", numeros);

numeros.push(4);
console.log("Arreglo despues del push: ", numeros);

let ultimo = numeros.pop();
console.log("Arreglo despues del pop: ", numeros);

let primero = numeros.shift();
console.log("Arreglo despues del shift: ", numeros);

console.log("Objetos")

const persona = {
    nombre: "Dario",
    edad: 20,
    carrera: "ISW",
    hobbies: ["futbol", "jugar"]
};
console.log("Nombre: ", persona.nombre);
persona.nombre = "Giusepe";
console.log("Nombre modificado: ", persona.nombre);

console.log("1.- Inicio");
setTimeout(function(){
    console.log("2.- Paso un segundo");
}, 1000);
console.log("3.- Fin");


function prepararCafe(callback){
    console.log("Preparando cafe");
    setTimeout(function(){
        console.log("Cafe listo");
        callback();
    }, 2000)
}

prepararCafe(function(){
    console.log("Ahora si, a desayunar");
});
