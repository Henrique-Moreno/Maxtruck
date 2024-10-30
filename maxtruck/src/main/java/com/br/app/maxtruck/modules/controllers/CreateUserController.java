package com.br.app.maxtruck.modules.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.app.maxtruck.modules.entities.UserEntity;
import com.br.app.maxtruck.modules.services.CreateUserService;
import com.br.app.maxtruck.modules.services.ProfileUserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class CreateUserController {

  @Autowired
  private CreateUserService createUserService;

  @Autowired
  private ProfileUserService profileUserService;

  @PostMapping("/")
  public ResponseEntity<Object> create(@Valid @RequestBody UserEntity userEntity) {
    try {
      var result = this.createUserService.execute(userEntity);
      return ResponseEntity.ok().body(result);

    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

  @GetMapping("/")
  @PreAuthorize("hasRole('USER')")
  public ResponseEntity<Object> get(HttpServletRequest request) {
    var userId = request.getAttribute("user_id");

    try {
      var profile = this.profileUserService.execute(UUID.fromString(userId.toString()));
      return ResponseEntity.ok().body(profile);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
