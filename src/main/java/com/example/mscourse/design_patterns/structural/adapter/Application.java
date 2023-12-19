package com.example.mscourse.design_patterns.structural.adapter;

public class Application {
    public static void main(String[] args) {
        ThirdPartyDIN DIN = new ThirdPartyDINImpl();
        DIN.connect();
        System.out.println(DIN.getCitizenByPin("5SC9FNA"));
    }
}
