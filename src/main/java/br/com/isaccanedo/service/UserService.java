package br.com.isaccanedo.service;

import br.com.isaccanedo.model.User;
import br.com.isaccanedo.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
