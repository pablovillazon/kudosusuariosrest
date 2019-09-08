package be.jkin.kudosusuariosrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.jkin.kudosusuariosrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
