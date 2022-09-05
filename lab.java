package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class lab {
    public static void main(String[] args) {
        // №1
        int k = 0;
        int[] h = new int[7];
        for (int i = 6; i <= 18; i++){
            if (i % 2 == 0){
                h[k] = i;
                k = k + 1;
            }
        }

        // №2
        double[] x = new double[15];
        double mx = 6.0d;
        double mn = -14.0d;
        double difference = mx - mn;
        Random randomize = new Random();
        for (int i = 0; i < 15; i++){
            x[i] = mn + randomize.nextDouble(difference);
        }

        // №3
        double[][] b = new double[7][15];

        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 15; j++){
                if (h[i] == 6){
                    double num1 = (2.0d / (Math.pow(0.75d / (1.0d - Math.tan(x[j])), 3.0d) - 1.0d));
                    double num2 = Math.log(4.0d - Math.abs(x[j]));
                    double res1 = Math.pow(num1, num2);
                    b[i][j] = res1;
                }else{
                    if (h[i] == 8 || h[i] == 10 || h[i] == 12){
                        double num3 = Math.pow(Math.sin(x[j] / 2.0d), x[j]);
                        double num4 = 3.0d - Math.log(Math.pow(3.0d / (Math.abs(x[j]) + 1.0d), 2.0d));
                        double res2 = Math.pow(num3 * num4, 2.0d);
                        b[i][j] = res2;
                    }else{
                        double res3 = Math.tan(Math.sin(Math.pow(Math.log(Math.abs(x[j])), 4.0d / Math.cbrt(x[j]))));
                        b[i][j] = res3;
                    }
                }

            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 15; j++) {
                double result = b[i][j];
                String PrintResult = String.format("%.4f", result);
                System.out.println(PrintResult);
            }
        }

    }

}
