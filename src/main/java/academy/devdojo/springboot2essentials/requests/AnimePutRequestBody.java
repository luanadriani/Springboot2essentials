package academy.devdojo.springboot2essentials.requests;

import javax.validation.constraints.NotEmpty;

public class AnimePutRequestBody {
    private Long id;

    @NotEmpty(message = "O nome do anime não pode ser vazio")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
