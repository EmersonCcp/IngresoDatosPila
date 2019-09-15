package ingresodatospila;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner in = new Scanner(System.in);
        String nombre, apellido, cedula, celular;
        int seleccion = 0;
        while (seleccion < 1 || seleccion > 2) {
            System.out.println("Desea realizar la operacion?\n1. Si  2. No");
            seleccion = in.nextInt();
            if (seleccion == 1) {
                nombre = in.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = in.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellido = in.nextLine();
                System.out.println("Ingrese el C.I: ");
                cedula = in.nextLine();
                System.out.println("Ingrese el telefono: ");
                celular = in.nextLine();
                pila.InsertarDatos(nombre, apellido, cedula, celular);
            } else if (seleccion == 2) {
                break;
            }
            seleccion = 0;
        }

        if (!pila.PilaVacia()) {
            System.out.println("Elementos de la Pila\n");
            System.out.println("----------------------");
            pila.ImprimirDatos();
        } else {
            System.out.println("Pila Vacia!");
        }

    }

}
