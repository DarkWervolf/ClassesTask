package com.company;

public class WryLine extends Line {
    private Point zz;

    public WryLine(double x1, double x2, double y1, double y2, double z1, double z2) {
        super(x1, x2, y1, y2);
        zz = new Point(z1, z2);
    }


    @Override
    public void printLine() {
        beginnig.showXY();
        System.out.print(" ");
        ending.showXY();
        System.out.println(" " + "zx" + "=" + zz.returnX() + " " + "zy" + "=" + zz.returnY());
    }

    @Override
    public boolean pointOnLine(double xx, double yy) {
        boolean b1 = ((xx - beginnig.returnX()) / (ending.returnX() - beginnig.returnX()) == (yy - beginnig.returnY()) / (ending.returnY() - beginnig.returnY()));
        boolean b2 = ((xx - ending.returnX()) / (zz.returnX() - ending.returnX()) == (yy - ending.returnY()) / (zz.returnY() - ending.returnY()));
        if (b1 || b2) {
            return true;
        } else return false;
    }
}
