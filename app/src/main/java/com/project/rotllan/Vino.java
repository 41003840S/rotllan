package com.project.rotllan;

public class Vino {

    int imagenVino;
    String nombre;
    String zona;
    String tipo; //Crianza,...
    int cosecha;  //1990
    double grados;
    String coupatge; //65% garnacha,
    String descripcion;
    int[] imagenesMaridaje;
    double precioTienda;

    public Vino(){}

    public Vino(int imagenVino, String nombre, String zona, String tipo, int cosecha, double grados, String coupatge, String descripcion, int[] imagenesMaridaje, double precioTienda) {
        this.imagenVino = imagenVino;
        this.nombre = nombre;
        this.zona = zona;
        this.tipo = tipo;
        this.cosecha = cosecha;
        this.grados = grados;
        this.coupatge = coupatge;
        this.descripcion = descripcion;
        this.imagenesMaridaje = imagenesMaridaje;
        this.precioTienda = precioTienda;
    }

    public int getImagenVino() {
        return imagenVino;
    }

    public void setImagenVino(int imagenVino) {
        this.imagenVino = imagenVino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosecha() {
        return cosecha;
    }

    public void setCosecha(int cosecha) {
        this.cosecha = cosecha;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
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

    public int[] getImagenesMaridaje() {
        return imagenesMaridaje;
    }

    public void setImagenesMaridaje(int[] imagenesMaridaje) {
        this.imagenesMaridaje = imagenesMaridaje;
    }

    public double getPrecioTienda() {
        return precioTienda;
    }

    public void setPrecioTienda(double precioTienda) {
        this.precioTienda = precioTienda;
    }
}
