package org.swp391.valuationdiamond.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_Diamond_Price")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiamondPrice {

  @Id
  @Column(name = "diamond_id", nullable = false, length = 255)
  String diamondId;

  @Column(name = "brand", nullable = true, length = 100)
  String brand;

  @Column(name = "calculate", nullable = true, length = 100)
  String calculate;

  @Column(name = "diamond_origin", nullable = true, length = 100)
  String diamondOrigin;

  @Column(name = "symmetry", nullable = true, length = 50)
  String symmetry;

  @Column(name = "color", nullable = true, length = 50)
  String color;

  @Column(name = "proportions", nullable = true, length = 255)
  String proportions;

  @Column(name = "measurements", nullable = true, length = 255)
  String measurements;

  @Column(name = "polish", nullable = true, length = 50)
  String polish;

  @Column(name = "shape_cut", nullable = true, length = 50)
  String shapeCut;

  @Column(name = "carat_weight", nullable = true, precision = 18, scale = 2)
  BigDecimal caratWeight;

  @Column(name = "cut", nullable = true, length = 50)
  String cut;

  @Column(name = "fluorescence", nullable = true, length = 50)
  String fluorescence;

  @Column(name = "clarity", nullable = true, length = 50)
  String clarity;

  @Column(name = "price", nullable = true, precision = 18, scale = 2)
  BigDecimal price;

  @Column(name = "image", nullable = true)
  byte[] image;
}
