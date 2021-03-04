package br.com.mcscloud.bookstoremanager.books.repository;

import br.com.mcscloud.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
