import java.util.ArrayList;

public class Library {
    private Book book;
    private int capacity;

    private ArrayList<Book> bookCount;

    public Library() {
        this.bookCount = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int stockCount() {

        return this.bookCount.size();
    }

    public void addBooktoLibrary() {

        this.bookCount.add(book);
    }

    public void stockFull() {

        this.capacity = 5;
    }

    public void addBookIfStockNotFull() {
        if (this.stockCount() <= 5) {
            this.addBooktoLibrary();
        }
        {
         stockFull();
        }

    }



}



//    public String addBookifStockNotFull() {
//        if (this.stockCount() <= 5) {
//            this.addBooktoLibrary();
//        }
//        {
//            return "Stock Full";
//        }