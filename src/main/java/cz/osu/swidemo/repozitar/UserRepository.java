package cz.osu.swidemo.repozitar;

import cz.osu.swidemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
    User findByFirstName(String firstName);

    User findByFirstNameAndLastName(String firstName, String lastName);
}
