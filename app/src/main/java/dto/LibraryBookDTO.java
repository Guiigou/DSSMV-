package dto;

public class LibraryBookDTO {
    private int available;
    private BookDTO book;
    private int checkedOut;
    private String isbn;
    private LibraryDTO library;
    private int stock;

    public LibraryBookDTO() {
    }

    public LibraryBookDTO(int available, BookDTO book, int checkedOut, String isbn,
                          LibraryDTO library, int stock) {
        this.available = available;
        this.book = book;
        this.checkedOut = checkedOut;
        this.isbn = isbn;
        this.library = library;
        this.stock = stock;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public BookDTO getBook() {
        return book;
    }

    public void setBook(BookDTO book) {
        this.book = book;
    }

    public int getCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(int checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LibraryDTO getLibrary() {
        return library;
    }

    public void setLibrary(LibraryDTO library) {
        this.library = library;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
