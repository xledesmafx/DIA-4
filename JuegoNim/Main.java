package JuegoNim;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        j1.setNombre(1);
        j2.setNombre(2);

        Pila p1 = new Pila();
        char letraa,letrab;
        int numa,numb;

        System.out.println(p1.toString());

        boolean sigue = true;
        while(sigue){
            letraa = j1.letra(1);
            numa = j1.numero(1);
            p1.comprobar(letraa,numa);

            System.out.println(p1.toString());

            if (p1.getSuma() == 0) {
                sigue = false;
                System.out.println("JUGADOR 1 GANASTE!!!");
                break;
            }

            letrab = j2.letra(2);
            numb = j2.numero(2);
            p1.comprobar(letrab,numb);

            System.out.println(p1.toString());

            if (p1.getSuma() == 0) {
                sigue = false;
                System.out.println("JUGADOR 2 GANASTE!!!");
                break;
            }
        }
    }




}
