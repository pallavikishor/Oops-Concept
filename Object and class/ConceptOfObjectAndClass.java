public class ConceptOfObjectAndClass {
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



/*class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}*/


// Get: 
// Set:
// this: 


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




class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}