
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
public class Persona {
    private String nombre;
    private int edad;
    private int id;
    private String sexo;
    private String estado_civil;
    private String contraseña;
    private ArrayList<String> lista = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, int edad, int id, String sexo, String estado_civil, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
