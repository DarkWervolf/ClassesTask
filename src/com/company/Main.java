package com.company;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(2.0, 3.0);

        System.out.println(p.returnLenghtTo0());

        Line l = new Line(p, 5.0,5.0);

        System.out.println(l.pointOnLine(5.0, 5.0));

        l.lenghtLine();

        System.out.println(l.angle());

        WryLine w = new WryLine(0.0, 2.0, 2.0, 0, 3.0, 4.7);

        w.printLine();
        System.out.println(w.pointOnLine(3.0, 4.7));

        System.out.println(w.angle());
    }
}
