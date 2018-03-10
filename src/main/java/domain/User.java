package domain;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String email;
    private String password;
    private Integer count;
    private Timestamp lastLoginTime;

    public User() {
    }

    public User(String email, String password, Integer count, Timestamp lastLoginTime) {
        this.email = email;
        this.password = password;
        this.count = count;
        this.lastLoginTime = lastLoginTime;
    }

    public User(Integer id, String email, String password, Integer count, Timestamp lastLoginTime) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.count = count;
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", count=" + count +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}
