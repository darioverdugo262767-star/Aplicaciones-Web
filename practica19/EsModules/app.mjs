import { saludar, despedida } from "./saludo.mjs";

console.log(saludar("Dario"));
console.log(despedida("Dario"));

import Estudiante from "./Estudiante";

let estudiante1 = new Estudiante();
estudiante1.nombre = "Dario";
estudiante1.carrera = "ISW";