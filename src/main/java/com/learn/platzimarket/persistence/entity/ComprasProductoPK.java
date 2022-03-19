package com.learn.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class ComprasProductoPK implements Serializable {

  @Column(name = "id_compra")
  private Long idCompra;

  @Column(name = "id_producto")
  private Long idProducto;
}
