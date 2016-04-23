package com.project.rotllan.pojos;

public class Vino {

    String id;
    String imagenVino;
    String nombre;
    String cosecha;  //1990
    String grados;  //13.5%
    String coupatge; //65% garnacha,
    String descripcion;
    int[] imagenesMaridaje;
    double precioTienda;

    public Vino(){}

    public Vino(String id, String imagenVino, String nombre, String cosecha, String grados, String coupatge, String descripcion, int[] imagenesMaridaje, double precioTienda) {
        this.id = id;
        this.imagenVino = imagenVino;
        this.nombre = nombre;
        this.cosecha = cosecha;
        this.grados = grados;
        this.coupatge = coupatge;
        this.descripcion = descripcion;
        this.imagenesMaridaje = imagenesMaridaje;
        this.precioTienda = precioTienda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagenVino() {
        return imagenVino;
    }

    public void setImagenVino(String imagenVino) {
        this.imagenVino = imagenVino;
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
