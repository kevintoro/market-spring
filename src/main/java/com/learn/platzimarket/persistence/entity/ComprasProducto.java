package com.learn.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
@NoArgsConstructor
public class ComprasProducto {

  @EmbeddedId
  private ComprasProductoPK id;

  private Integer cantidad;

  private BigDecimal total;

  private Boolean estado;
}
