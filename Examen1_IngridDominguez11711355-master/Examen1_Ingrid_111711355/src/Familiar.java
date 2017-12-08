
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Familiar extends Persona{
    private String rol;
    private String trabajo;
    private double altura;
    private double peso;
    private ArrayList<Objeto> lista_objetos = new ArrayList();

    public Familiar() {
        super();
    }

    public Familiar(String rol, String trabajo, double altura, double peso, String nombre, int edad, int id, String sexo, String estado_civil, String contraseña) {
        super(nombre, edad, id, sexo, estado_civil, contraseña);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    
    

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Objeto> getLista_objetos() {
        return lista_objetos;
    }

    public void setLista_objetos(ArrayList<Objeto> lista_objetos) {
        this.lista_objetos = lista_objetos;
    }

    @Override
    public String toString() {
        return   rol ;
    }

    
}
