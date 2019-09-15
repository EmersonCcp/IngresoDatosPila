package ingresodatospila;

public class Nodo {

    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String celular;
    Nodo sgte_nodo;
    
    public Nodo(String nom,String ape,String ced,String cel){
        this.nombre=nom;
        apellido=ape;
        cedula=ced;
        celular=cel;
        sgte_nodo=null;
    }
    
    
}
