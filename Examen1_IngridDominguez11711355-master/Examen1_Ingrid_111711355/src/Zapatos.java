
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
public class Zapatos extends Objeto{
    private int talla;
    private String suela;
    private int confort;

    public Zapatos() {
        super();
    }

    public Zapatos(int talla,  String suela, int confort, Color color, String descripcion, String marca, int tamano, int calidad, double precio, String dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.talla = talla;
        this.suela = suela;
        this.confort = confort;
    }

   

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        if(confort >= 1 && confort<=10){
            this.confort = confort;
        }
    }

    @Override
    public String toString() {
        return "Zapatos";
    }
    
    
    
}
