package com.example;

public class ImplClass {

    public String coveredImplMethod() {
        return "This IMPL method is covered.";
    }

    public String uncoveredImplMethod(String s) {
        return "This IMPL method is uncovered.";
    }
}
