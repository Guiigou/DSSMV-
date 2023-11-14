package dto;

public class AuthorDTO {
    private String alternateNames;
    private String bio;
    private String birthDate;
    private String deathDate;
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(String alternateNames, String bio, String birthDate, String deathDate, String id, String name) {
        this.alternateNames = alternateNames;
        this.bio = bio;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.id = id;
        this.name = name;
    }

    public String getAlternateNames() {
        return alternateNames;
    }

    public void setAlternateNames(String alternateNames) {
        this.alternateNames = alternateNames;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

