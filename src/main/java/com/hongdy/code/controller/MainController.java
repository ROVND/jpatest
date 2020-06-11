package com.hongdy.code.controller;


import com.hongdy.code.dto.MainDTO;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class MainController {

    @Inject
    private MainDTO dto;

    public void test1(){
        System.out.println(dto);
    }
}
