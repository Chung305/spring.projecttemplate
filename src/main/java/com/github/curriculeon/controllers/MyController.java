package com.github.curriculeon.controllers;

import com.github.curriculeon.repositories.MyRepository;
import com.github.curriculeon.services.MyService;
import com.github.curriculeon.models.MyModel;
import com.github.curriculeon.utils.controllers.AbstractSimpleController;
import com.github.curriculeon.utils.controllers.SimpleControllerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/my-controller")
public class MyController extends AbstractSimpleController<Long, MyModel, MyRepository, MyService> {
    public MyController(MyService service) {
        super(service);
    }
}
