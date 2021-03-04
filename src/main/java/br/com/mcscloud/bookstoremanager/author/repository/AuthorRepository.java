package br.com.mcscloud.bookstoremanager.author.repository;

import br.com.mcscloud.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
