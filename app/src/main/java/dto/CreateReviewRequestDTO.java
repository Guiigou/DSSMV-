package dto;

public class CreateReviewRequestDTO {
    private boolean recommended;
    private String review;

    // Construtor vazio
    public CreateReviewRequestDTO() {
    }

    // Construtor com parâmetros
    public CreateReviewRequestDTO(boolean recommended, String review) {
        this.recommended = recommended;
        this.review = review;
    }

    // Getters e Setters

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    // Outros métodos, se necessário
}
