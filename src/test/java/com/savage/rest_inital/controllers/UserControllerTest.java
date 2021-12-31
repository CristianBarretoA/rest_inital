package com.savage.rest_inital.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getUsers() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/user");
        MvcResult result = mvc.perform(requestBuilder).andReturn();
    }

    @Test
    void storeUser() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void getUsersByPriority() {
    }

    @Test
    void deleteUser() {
    }
}