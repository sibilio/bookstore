package br.com.mcscloud.bookstoremanager.books.entity;

import br.com.mcscloud.bookstoremanager.author.entity.Author;
import br.com.mcscloud.bookstoremanager.entity.Auditable;
import br.com.mcscloud.bookstoremanager.publishers.entity.Publisher;
import br.com.mcscloud.bookstoremanager.users.entity.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 35)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;
}
