console.log("Hello World!");

let x2 = "Dario";
console.log("Valor inicial de x2: ", x2, " Tipo:", typeof x2);

x2 = 7;
console.log("Valor x2: ", x2, " Tipo:", typeof x2);

const constante = 10;

console.log("Valor constante: " + constante);

console.log("Operadores lógicos");

/**
 * JavaScript: cualquier valor puede ser verdadero (Truthy)
 * Hay valores que son Falsy:
 * 
 * -false
 * -0(cero)
 * -"" o " "
 * -null
 * -undefined
 * -NaN (Not a Number)
 */

let variableBool = false;
if(variableBool) {
    console.log("1. Entra a el bloque si/true");
}else{
    console.log("2.- Entra al bloque false");
}

let mensaje = "Hola";
if(mensaje) {
    console.log("3.- Entra al bloque si/true");
} else {
    console.log("4.- Entra al bloque false");
}

let numero6 = 6;
let string6 = "6"

console.log("Comparación débil (6 == '6')", numero6 == string6);
console.log("Comparación fuerte (6 == '6')", numero6 === string6);