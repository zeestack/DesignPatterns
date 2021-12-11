package com.zahid.factorymethod.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "view rendered by Matcha";
    }
}
