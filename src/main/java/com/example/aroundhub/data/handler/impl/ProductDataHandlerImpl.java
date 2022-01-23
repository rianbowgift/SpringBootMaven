package com.example.aroundhub.data.handler.impl;

import javax.transaction.Transactional;

import com.example.aroundhub.data.dao.ProductDAO;
import com.example.aroundhub.data.entity.ProductEntity;
import com.example.aroundhub.data.handler.ProductDataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice,
                                           int productStock) {
        ProductEntity productEntity = new ProductEntity(productId, productName, productPrice,
                productStock);

        return productDAO.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}