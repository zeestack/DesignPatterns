package com.zahid.factorymethod;

import com.zahid.factorymethod.matcha.Controller;
import com.zahid.factorymethod.sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    // You have an option of using default controller and also have option of changing the view engine using
    // factorMethodPatter using inheritance.

    public void listProducts() {
        //Get products from database
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("products.html", context);
    }
}
