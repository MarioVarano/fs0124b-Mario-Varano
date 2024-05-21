package it.epicode.Restful.controllers;


import it.epicode.Restful.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    PostService service;
}
