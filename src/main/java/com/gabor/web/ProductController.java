package com.gabor.web;

import com.gabor.domain.Product;
import com.gabor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Gabor on 2017/6/19.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String getAllProducts(Model model){
        List<Product> products= productService.getAllProducts();
        model.addAttribute("products",products);
        return "index";
    }
}
