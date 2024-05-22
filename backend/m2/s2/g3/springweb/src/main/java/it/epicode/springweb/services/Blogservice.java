package it.epicode.springweb.services;

import it.epicode.springweb.entities.Autore;
import it.epicode.springweb.entities.Blog;
import it.epicode.springweb.payloads.BlogPayload;
import it.epicode.springweb.repository.AutoriRepository;
import it.epicode.springweb.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class Blogservice {

    @Autowired
    private BlogRepository blogDao;

    @Autowired
    private AutoriRepository autoriDao;




}
