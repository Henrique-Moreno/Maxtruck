package com.br.app.maxtruck.modules.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileUserDTO {

  private String name;
  private String email;
  private Integer idade;
  private String profissao;
  private String localizacao;
  private String educacao;

}
