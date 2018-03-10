package service.impl;

import domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import repository.LogRepository;
import service.LogService;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Override
    public List<Log> selectByUserId(Integer userId) {
        return logRepository.selectByUserId(userId);
    }

    @Override
    public void save(Log log) {
        logRepository.save(log);
    }
}
