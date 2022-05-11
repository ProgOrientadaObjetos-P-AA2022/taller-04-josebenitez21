/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

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

        Calificaciones cal = new Calificaciones();
        cal.calcularPromedio();

        String nombreEst = "Anthony Benitez";
        double mater1 = 9.1;
        double mater2 = 8.9;
        double mater3 = 8.5;

        Calificaciones cal1 = new Calificaciones(nombreEst, mater1, mater2,
                mater3);

        cal1.calcularPromedio();
        System.out.printf("%s\n%s\n", cal, cal1);
    }

}
