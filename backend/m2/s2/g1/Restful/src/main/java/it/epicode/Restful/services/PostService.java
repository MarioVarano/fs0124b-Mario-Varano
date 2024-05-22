package it.epicode.Restful.services;

import it.epicode.Restful.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {


    @Autowired
    private PostRepository post;
}
