package service.impl;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UserRepository;
import service.UserService;

import javax.annotation.security.RolesAllowed;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    @Secured({"ROLE_USER", })
    @RolesAllowed({"ROLE_USER",})
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    @Override
    public void update(Integer userId) {
        userRepository.update(userId);
    }

    @Override
    public String selectEmail(String email) {
        return userRepository.selectEmail(email);
    }

    @Override
    public Integer selectUserIdByEmail(String email) {
        return userRepository.selectUserIdByEmail(email);
    }
}
