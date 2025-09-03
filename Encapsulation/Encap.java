//Encapsulation: It is defined as the wrapping up of data and mettods under a single unit. It is also empliment data hiding.

package Encapsulation;

public class Encap {
    public static void main(String[] args){
        Pen p1 = new Pen(); // we have created a pen onject called p1

        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        //p1.setColor("Yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}