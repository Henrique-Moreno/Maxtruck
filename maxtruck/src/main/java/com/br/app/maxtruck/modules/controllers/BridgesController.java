package com.br.app.maxtruck.modules.controllers;

import com.br.app.maxtruck.modules.entities.BridgeEntity;
import com.br.app.maxtruck.modules.repositories.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bridges")
public class BridgesController {

  @Autowired
  private BridgeRepository bridgeRepository;

  @GetMapping
  public ResponseEntity<List<BridgeEntity>> getAllBridges() {
    List<BridgeEntity> bridges = bridgeRepository.findAll();
    return ResponseEntity.ok(bridges);
  }
}
