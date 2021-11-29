package academy.devdojo.springboot2essentials.requests;

import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotEmpty;

public class AnimePostRequestBody {
    @NotEmpty(message = "O nome do anime não pode ser vazio")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
