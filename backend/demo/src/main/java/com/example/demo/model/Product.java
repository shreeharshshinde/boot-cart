package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    private int productID;
    private String productName;
    private String productDesc;
    private String productBrand;
    private BigDecimal productPrice;
    private String productCategory;
    private Date productReleaseDate;
    private boolean productAvailable;
    private int productQuantity;

}
