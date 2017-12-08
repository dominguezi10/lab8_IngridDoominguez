
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
public class Ropa extends Objeto {
    private String talla;
    private String material;
    private String pais;

    public Ropa() {
        super();
    }

    public Ropa(String talla, String material, String pais, Color color, String descripcion, String marca, int tamano, int calidad, double precio, String dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.talla = talla;
        this.material = material;
        this.pais = pais;
    }

    
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", pais=" + pais + '}';
    }
    
    
}
