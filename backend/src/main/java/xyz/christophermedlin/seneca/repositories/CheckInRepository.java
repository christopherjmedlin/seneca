package xyz.christophermedlin.seneca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import xyz.christophermedlin.seneca.entities.CheckIn;
import xyz.christophermedlin.seneca.entities.User;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
  @Query("SELECT c from CheckIn c JOIN c.list l " +
         "WHERE year(c.date) = :year AND month(c.date) = :month AND l.owner = :user")
  List<CheckIn> findByYearAndMonth(int year, int month, User user);
}
