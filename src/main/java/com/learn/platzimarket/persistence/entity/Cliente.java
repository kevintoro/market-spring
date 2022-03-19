package com.learn.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
  @Id
  private String id;

  private String nombre;

  private String apellidos;

  private Integer celular;

  private String direccion;

  @Column(name = "correo_electronico")
  private String correoElectronico;
}
