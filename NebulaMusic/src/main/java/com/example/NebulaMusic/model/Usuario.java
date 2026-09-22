package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txt_psuedonimo;
    private String rad_genero;
    private String sel_suscripcion;
    private String fechaNacimiento;
    private String chk_terminos;
    private String comentarios;

    public Usuario(
            String nombre,
            String correo,
            String contrasenia,
            String txt_psuedonimo,
            String rad_genero,
            String sel_suscripcion,
            String fechaNacimiento,
            String chk_terminos,
            String comentarios
    ) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.txt_psuedonimo = txt_psuedonimo;
        this.rad_genero = rad_genero;
        this.sel_suscripcion = sel_suscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.chk_terminos = chk_terminos;
        this.comentarios = comentarios;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTxt_psuedonimo() {
        return txt_psuedonimo;
    }

    public void setTxt_psuedonimo(String txt_psuedonimo) {
        this.txt_psuedonimo = txt_psuedonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSel_suscripcion() {
        return sel_suscripcion;
    }

    public void setSel_suscripcion(String sel_suscripcion) {
        this.sel_suscripcion = sel_suscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
