package BooksProblem;

public class TestBook {
    private Books[] book;

    public void createBook(int n){
        book = new Books[n];
        book[0] = new Books();
        book[0].setBookPrice(500);
        book[0].setBookTitle("Java Programming");
        book[1] = new Books();
        book[1].setBookPrice(300);
        book[1].setBookTitle("Let Us C");


    }
    public void showBook(){
        System.out.println("BookTitle\tBookPrice");
        for (Books b : book){
            System.out.println(b.getBookTitle()+"\t" +b.getBookPrice());
        }
    }

    public static void main(String[] args) {
        TestBook obj = new TestBook();
        obj.createBook(2);
        obj.showBook();
    }
}
