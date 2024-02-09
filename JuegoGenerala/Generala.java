package JuegoGenerala;

import java.util.Arrays;
import java.util.HashMap;

public class Generala {
    public static void main(String[] args) {

        int[] generala = new int[5];

        for (int i = 0; i < 5; i++) {
            generala[i] = (int) (Math.random() * 5 + 1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(generala[i] + " ");
        }

        HashMap<Integer, Integer> frecuencia = new HashMap<>();

        Arrays.sort(generala);

        String cadena = Arrays.toString(generala).replace(", ", "").replace("[", "").replace("]", "");

        for (int i = 0; i < generala.length; i++) {
            if (frecuencia.containsKey(generala[i])) {
                frecuencia.put(generala[i], frecuencia.get(generala[i]) + 1);
            } else {
                frecuencia.put(generala[i], 1);
            }
        }

        boolean encontrar = false;

        for (int numero : frecuencia.keySet()) {
            int repes = frecuencia.get(numero);

            if (repes == 5) {
                System.out.println("GENERALA!!");
                encontrar = true;
                break;
            } else if (repes == 4) {
                System.out.println("POKER!!!");
                encontrar = true;
                break;
            } else if (repes == 3) {
                System.out.println("FULL!!!");
                encontrar = true;
                break;
            } else if (cadena.contains("12345") || cadena.contains("23456") || cadena.contains("34561")) {
                System.out.println("ESCALERA!!!");
                encontrar = true;
                break;
            }
        }
        if (!encontrar) {
            System.out.println("NADA");
        }
    }
}
