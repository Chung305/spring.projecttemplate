package com.github.curriculeon.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.curriculeon.models.MyModel;
import com.github.curriculeon.repositories.MyRepository;
import com.github.curriculeon.services.MyService;
import com.github.curriculeon.utils.SimpleControllerTestInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;


/**
 * @author leon on 8/30/18.
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class MyControllerTest implements SimpleControllerTestInterface<Long, MyModel, MyRepository, MyService, MyController> {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private MyRepository repository;

    @Test
    public void test() throws Exception {
        testFindById(1L, MyModel::new);
    }

    @Test
    public void testCreate() throws Exception {
        testCreate(MyModel::new);
    }

    @Override
    public String getUrlTemplate() {
        return "/my-controller/";
    }

    @Override
    public MyRepository getCrudRepository() {
        return repository;
    }

    @Override
    public MockMvc getMockMvc() {
        return mvc;
    }
}
