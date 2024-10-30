package com.br.app.maxtruck.modules.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.app.maxtruck.exceptions.UserFoundException;
import com.br.app.maxtruck.modules.dtos.ProfileUserDTO;
import com.br.app.maxtruck.modules.entities.UserEntity;
import com.br.app.maxtruck.modules.repositories.UserRepository;

@Service
public class ProfileUserService {

  @Autowired
  private UserRepository userRepository;

  public ProfileUserDTO execute(UUID userId) {
    UserEntity user = this.userRepository.findById(userId)
        .orElseThrow(() -> {
          throw new UserFoundException();
        });

    ProfileUserDTO userDTO = ProfileUserDTO.builder()
        .name(user.getName())
        .email(user.getEmail())
        .idade(user.getIdade())
        .profissao(user.getProfissao())
        .localizacao(user.getLocalizacao())
        .educacao(user.getEducacao())
        .build();

    return userDTO;
  }
}
