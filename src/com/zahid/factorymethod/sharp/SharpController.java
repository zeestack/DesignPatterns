package com.zahid.factorymethod.sharp;

import com.zahid.factorymethod.matcha.Controller;
import com.zahid.factorymethod.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine(){
        return new SharpViewEngine();
    }
}
