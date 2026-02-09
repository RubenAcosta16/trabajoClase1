package com.mycompany.ej1temasselectos;

import java.util.Random;

/**
 *
 * @author 1511r
 */
public class Ej1temasselectos {

    public static void main(String[] args) {
       Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int numero = random.nextInt(100) + 1;

            if (numero % 2 == 0) {
                System.out.println(numero + " es PAR");
            } else {
                System.out.println(numero + " es IMPAR");
            }
        }
    }
}
