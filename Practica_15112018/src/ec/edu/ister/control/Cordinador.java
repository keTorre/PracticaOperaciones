/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.control;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author PC6-LAB2
 */
public class Cordinador {

    Scanner entrada = new Scanner(System.in);
    Operaciones objOperaciones = new Operaciones();

    public void opcionesMenu() {

        System.out.println("Ingresa una opcion: \n"
                + "1.- sumar (met class)\n"
                + "2.- restar (met class \n"
                + "3.- division (met instancia)\n"
                + "4.- multiplicacion (met instancia)\n "
                + "5.- salir \n");

    }

    public void menuScanner() {
        int op = 0;
        do {
            opcionesMenu();
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    Operaciones.suma();
                    break;
                case 2:
                    System.out.println("la resta es :" + Operaciones.resta());
                    break;
                case 3:
                    objOperaciones.division();
                    break;
                case 4:
                    System.out.println("la multiplicacion es :" + objOperaciones.multiplicacion());
                    break;
            }

        } while (op != 5);
    }
}
