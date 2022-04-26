/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Ricardo
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cuentahabiente[] ClienteNo = new Cuentahabiente[5];
        ClienteNo[0] = new Cuentahabiente("F9763971", "Victoria Moron", 12006.00f);
        ClienteNo[1] = new Cuentahabiente("R1536728", "George Bolaños", 220900.00f);
        ClienteNo[2] = new Cuentahabiente("K7456835", "Ahmed Calero", 45600.00f);
        ClienteNo[3] = new Cuentahabiente("U8365989", "Jonatan Pelaez", 63461767.00f);
        ClienteNo[4] = new Cuentahabiente("P0723568", "Lúcia Hurtado", 50978071.00f);
        int p=0;
        for (int i = 0; i < 5; i++) {
            System.out.println(ClienteNo[i]);
            ClienteNo[i].retirarDinero(4000+p);
            p +=12006;
            System.out.println("===================================================================================");
        }
        for (Cuentahabiente cuentahabiente : ClienteNo) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
}
