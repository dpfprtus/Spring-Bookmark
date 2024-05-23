package jaram.bookmark.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String keyword;
}
