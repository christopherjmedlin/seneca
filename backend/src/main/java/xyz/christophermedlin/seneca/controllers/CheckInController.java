package xyz.christophermedlin.seneca.controllers;

import java.security.Principal;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.christophermedlin.seneca.entities.CheckIn;
import xyz.christophermedlin.seneca.entities.User;
import xyz.christophermedlin.seneca.services.CheckInService;
import xyz.christophermedlin.seneca.services.UserService;

@RestController
@RequestMapping("/checkins")
public class CheckInController {

  @Autowired
  CheckInService service;

  @Autowired
  UserService userService;

  @PostMapping("")
  public void createCheckIn(@RequestBody CheckIn checkin) {
    this.service.createCheckIn(checkin);
  }

  @GetMapping("")
  public List<CheckIn> getCheckins(@RequestParam(required = false) Integer month,
                                   @RequestParam(required = false) Integer year,
                                   Principal principal) {
    if (month == null || year == null) {
      Calendar cal = Calendar.getInstance();
      month = Integer.valueOf(cal.get(Calendar.MONTH));
      year = Integer.valueOf(cal.get(Calendar.YEAR));
    }
    User u = userService.getUserWithPassword(principal.getName());
    return service.getCheckinsInMonth(month, year, u);
  }
}
