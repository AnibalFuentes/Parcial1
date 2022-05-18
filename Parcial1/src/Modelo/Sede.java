package Modelo;

import java.util.Scanner;

public class Sede {

    //Sanner publico    
    static Scanner sc = new Scanner(System.in);

    //Atributos
    private String nombreSede;
    private String direccion;
    private String ciudad;
    private Cuenta cuentas[];
    private static final int MAX_CUENTAS = 10;

    //Constructor por defecto
    public Sede() {

    }

    public Sede(String nombreSede, String direccion, String ciudad) {
        this.nombreSede = nombreSede;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    //Contructor sobrecargado
    public Sede(String nombre, String direccion, String ciudad, Cuenta[] cuentas) {
        this.nombreSede = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.cuentas = cuentas;
    }

    //Gets
    public String getNombreSede() {
        return this.nombreSede;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }

    public static int getMAX_CUENTAS() {
        return MAX_CUENTAS;
    }

    //Sets
    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    //mostrar Sede (toString)
    public String mostarSede() {
        return "\nNombre:    " + nombreSede
                + "\nDireccion: " + direccion
                + "\nCiudad:    " + ciudad;
    }
}
