package xyz.christophermedlin.seneca.services;

import java.util.List;

import xyz.christophermedlin.seneca.entities.CheckIn;
import xyz.christophermedlin.seneca.entities.User;

public interface CheckInService {
  void createCheckIn(CheckIn checkin);
  List<CheckIn> getCheckinsInMonth(int year, int month, User user);
}
