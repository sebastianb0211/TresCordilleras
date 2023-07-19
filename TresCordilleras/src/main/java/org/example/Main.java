package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        String nombreCerveza;
        double gramosCebada;
        float temperaturaProceso;
        double porcentajeAlcohol;

        System.out.println("****Bienvenido a la cerveceria 3 cordilleras");
        System.out.print("ingrese el nombre de su cerveza: ");
        nombreCerveza=entradaTeclado.next();
        System.out.print("ingrese los gramos de cebada de la cerveza: ");
        gramosCebada= entradaTeclado.nextDouble();
        System.out.print("ingrese la temperatura del proceso: ");
        temperaturaProceso= entradaTeclado.nextFloat();

        //procesando las entradas

        porcentajeAlcohol=Math.sqrt(gramosCebada*temperaturaProceso);
        double resultadoRedondeado= Math.round(porcentajeAlcohol*100.0)/100.0;

        //Tomando una decision

        if (resultadoRedondeado>=10) {
            System.out.println("La cerveza no se puede vender por que el grado de alcohol es superior a 12%");
        }
        else {
            System.out.println("el porcentaje total de su cerveza "+nombreCerveza+" es igual a: "+porcentajeAlcohol+ " %");
            System.out.println("y su valor redondeado es: "+resultadoRedondeado);
        }

    }
}