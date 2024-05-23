package jaram.bookmark.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Keyword keyword;

    @Column
    private String url;

    @Column
    private String title;
}
