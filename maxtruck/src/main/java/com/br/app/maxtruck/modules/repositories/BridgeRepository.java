package com.br.app.maxtruck.modules.repositories;

import com.br.app.maxtruck.modules.entities.BridgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface BridgeRepository extends JpaRepository<BridgeEntity, UUID> {}