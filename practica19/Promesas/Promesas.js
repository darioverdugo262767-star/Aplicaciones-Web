function obtenerDatos(){
    //Tiene tres estados
    //Pending -> Se realizando la peticion
    //Resolve/Exito -> Todo salio bien
    //Error/Reject -> Salio mal
    return new Promise((resolve, reject)=>{
        console.log("[obtenerDatos] Iniciando obtencion de datos");

        setTimeout(()=>{
            let exito = true;
            if(exito){
                resolve("Datos obtenidos correctamente");
            }else{
                reject("Ocurrio un error al solicitar los datos");
            }
        }, 2000)
    })
}

//Consumo basico de promesa con .then() y .catch()

console.log("Iniciando obtencion de datos");
obtenerDatos()
    .then((resultado)=>{
        console.log("Resultado obtenido: ", resultado);
    })
    .catch((error)=>{
        console.log("Error: ", error);
    });

function buscarUsuario(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            let exito = true;
            if(exito){
                let usuario = {
                    nombre: "Dario",
                    edad: 20
                };
                resolve(usuario);
            }else{
                reject("No se encontro el usuario");
            }
        }, 4000)
    })
}

console.log("ObtenerUsuario con encadenamiento");
buscarUsuario()
    .then(usuario=>{
        console.log("Usuario encontrado: ", usuario);
        return usuario.nombre.toUpperCase();
    })
    .then(nombreMayuscula =>{
        console.log("Procesando nombre: ", nombreMayuscula);
    })
    .catch(error =>{
        console.log("Error: ", error);
    })
    .finally(()=>{
        console.log("fin del flujo");
    });