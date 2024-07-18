package com.programer;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos
        int numero1 = 30;
        int numero2 = 10;
        int resutadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero1 / numero2;
        System.out.println("la suma es: "+ resutadoSuma);
        System.out.println("la resta es: "+ resultadoResta);
        System.out.println("la multiplicación es: "+ resultadoMultiplicacion);
        System.out.println("la division es: "+ resultadoDivision);

          /*
    # Comparadores
    # > Mayor que
    # < Menor que
    # >= Mayor e igual que
    # <= Menor e igual que
    # != diferente que
    # == igual a que
     */

        boolean resultado1 = numero1 > numero2;
        System.out.println("la respuesta 1 es; "+ resultado1);

        boolean resultado2 = numero1 < numero2;
        System.out.println("la respuesta 2 es; "+ resultado2);

        boolean resultado3 = numero1 >= numero2;
        System.out.println("la respuesta 3 es; "+ resultado3);

        boolean resultado4 = numero1 <= numero2;
        System.out.println("la respuesta 4 es; "+ resultado4);

        boolean resultado5 = numero1 != numero2;
        System.out.println("la respuesta 5 es; "+ resultado5);

        boolean resultado6 = numero1 == numero2;
        System.out.println("la respuesta 6 es; "+ resultado6);


     /*
     # Operadores logicos:
     # AND &&
     # OR ||
      */

        int  edad = 14;
        boolean resltado7 = edad >= 15 && edad <= 26;
        System.out.println(resltado7);

        boolean resltado8 = edad >= 15 || edad <= 26;
        System.out.println(resltado8);




    }

}
