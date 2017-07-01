package com.gabor.service;

import com.gabor.dao.ProductMapper;
import com.gabor.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Gabor on 2017/6/19.
 */
@Service
public class ProductService{
    @Autowired
    private ProductMapper productMapper;
    public List<Product> getAllProducts() {
        List<Product> products =null;
        products = productMapper.getAllProducts();
        return products;

    }
}
