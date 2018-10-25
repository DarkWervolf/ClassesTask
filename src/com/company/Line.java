package com.company;

public class Line {
    protected static Point beginnig;
    protected static Point ending;

    public Line(Point b, Point e){
        beginnig = b;
        ending = e;
    }

    public Line(double x1, double x2, double y1, double y2){
        Point b = new Point(x1, y1);
        Point e = new Point(x2, y2);

        beginnig = b;
        ending = e;
    }

    public Line(double x1, double y1, Point e){
        Point b = new Point(x1, y1);
        beginnig = b;
        ending = e;
    }

    public Line(Point b, double x2, double y2){
        Point e = new Point(x2, y2);
        beginnig = b;
        ending = e;
    }


    public boolean pointOnLine(Point p)
    {
        if((p.returnX()) == (beginnig.returnX()) && (p.returnY()) == (beginnig.returnY())){
            return true;
        }
        else return false;
    }

    public boolean pointOnLine(double xx, double yy)
    {
        if((xx-beginnig.returnX())/(ending.returnX()-beginnig.returnX())==(yy-beginnig.returnY())/(ending.returnY()-beginnig.returnY())){
            return true;
        }
        else return false;
    }

    public void lenghtLine(){
        double lenL;
        lenL = Math.pow((ending.returnY() - beginnig.returnY()), 2) + Math.pow((ending.returnX() - beginnig.returnX()), 2);
        Math.sqrt(lenL);

        System.out.println(lenL);
    }

    public int angle()
    {
        if(beginnig.returnX() == ending.returnX()){return 90;}
        if(beginnig.returnY() == ending.returnY()){return 0;}
        else {
            double a =  ((ending.returnY()-beginnig.returnY())/(ending.returnX()-beginnig.returnX())*180)/Math.PI;
            return (int) Math.abs(a);
        }
    }

    public void printLine()
    {
       beginnig.showXY();
        System.out.print(" ");
       ending.showXY();
    }
}
