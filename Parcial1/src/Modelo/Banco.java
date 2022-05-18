package Modelo;

import static Modelo.Sede.sc;

public class Banco {

    //Atributos de instancia
    private String nombreBanco;
    private Sede sedes[];
    public static final int MAX_SEDES = 10;

    //Constructor por defecto
    public Banco() {

    }

    //Contructor sobrecargado
    public Banco(String nobmre, Sede[] sedes) {
        this.nombreBanco = nobmre;
        this.sedes = sedes;
    }

    // Gets 
    public String getNombreBanco() {
        return nombreBanco;
    }

    public Sede[] getSedes() {
        return sedes;
    }

    //Sets
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }

    //toString
    @Override
    public String toString() {
        return "Banco{" + "nobmre=" + nombreBanco + ", sedes=" + sedes + '}';
    }

    public void crearSede() {
        //Atributos sede
        String nombre;
        String direccion;
        String ciudad;

        //Pedimos la cantidad de sedes a crear
        System.out.println("\n[OPCIÓN 1: CREAR SEDE BANCARIA]");
        System.out.print("¿CUANTAS SEDES DESEA CREAR?: ");
        int cant = sc.nextInt();

        //Creamos un vector de sedes
        Sede[] sedes = new Sede[cant];

        for (int i = 0; i < sedes.length; i++) {
            //Pedir datos de la sede
            System.out.println("\n|--------> [SEDE: " + (i + 1) + "]");
            System.out.print("NOMBRE:    [");
            nombre = sc.next();
            System.out.print("DIRECCIÓN: [");
            direccion = sc.next();
            System.out.print("CIUDAD:    [");
            ciudad = sc.next();
            System.out.println("|--------> [SEDE BANCARIA CREADA]\n");

            //Creamos sede
            sedes[i] = new Sede(nombre, direccion, ciudad);
        }//Termina el bucle

        //Mostrar cuando sean más de 2 sedes
        if (sedes.length >= 2) {
            System.out.println("[SEDES CREADAS CORRECTAMENTE]");
        }

        for (Sede sede : sedes) {
            System.out.println(sede.mostarSede());
        }
    }

}
