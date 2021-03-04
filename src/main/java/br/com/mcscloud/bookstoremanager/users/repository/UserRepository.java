package br.com.mcscloud.bookstoremanager.users.repository;

import br.com.mcscloud.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
