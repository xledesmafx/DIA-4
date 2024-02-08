package JuegoNim;

import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);
    private String nombre;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(int nroJugador) {
        if (nroJugador == 1) {
            System.out.println("JUGADOR 1 INGRESE SU NOMBRE: ");
        }else
            {
            System.out.println("JUGADOR 2 INGRESE SU NOMBRE");
        }


        this.nombre = sc.next();
    }

    public char letra (int nroJugador){

        char eleccion;
        if (nroJugador == 1) {
            System.out.println(nombre + " ElIJA UNA LETRA: ");
            eleccion = sc.next().charAt(0);
            return eleccion;
        }else
        {
            System.out.println(nombre + " ELIJA UNA LETRA: " );
            eleccion = sc.next().charAt(0);
            return eleccion;
        }

    }

    public int numero (int nroJugador){
        int cant;

        if (nroJugador == 1) {
            System.out.println(nombre + "CUANTOS QUITARAS DE LA PILA?: ");
            cant =sc.nextInt();
            return cant;
        }else
        {
            System.out.println(nombre + "CUANTOS QUITARAS DE LA PILA?: " );
            cant =sc.nextInt();
            return cant;
        }
    }

    @Override
    public String toString() {
        return "Jugador{}";
    }
}
