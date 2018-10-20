package com.company;

public class Point {
    private double x;
    private  double y;

    public Point(double xx, double yy){
        x = xx;
        y = yy;
    }

    public void addX(double xx){
        x = xx;
    }
    public void addY(double yy){
        x = yy;
    }

    public void addArguemnts(double xx, double yy){
        x = xx;
        y = yy;
    }

    public void showXY(){
        System.out.print("x" + "=" + x + " " + "y" + "=" + y + " ");
    }

    public double returnX(){
        return x;
    }

    public double returnY(){
        return y;
    }

    public double returnLenghtTo0()
    {
        double len0;
        len0 = Math.sqrt(x*x + y*y);
        return  len0;
    }
}
