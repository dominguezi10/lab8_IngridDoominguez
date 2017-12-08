
import java.awt.Color;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class ObjetoHogar extends Objeto {
    private int tiempo;
    private String area;
    private String  instrucciones;
    private Date fecha;

    public ObjetoHogar() {
        super();
    }

    public ObjetoHogar(int tiempo, String area, String instrucciones, Date fecha, Color color, String descripcion, String marca, int tamano, int calidad, double precio, String dueño) {
        super(color, descripcion, marca, tamano, calidad, precio, dueño);
        this.tiempo = tiempo;
        this.area = area;
        this.instrucciones = instrucciones;
        this.fecha = fecha;
    }

    

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ObjetoHogar{" + "tiempo=" + tiempo + ", area=" + area + ", instrucciones=" + instrucciones + ", fecha=" + fecha + '}';
    }
    
    
    
}
