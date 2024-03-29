package co.codingnomads.spring.usermicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUsername(String username);
    User findById(Long id);

    User deleteById(Long id);

}