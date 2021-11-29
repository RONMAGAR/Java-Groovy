package BooksProblem;

public class BooksProbMain {

    public static void main(String[] args) {
        BooksProb arr[] = new BooksProb[2];
        arr[0] = new BooksProb();
        arr[1] = new BooksProb();

        MethodBook bd = new MethodBook();
        bd.createbook(arr[0],"Java Programming",500);
        bd.createbook(arr[1],"Let Us C",300);

        bd.showBooks(arr);






    }
}
