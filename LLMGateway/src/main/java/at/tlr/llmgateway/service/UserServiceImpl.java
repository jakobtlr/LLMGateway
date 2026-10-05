package at.tlr.llmgateway.service;

import at.tlr.llmgateway.dto.user.CreateUserDto;
import at.tlr.llmgateway.dto.user.UpdateUserDto;
import at.tlr.llmgateway.entity.User;
import at.tlr.llmgateway.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(CreateUserDto user) {
        return null;
    }


    @Override
    public User updateUser(UpdateUserDto updateUserDto) {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public String deleteUser(User user){
        return null;
    }
}
