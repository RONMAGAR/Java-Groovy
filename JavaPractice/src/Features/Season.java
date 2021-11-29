package Features;

public enum Season {
    FAL,SUMMER,WINTER,RAINY;
    int number;
    Season(int number){  // by default constructor are private and u cannot changee to public

        this.number = number;
        System.out.println("Parameterized constructor");
    }
    Season(){
        System.out.println("Default Constructor!!");
    }

    void display(){
        System.out.println("Display methd in season enum : " + number);
    }
}
