package myPack;

public abstract class Instrument {
    abstract void play();

    public static void main(String[] args) {
        Instrument arr[] = new Instrument[10];
         arr[0] = new Piano();
         arr[1] = new Piano();
        arr[2] = new Piano();
         arr[3] = new Flute();
         arr[4] = new Flute();
         arr[5] = new Flute();
         arr[6] = new Guitar();
         arr[7] = new Guitar();
         arr[8] = new Guitar();
         arr[9] = new Guitar();

        for(int i = 0;i < arr.length;i++){
            if (arr[i] instanceof Piano){
                arr[i].play();
                System.out.println("arr[" + i +"]" + "is instance of Piano");
            }
            else {
                System.out.println("arr[" + i +"]" + "is not instance of Piano");
            }
        }


        Instrument p = new Piano();
        p.play();

        Instrument f = new Flute();
        f.play();

        Instrument g = new Guitar();
        g.play();


    }

}
