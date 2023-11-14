package dto;

import java.util.List;

public class CheckedOutBookDTO {
    private boolean active;
    private BookDTO book;
    private String bookId;
    private String createTimestamp;
    private String dueDate;
    private String id;
    private String libraryAddress;
    private String libraryCloseTime;
    private String libraryId;
    private String libraryName;
    private String libraryOpenTime;
    private String updateTimestamp;
    private String userId;

    // Construtor vazio
    public CheckedOutBookDTO() {
    }

    // Construtor com parâmetros
    public CheckedOutBookDTO(boolean active, BookDTO book, String bookId, String createTimestamp,
                             String dueDate, String id, String libraryAddress,
                             String libraryCloseTime, String libraryId, String libraryName,
                             String libraryOpenTime, String updateTimestamp, String userId) {
        this.active = active;
        this.book = book;
        this.bookId = bookId;
        this.createTimestamp = createTimestamp;
        this.dueDate = dueDate;
        this.id = id;
        this.libraryAddress = libraryAddress;
        this.libraryCloseTime = libraryCloseTime;
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.libraryOpenTime = libraryOpenTime;
        this.updateTimestamp = updateTimestamp;
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public BookDTO getBook() {
        return book;
    }

    public void setBook(BookDTO book) {
        this.book = book;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public String getLibraryCloseTime() {
        return libraryCloseTime;
    }

    public void setLibraryCloseTime(String libraryCloseTime) {
        this.libraryCloseTime = libraryCloseTime;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryOpenTime() {
        return libraryOpenTime;
    }

    public void setLibraryOpenTime(String libraryOpenTime) {
        this.libraryOpenTime = libraryOpenTime;
    }

    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
