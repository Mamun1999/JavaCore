package Inheritence2;

public class BoxPrice extends BoxWeight {
   double price;
    public BoxPrice() {
        super();
        this.price=2340;
    }

    public BoxPrice(double side, double weight) {
        super(side, weight);
    }

    public BoxPrice(Box box,double price) {
        super(box);
        this.price=price;
    }

    public BoxPrice(double l, double h, double w, double weight,double price) {
        super(l, h, w, weight);
        this.price=price;
    }
    public String toString(){
        return ""+l+"\n"+h+"\n"+w+"price:"+this.price;
    }
}
