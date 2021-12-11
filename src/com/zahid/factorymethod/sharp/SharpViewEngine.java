package com.zahid.factorymethod.sharp;

import com.zahid.factorymethod.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "rendering view by SharpViewEngine";
    }
}
