package app.dtos;

import app.entities.Poem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PoemDTO {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("author")
    String author;
    @JsonProperty("description")
    String description;
    @JsonProperty("content")
    String content;

    public PoemDTO(Poem poem) {
        this.id = poem.getId();
        this.author = poem.getAuthor();
        this.description = poem.getDescription();
        this.content = poem.getContent();
    }
}