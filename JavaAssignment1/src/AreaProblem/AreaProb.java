package AreaProblem;

public class AreaProb {
    private float length = 0;
    private float breadth = 0;

    public float getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public float FindArea(){
        return length*breadth;

    }
    public void display(){
        System.out.println("Length : "+ length);
        System.out.println("Breadth : "+ breadth);
        System.out.println("Area : "+ FindArea());
    }

}
