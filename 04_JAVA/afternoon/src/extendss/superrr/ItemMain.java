package extendss.superrr;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("책", 10000, "채쌤", "JSP");
        Album album = new Album("앨범1집", 20000, "에스파");

        book.print();
        System.out.println();
        album.print();
    }
}
