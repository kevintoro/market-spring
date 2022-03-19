package com.learn.platzimarket.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "productos")
@Getter
@Setter
@NoArgsConstructor
public class Producto {

  @Id
  @Column(name = "id_producto")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProducto;

  private String nombre;

  @Column(name = "id_categoria")
  private Long idCategoria;

  @Column(name = "codigo_barras")
  private String codigoBarras;

  @Column(name = "precio_venta")
  private BigDecimal precioVenta;

  @Column(name = "cantidad_stock")
  private Integer cantidadStock;

  private Boolean estado;
}
