package com.company;

import java.util.ArrayList;
import java.util.Collections;

class MoneyParts {

    private static double[] DENOMINACIONES = {0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200};

    ArrayList<ArrayList<Double>> build(double monto){

        ArrayList<Integer> combinacion = new ArrayList<>();
        ArrayList<ArrayList<Integer>> posiblesCombinaciones = new ArrayList<>();

        int iDen= DENOMINACIONES.length-1;
        while (true){

            while (Math.round(sum(combinacion)*1000.0)/1000.0 < monto){
                combinacion.add(iDen);
            }
            if (Math.round(sum(combinacion)*1000.0)/1000.0 == monto){
                posiblesCombinaciones.add(new ArrayList<>(combinacion));
            }

            combinacion.set(combinacion.size()-1,combinacion.get(combinacion.size()-1)-1);

            while (combinacion.get(combinacion.size()-1) < 0){
                combinacion.remove(combinacion.size()-1);
                if(combinacion.isEmpty()) {
                    return convert(posiblesCombinaciones);
                }
                combinacion.set(combinacion.size()-1,combinacion.get(combinacion.size()-1)-1);
            }
            iDen = combinacion.get(combinacion.size()-1);
        }
    }

    private double sum(ArrayList<Integer> temp) {
        double sum = 0;
        for (int item:temp) {
            sum+= DENOMINACIONES[item];
        }
        return sum;
    }

    private ArrayList<ArrayList<Double>> convert(ArrayList<ArrayList<Integer>> resp) {
        ArrayList<ArrayList<Double>> response = new ArrayList<>();

        for (ArrayList<Integer> item:resp) {
            ArrayList<Double> temp = new ArrayList<>();
            for (int val:item) {
                temp.add(DENOMINACIONES[val]);
            }
            response.add(new ArrayList<>(temp));
        }
        Collections.reverse(response);
        return response;
    }
}
