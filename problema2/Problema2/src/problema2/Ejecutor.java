/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author M S I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Sueldos suel = new Sueldos();
        suel.calcularSueldoTotal();

        String nombre = "David";
        String apellido = "Orellana";
        String cedu = "1104494851";
        double sueldo = 425;

        Sueldos suel1 = new Sueldos(nombre, apellido, cedu, sueldo);

        suel1.calcularSueldoTotal();
        System.out.printf("%s\n%s\n", suel, suel1);
    }

}
