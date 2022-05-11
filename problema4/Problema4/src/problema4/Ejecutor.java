/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        Cheques co = new Cheques();
        co.calcularComisionBanco();

        String name = "Nathaly Ocampo";
        String bankName = "Banco del Pichincha";
        double money = 4621.12;

        Cheques co1 = new Cheques(name, bankName, money);

        co1.calcularComisionBanco();
        System.out.printf("%s\n%s\n", co, co1);
    }

}
