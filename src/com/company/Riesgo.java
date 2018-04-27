package com.company;

public class Riesgo {

    int riesgo = 0;
    int numJedi = 0;
    int total = 0;

    public int Porcentaje(int vciviles, int vresistencia, int vjedis) {
        System.out.println(vciviles + " " + vresistencia);
        int porcentaje = (vresistencia * vciviles) / 100 ;

        if (porcentaje > 1 && porcentaje < 5) {
            riesgo = 1;
        } else if(porcentaje > 5 ){
            riesgo = 5;
        }

        if (vjedis > 0) {
            numJedi = vjedis * 5;
        }

        total = riesgo + numJedi;

        return total;

    }

}
