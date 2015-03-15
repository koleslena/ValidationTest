package ru.koleslena.springapp.model;

import ru.koleslena.springapp.validation.DictionaryValue;

/**
 * Created by elenko on 16.03.15.
 */
public class Model {
    @DictionaryValue(dictionaryName = "", fieldName = "")
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }
}
