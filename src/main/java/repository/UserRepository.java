package repository;

import domain.User;

public interface UserRepository {
    void saveUser(User user);
    void update(Integer userId);
    String selectEmail(String email);
    Integer selectUserIdByEmail(String email);

}
