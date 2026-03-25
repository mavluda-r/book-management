package org.example.bookmanagement.src.books;

import jakarta.persistence.*;
import lombok.*;
import org.example.bookmanagement.src.auditing.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "books")
public class BookEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer year;
    private LocalDate purchaseDate;
    private LocalDate startReadingDate;
    private LocalDate finishReadingDate;
    private Double price;

    @Column(length = 2000)
    private String note;

    private String publisher;
    private String language;
    private Integer pages;
}