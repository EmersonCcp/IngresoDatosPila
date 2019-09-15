package ingresodatospila;

public class Pila {

    private Nodo UltimoValorIngresado;
    int tamaño = 0;

    public Pila() {
        UltimoValorIngresado = null;
        tamaño = 0;
    }

    //Metodo para insertar un elemento a la pila
    public void InsertarDatos(String nom, String ape, String ced, String cel) {
        Nodo nuevo_nodo = new Nodo(nom, ape, ced, cel);
        nuevo_nodo.sgte_nodo = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }

    //Metodo para imprimir los elementos de la pila

    public void ImprimirDatos() {
        Nodo recorrido = UltimoValorIngresado;
        while (recorrido != null) {
            System.out.println("Nombre: " + recorrido.nombre);
            System.out.println("Apellido: " + recorrido.apellido);
            System.out.println("C.I: " + recorrido.cedula);
            System.out.println("Telefono: " + recorrido.celular);
            System.out.println("-------------------------------");
            recorrido = recorrido.sgte_nodo;
        }
    }

    //Metodo para saber si la pila esta vacia
    public boolean PilaVacia() {
        if (tamaño == 0) {
            return true;
        } else {
            return false;
        }

    }
}
