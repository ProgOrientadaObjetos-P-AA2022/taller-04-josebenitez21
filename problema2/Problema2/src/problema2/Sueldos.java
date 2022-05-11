/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author M S I
 */
public class Sueldos {

    private String nombreE;
    private String apellidoE;
    private double sueldoB;
    private double sueldoTotal;
    private String cedula;
  

    public Sueldos() {
        nombreE = "Daniel";
        apellidoE = "Sarmiento";
        sueldoB = 425;
        cedula = "1102352148";

    }

    public Sueldos(String nom, String ape,
            String ced, double sueldoBase) {

        nombreE = nom;
        apellidoE = ape;
        cedula = ced;
        sueldoB = sueldoBase;

    }

    public void establecerNombreEmpleado(String c) {
        nombreE = c;
    }

    public void establecerApellidoEmpleado(String c) {
        apellidoE = c;
    }

    public void establecerCedulaEmpleado(String c) {
        cedula = c;
    }

    public void establecerSuedoBase(double c) {
        sueldoB = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoB + (sueldoB * 0.2);
    }

    public String obtenerNombreEmpleado() {
        return nombreE;
    }

    public String obtenerApellidoEmpleado() {
        return apellidoE;
    }

    public String obtenerCedulaEmpleado() {
        return cedula;
    }

    public double obtenerSuedoBase() {
        return sueldoB;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Sueldos de Docentes: \n"
                + "Nombre del Docente: %s\n"
                + "Apellido del Docente: %s\n"
                + "Cedula : %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n",
                obtenerNombreEmpleado(),
                obtenerApellidoEmpleado(),
                obtenerCedulaEmpleado(),
                obtenerSuedoBase(),
                obtenerSueldoTotal());

        return cadena;
    }

}
