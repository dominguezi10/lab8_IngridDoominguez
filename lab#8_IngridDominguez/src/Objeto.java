
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Objeto{
    private Color color;
    private String descripcion;
    private String marca;
    private int tamano;
    private int calidad;
    private double precio;
    private String dueño;

    public Objeto() {
    }

    public Objeto(Color color, String descripcion, String marca, int tamano, int calidad, double precio, String dueño) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        setCalidad(calidad);
        this.precio = precio;
        this.dueño = dueño;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        if(calidad>=1 && calidad<=10){
           this.calidad = calidad; 
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
    
}
