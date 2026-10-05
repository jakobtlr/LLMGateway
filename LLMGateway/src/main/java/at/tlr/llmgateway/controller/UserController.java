package at.tlr.llmgateway.controller;

import at.tlr.llmgateway.dto.user.CreateUserDto;
import at.tlr.llmgateway.dto.user.UpdateUserDto;
import at.tlr.llmgateway.entity.User;
import at.tlr.llmgateway.service.UserService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto nUser) {
        User user = userService.createUser(nUser);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserDto nUser) {
        User user = userService.updateUser(nUser);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> getUser(@AuthenticationPrincipal User user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("{userid}")
    public ResponseEntity<User> getUserById(@PathVariable int userId) {
        User user = userService.getById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteUser(@AuthenticationPrincipal User user) {
        String response = userService.deleteUser(user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
