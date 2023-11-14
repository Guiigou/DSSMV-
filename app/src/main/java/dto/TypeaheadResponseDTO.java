package dto;

import java.util.List;

public class TypeaheadResponseDTO {
    private List<String> authors;
    private List<String> subjects;
    private List<String> titles;

    // Construtor vazio
    public TypeaheadResponseDTO() {
    }

    // Construtor com parâmetros
    public TypeaheadResponseDTO(List<String> authors, List<String> subjects, List<String> titles) {
        this.authors = authors;
        this.subjects = subjects;
        this.titles = titles;
    }

    // Getters e Setters

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    // Outros métodos, se necessário
}
