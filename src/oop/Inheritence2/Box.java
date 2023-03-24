package Inheritence2;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l=4;
        this.h=5;
        this.w=6;
    }

    Box( double side){
        this.l=side;
        this.w=side;
        this.h=side;

    }

    Box(Box box){
        this.l=box.l;
        this.w=box.w;
        this.h=box.h;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

}
