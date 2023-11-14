package dto;

public class CheckoutDTO {
    private boolean active;
    private LibraryBookDTO book;
    private String createTimestamp;
    private String dueDate;
    private String id;
    private boolean overdue;
    private String updateTimestamp;
    private String userId;

    public CheckoutDTO() {
    }

    public CheckoutDTO(boolean active, LibraryBookDTO book, String createTimestamp, String dueDate,
                       String id, boolean overdue, String updateTimestamp, String userId) {
        this.active = active;
        this.book = book;
        this.createTimestamp = createTimestamp;
        this.dueDate = dueDate;
        this.id = id;
        this.overdue = overdue;
        this.updateTimestamp = updateTimestamp;
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LibraryBookDTO getBook() {
        return book;
    }

    public void setBook(LibraryBookDTO book) {
        this.book = book;
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

    public boolean isOverdue() {
        return overdue;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
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
