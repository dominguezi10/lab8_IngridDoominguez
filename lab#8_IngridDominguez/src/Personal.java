/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Personal extends Persona {
    private String ocupacion;
    private String horario;
    private int tiempo_trabajando;
    private double sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String horario, int tiempo_trabajando, double sueldo, String nombre, int edad, int id, String sexo, String estado_civil, String contraseña) {
        super(nombre, edad, id, sexo, estado_civil, contraseña);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo_trabajando = tiempo_trabajando;
        this.sueldo = sueldo;
    }

    
    

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo_trabajando() {
        return tiempo_trabajando;
    }

    public void setTiempo_trabajando(int tiempo_trabajando) {
        this.tiempo_trabajando = tiempo_trabajando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return ""+super.toString();
    }
    
    
    
}
