package com.company;

import java.util.Scanner;

public class Main {
    static int a=0;

    public static void main(String[] args) {
        /*
        Point p = new Point(2.0, 3.0);

        System.out.println(p.returnLenghtTo0());

        Line l = new Line(p, 5.0,5.0);

        System.out.println(l.pointOnLine(5.0, 5.0));

        l.lenghtLine();

        System.out.println(l.angle());

        WryLine w = new WryLine(0.0, 2.0, 2.0, 0, 3.0, 4.7);

        w.printLine();
        System.out.println(w.pointOnLine(3.0, 4.7));

        System.out.println(w.angle());*/

                Scanner scanner = new Scanner(System.in);
                int n;
                n = scanner.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++){
                    a[i] = scanner.nextInt();
                }
                for(int i = a.length - 1; i >= 0; i--){
                    if (a[i] == 0){
                        for (int j = 0; j < a.length - 1; j++) {
                            if (a[j] == 0) {
                                int temp = a[j + 1];
                                a[j + 1] = a[j];
                                a[j] = temp;
                            }
                        }
                    }
                }


                for(int i = 0; i < a.length; i++){
                    System.out.print(a[i] + " ");
                }
    }
}
