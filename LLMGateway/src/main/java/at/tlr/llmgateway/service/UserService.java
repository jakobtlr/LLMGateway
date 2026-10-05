package at.tlr.llmgateway.service;

import at.tlr.llmgateway.dto.user.CreateUserDto;
import at.tlr.llmgateway.dto.user.UpdateUserDto;
import at.tlr.llmgateway.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public interface UserService {

    User createUser(CreateUserDto createUserDto);

    User updateUser(UpdateUserDto updateUserDto);

    User getById(int id);

    String deleteUser(User user);

}
