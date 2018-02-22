package com.virtual.micro.cucumber.stepdefs;

import com.virtual.micro.JanmicroApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JanmicroApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
