package service;

import domain.Log;

import java.util.List;

public interface LogService {

    List<Log> selectByUserId(Integer userId);
    void save(Log log);
}
