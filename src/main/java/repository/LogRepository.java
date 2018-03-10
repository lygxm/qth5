package repository;

import domain.Log;

import java.util.List;

public interface LogRepository {

    List<Log> selectByUserId(Integer userId);
    void save(Log log);

}
