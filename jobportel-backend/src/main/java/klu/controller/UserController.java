package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.user;
import klu.model.UserManager;

@RestController
@RequestMapping("/home")
public class UserController {
  @Autowired
  UserManager um;
  
  @PostMapping("/signup")
  public String signup(@RequestBody user u) {
     return um.adduser(u);
  }
  
}