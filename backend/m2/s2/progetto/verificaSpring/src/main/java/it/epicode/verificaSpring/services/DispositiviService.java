package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.repository.DispositiviRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DispositiviService {

    @Autowired
    DispositiviRepository dispositivi;
}
