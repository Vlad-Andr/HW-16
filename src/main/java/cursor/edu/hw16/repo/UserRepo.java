package cursor.edu.hw16.repo;

import cursor.edu.hw16.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
