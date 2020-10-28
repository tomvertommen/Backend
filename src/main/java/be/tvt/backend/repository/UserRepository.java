package be.tvt.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.tvt.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
