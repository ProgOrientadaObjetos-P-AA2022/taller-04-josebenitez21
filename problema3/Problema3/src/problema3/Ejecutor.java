/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

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
        MatriculaVehiculo mat = new MatriculaVehiculo();
        mat.calcularValorMatricula();

        String name = "1108541236";
        String brand = "Chevrolet";
        int manufac = 1989;
        double cost = 10245.67;

        MatriculaVehiculo mat1 = new MatriculaVehiculo(name, brand, manufac, cost);

        mat1.calcularValorMatricula();
        System.out.printf("%s\n%s\n", mat, mat1);
    }

}
