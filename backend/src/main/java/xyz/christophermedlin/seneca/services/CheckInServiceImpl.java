package xyz.christophermedlin.seneca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.christophermedlin.seneca.entities.CheckIn;
import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.repositories.CheckInRepository;

@Service
public class CheckInServiceImpl implements CheckInService{

  @Autowired
  CheckInRepository repository;

  @Override
  public void createCheckIn(CheckIn checkin) {
    repository.save(checkin);
  }

  @Override
  public List<CheckIn> getCheckinsInMonth(int year, int month, User user) {
    if (month > 12 || month <= 0) {
      throw new IllegalArgumentException("month must be between 1 and 12");
    }

    return repository.findByYearAndMonth(year, month, user);
  }
}
