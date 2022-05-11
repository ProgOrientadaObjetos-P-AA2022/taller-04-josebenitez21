/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author M S I
 */
public class MatriculaVehiculo {

    private String cedula;
    private String marca;
    private int añoFa;
    private double valorVe;
    private double valorMatri;
    //private double promedio;

    public MatriculaVehiculo() {
        cedula = "1104252648";
        marca = "Toyota";
        añoFa = 2015;
        valorVe = 36527.23;

    }

    public MatriculaVehiculo(String ced, String marc,
            int fabric, double costoV) {

        cedula = ced;
        marca = marc;
        añoFa = fabric;
        valorVe = costoV;

    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAñofabricacion(int c) {
        añoFa = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVe = c;
    }

    public void calcularValorMatricula() {
        valorMatri = (valorVe * 0.002) * (2022 - añoFa);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAñofabricacion() {
        return añoFa;
    }

    public double obtenerValorVehiculo() {
        return valorVe;
    }

    public double obtenerValorMatricula() {
        return valorMatri;
    }

    @Override
    public String toString() {
        String cadena = String.format("Valor de la Matricula: \n"
                + "Cedula del propietario: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de Fabricacion del vehiculo : %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAñofabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());

        return cadena;
    }
}
