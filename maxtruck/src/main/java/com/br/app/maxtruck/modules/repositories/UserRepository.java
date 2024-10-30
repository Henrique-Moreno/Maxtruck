package com.br.app.maxtruck.modules.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.app.maxtruck.modules.entities.UserEntity;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
  Optional<UserEntity> findByEmail(String email);
}
