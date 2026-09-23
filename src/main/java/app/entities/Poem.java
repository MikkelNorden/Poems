package app.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Poem {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(columnDefinition = "TEXT")
    private String content;

    public Poem(String title, String author, String description, String content) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.content = content;
    }
}