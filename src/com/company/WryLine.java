package com.company;

public class WryLine extends Line {
    private Point zz;

    public WryLine(double x1, double x2, double y1, double y2, double z1, double z2){
        super(x1, x2, y1, y2);
        zz = new Point(z1, z2);
    }


    @Override
    public void printLine()
    {
        beginnig.showXY();
        System.out.print(" ");
        ending.showXY();
        System.out.println(" " + "zx" + "=" + zz.returnX() + " " + "zy" + "=" + zz.returnY());
    }

    @Override
    public boolean pointOnLine(double xx, double yy)
    {
        boolean b1 = ((xx-beginnig.returnX())/(ending.returnX()-beginnig.returnX())==(yy-beginnig.returnY())/(ending.returnY()-beginnig.returnY()));
        boolean b2 = ((xx-ending.returnX())/(zz.returnX()-ending.returnX())==(yy-ending.returnY())/(zz.returnY()-ending.returnY()));
        if(b1 || b2){
            return true;
        }
        else return false;
    }

    @Override
    public int angle()
    {
        double cosA;
        double lenghtA  = Math.abs(Math.pow((ending.returnY() - beginnig.returnY()), 2) + Math.pow((ending.returnX() - beginnig.returnX()), 2));
        Math.sqrt(lenghtA);
        double lenghtB  = Math.abs(Math.pow((zz.returnY() - ending.returnY()), 2)+ Math.pow((zz.returnX() - ending.returnX()), 2));
        Math.sqrt(lenghtB);
        double lenghtC  = Math.abs(Math.pow(((beginnig.returnY() - zz.returnY())), 2) + Math.pow((beginnig.returnX() - zz.returnX()), 2));
        Math.sqrt(lenghtC);

        cosA = (Math.pow(lenghtA, 2) + Math.pow(lenghtC, 2) - Math.pow(lenghtB, 2))/2*lenghtA*lenghtC;
        return (int) Math.toDegrees(cosA);
    }
}
