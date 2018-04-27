package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String respuesta = "";
        int respInt = 0;

        Registro arregloPlanetas[] = new Registro[1];


        while ( respInt != 4 )
        {
            System.out.println("Bienvenido a la Orden de la Resistencia");
            System.out.println("Seleccione alguna opcion");
            System.out.println("1. Registro De Planetas");
            System.out.println("2. Estadistica De Riesgo");
            System.out.println("3. Costo De Invasion.");
            System.out.println("4. Salir");

            respuesta = JOptionPane.showInputDialog("Ingrese su opcion \n");
            respInt = Integer.parseInt(respuesta);
            int porcentaje = 0;

            if (respInt == 1) {
                String pnombre = "";
                String pciviles = "";
                int iciviles = 0;

                String presistencia = "";
                int iresistencia = 0;

                String pJedis = "";
                int ijedi = 0;

                arregloPlanetas[0] = new Registro("Tierra", 300, 50, 1);

                for (int i = 0 ; i < arregloPlanetas.length; i++) {
                    System.out.println("Registro de Planeta " + i);
                    pnombre = JOptionPane.showInputDialog("Ingrese el nombre del planeta \n");
                    pciviles = JOptionPane.showInputDialog("Ingrese el numero de civiles \n");
                    iciviles = Integer.parseInt(pciviles);

                    presistencia = JOptionPane.showInputDialog("Ingrese el numero de resistencia \n");
                    iresistencia = Integer.parseInt(presistencia);

                    pJedis = JOptionPane.showInputDialog("Ingrese el numero de Jedis \n");
                    ijedi = Integer.parseInt(pJedis);

                    arregloPlanetas[i] = new Registro(pnombre, iciviles, iresistencia, ijedi);
                }


            }
            else if (respInt == 2) {
                Riesgo riesgo = new Riesgo();

                for (int j = 0; j < arregloPlanetas.length; j++) {
                    int numJedis = arregloPlanetas[j].jedi;

                    porcentaje = riesgo.Porcentaje(arregloPlanetas[j].civiles, arregloPlanetas[j].resistencia, arregloPlanetas[j].jedi);

                    if (porcentaje > 0) {
                        System.out.println("El planeta " + arregloPlanetas[j].nombre + " tiene un riesgo = " + porcentaje);
                    }

                }


            }
            else if(respInt == 3) {
                System.out.println("Parte 3 = " + porcentaje);
            }
        }

    }
}
