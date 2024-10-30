package com.br.app.maxtruck.modules.services;

import com.br.app.maxtruck.modules.entities.BridgeEntity;
import com.br.app.maxtruck.modules.repositories.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BridgesService {

  @Autowired
  private BridgeRepository bridgeRepository;

  public List<BridgeEntity> getAllBridges() {
    return bridgeRepository.findAll();
  }
}
