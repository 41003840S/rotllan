package com.project.rotllan.pojos;

public class Vino {

    String imagen;
    String nombre;
    String cosecha;  //1990
    String grados;  //13.5%
    String coupatge; //65% garnacha,
    String descripcion;
    String aroma;
    String sabor;
    String color;
    String comoServir;
    String cuandoServir;
    String elaboracion;

    public Vino() {
    }

    public Vino(String imagenVino, String nombre, String cosecha, String grados, String coupatge, String descripcion) {
        this.imagen = imagenVino;
        this.nombre = nombre;
        this.cosecha = cosecha;
        this.grados = grados;
        this.coupatge = coupatge;
        this.descripcion = descripcion;
    }


    public String getImagenVino() {
        return imagen;
    }

    public void setImagenVino(String imagenVino) {
        this.imagen = imagenVino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCosecha() {
        return cosecha;
    }

    public void setCosecha(String cosecha) {
        this.cosecha = cosecha;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    public String getCoupatge() {
        return coupatge;
    }

    public void setCoupatge(String coupatge) {
        this.coupatge = coupatge;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComoServir() {
        return comoServir;
    }

    public void setComoServir(String comoServir) {
        this.comoServir = comoServir;
    }

    public String getCuandoServir() {
        return cuandoServir;
    }

    public void setCuandoServir(String cuandoServir) {
        this.cuandoServir = cuandoServir;
    }

    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "imagen='" + imagen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cosecha='" + cosecha + '\'' +
                ", grados='" + grados + '\'' +
                ", coupatge='" + coupatge + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", aroma='" + aroma + '\'' +
                ", sabor='" + sabor + '\'' +
                ", color='" + color + '\'' +
                ", comoServir='" + comoServir + '\'' +
                ", cuandoServir='" + cuandoServir + '\'' +
                ", elaboracion='" + elaboracion + '\'' +
                '}';
    }
}
