package Vista;

import Modelo.*;
import java.util.Scanner;

public class PruebaBanco {

    //Scanner general   
    static Scanner sca = new Scanner(System.in);

    //Crear Sede
    public static void crearSede() {
        //Atributos sede
        String nombre;
        String direccion;
        String ciudad;

        //sedes a crear
        System.out.println("\n[OPCIÓN 2: CREAR SEDE BANCARIA]");
        System.out.print("¿CUANTAS SEDES DESEA CREAR?: ");
        int cantSedes = sca.nextInt();
        if (cantSedes <= 10) {
            //Creamos un vector de sedes
            Sede[] sedes = new Sede[cantSedes];

            for (int i = 0; i < sedes.length; i++) {
                // datos de la sede
                System.out.println("\n|--------> [SEDE: " + (i + 1) + "]");
                System.out.print("NOMBRE:    [");
                nombre = sca.next();
                System.out.print("DIRECCIÓN: [");
                direccion = sca.next();
                System.out.print("CIUDAD:    [");
                ciudad = sca.next();
                System.out.println("|--------> [SEDE BANCARIA CREADA]");
                //Creamos sede

                sedes[i] = new Sede(nombre, direccion, ciudad);
            }//Termina el crear sedes

            System.out.println("\nQUIERE VER LAS SEDES BANCARIAS CREADAS?\n1. SI\n0. NO");
            System.out.print("INGRESE UNA OPCIÓN: ");
            int n = sca.nextInt();
            if (n == 1) {
                for (int i = 0; i < sedes.length; i++) {
                    System.out.println("\n[SEDE " + (i + 1) + "]" + sedes[i].mostarSede());
                }
            }
        } else {
            System.out.println(" LA CANTIDAD MAXIMA DE SEDES BANCARIAS: 10");
            enter();
        }
    }

    //Abrir cuenta
    public static void abrirCuenta() {
        System.out.println("\n[OPCIÓN 2: ABRIR CUENTA BANCARIA]");
    }

    //Mostrar sedes
    public static void mostrarSedes() {
        System.out.println("\n[OPCIÓN 3: MOSTRAR SEDE BANCARIA]");
    }

    // ENTER para continuar
    public static void enter() {
        System.out.println("¡ERROR! OPCIÓN INCORRECTA");
        System.out.print("PRESIONE ENTER PARA VOLVER A INTENTALO...");

        
        String seguir;
        Scanner teclado = new Scanner(System.in);
        try {
            seguir = teclado.nextLine();
        } catch (Exception e) {
        }
    }

    //Terminar la ejecución del progrma
    public static void cerrar() {
        System.out.println("[EL GESTOR BANCARIO HA FINALIZADO]");
        System.exit(0);
    }

    //Clase main
    public static void main(String[] args) {
        // varaibles del menú
        int opcion = 0;

        do {
            //Menú
            System.out.println("\n[GESTOR BANCARIO]");
            System.out.println("1. CREAR SEDE BANCARIA");
            System.out.println("2: ABRIR CUENTA BANCARIA");
            System.out.println("3: MOSTRAR SEDE BANCARIA");
            System.out.println("4: SALIR");
            System.out.print("INGRESE UNA OPCIÓN: ");

            //Se ingresa la opción por Scanner
            int n = sca.nextInt();

            //se jecuta el caso según opción ingresada
            switch (n) {
                case 1:
                    crearSede();
                    break;
                case 2:
                    abrirCuenta();
                    break;
                case 3:
                    mostrarSedes();
                    break;
                case 4:
                    cerrar();
                    break;
                default:
                    enter();
            }
        } while (opcion != 4);
    }//se Finaliza el MAIN
}
