package klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import klu.repository.UserRepo;

@Service
public class UserManager {
  @Autowired
  UserRepo userrepo;
 
  public String adduser(user u) {
    userrepo.save(u);
    return "User registered successfully";
  }
}