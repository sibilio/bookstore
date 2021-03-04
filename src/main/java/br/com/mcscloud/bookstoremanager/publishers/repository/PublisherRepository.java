package br.com.mcscloud.bookstoremanager.publishers.repository;

import br.com.mcscloud.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
