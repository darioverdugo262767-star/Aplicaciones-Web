export default class Persona{

    #generarId(){
        return Math.floor(Math.Random() * 1000);
    }

    constructor(nombre = "", edad = 0){
        this.nombre = nombre;
        this.edad = edad;
        this.id = this.#generarId();
    }

    saludar(){
        return `Hola. soy ${this.nombre}`;
    }
}
