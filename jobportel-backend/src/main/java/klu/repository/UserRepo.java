package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import klu.model.user;

@Repository
public interface UserRepo extends JpaRepository<user, String> {
    
}