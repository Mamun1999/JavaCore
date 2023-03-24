package Inheritence2;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight() {
        super();
    }

    public BoxWeight(double side,double weight) {
        super(side);
        this.weight=weight;
    }

    public BoxWeight(Box box) {
        super(box);
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight=weight;
    }

    public String toString(){
        return ""+l+"\n"+h+"\n"+w+"\n"+weight+"\n";
    }
}
