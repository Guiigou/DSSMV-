package dto;

public class CreateLibraryBookRequestDTO {
    private int stock;

    // Construtor vazio
    public CreateLibraryBookRequestDTO() {
    }

    // Construtor com parâmetros
    public CreateLibraryBookRequestDTO(int stock) {
        this.stock = stock;
    }

    // Getters e Setters

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Outros métodos, se necessário
}
