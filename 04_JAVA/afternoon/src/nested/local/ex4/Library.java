package nested.local.ex4;

import java.util.Scanner;

public class Library {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;
    Scanner scanner = new Scanner(System.in);

    public Library() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    public void addBook() {
        if (bookCount < LIBRARY_SIZE) {
            System.out.print("책 제목을 입력 하세요: ");
            String title = scanner.nextLine();
            System.out.print("책 저자를 입력 하세요: ");
            String author = scanner.nextLine();

            Book newBook = new Book(title, author);

            books[bookCount] = newBook;
            bookCount++;
        } else {
            System.out.println("더 이상 추가할 수 없습니다!");
        }
    }

    public void showBooks() {
        if (bookCount == 0) {
            System.out.println("현재 책이 없습니다!");
        } else {
            System.out.println("현재 라이브러리의 책 목록 : " + bookCount);

            for (int i = 0; i < bookCount; i++) {
                System.out.println((i + 1) + ". 제목 : " + books[i].title + " / 저자 : " + books[i].author);
            }
        }
    }

    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

//        public String getTitle() {
//            return title;
//        }
//
//        public String getAuthor() {
//            return author;
//        }
    }
}
