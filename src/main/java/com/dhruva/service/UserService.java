package com.dhruva.service;
import com.dhruva.exceptions.UserException;
import com.dhruva.model.User;
public interface UserService {
    public User findUserById(Long userId) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;
}
