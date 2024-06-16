package resolver;

import java.util.Scanner;

public class resolver {
    public static void main(String[] args) {


        double[] v = new double[5];
        double[] u = new double[5];

        v[0] = 2.0;
        v[1] = 3.0;
        v[2] = 4.0;
        v[3] = 5.0;
        v[4] = 6.0;

        int n = 5;

        for(int i = 1; i <= n; i++){
            u[i - 1] = v[i - 1] * i;
        }

        System.out.println(u[1]);
        System.out.println(u[3]);


    }
}

