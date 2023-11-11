package model;

public class CreateLibraryBookRequest {
    private int stock;

    // Construtor vazio
    public CreateLibraryBookRequest() {
    }

    // Construtor com parâmetros
    public CreateLibraryBookRequest(int stock) {
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

