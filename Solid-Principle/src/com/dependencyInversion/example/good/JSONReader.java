package com.dependencyInversion.example.good;

public class JSONReader implements Reader {

    @Override
    public String getUsername() {
        return "\"username\":\"mikesmith\"";
    }

}
