package service;

import domain.User;

public interface UserService {
    void saveUser(User user);
    void update(Integer userId);
    String selectEmail(String email);
    Integer selectUserIdByEmail(String email);
}
