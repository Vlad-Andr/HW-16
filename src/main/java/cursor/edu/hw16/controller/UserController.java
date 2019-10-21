package cursor.edu.hw16.controller;

import cursor.edu.hw16.model.User;
import cursor.edu.hw16.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addAuthor(@RequestBody User user) {
        userService.addNewUser(user);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> all = userService.findAllUsers();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(all);
    }
}
