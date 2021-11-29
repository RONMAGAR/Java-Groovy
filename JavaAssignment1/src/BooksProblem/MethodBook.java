package BooksProblem;

public class MethodBook {
    public void createbook(BooksProb b, String s,float p){
        b.setBtitle(s);
        b.setPrice(p);
    }

    public void showBooks(BooksProb[] b){
        for (BooksProb book : b){
            System.out.println("-----------------------");
            System.out.println("Book Title : " + book.getBtitle());
            System.out.println("Book Price : " + book.getPrice() + "Rs.");
            System.out.println("-----------------------");
        }
    }
}
