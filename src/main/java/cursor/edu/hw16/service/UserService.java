package cursor.edu.hw16.service;

import cursor.edu.hw16.model.User;
import cursor.edu.hw16.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void addNewUser(User user) {
        userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
}
