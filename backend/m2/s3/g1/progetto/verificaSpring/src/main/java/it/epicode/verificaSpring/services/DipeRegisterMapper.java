package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.entities.DTO.DipeRegister;
import it.epicode.verificaSpring.entities.Dipendenti;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class DipeRegisterMapper implements Mapper<DipeRegister, Dipendenti>{


    @Override
    public DipeRegister convertTo(Dipendenti input) {
        return DipeRegister.builder()
                .withName(input.getName())//
                .withCognome(input.getCognome())//
                .withEmail(input.getEmail())//
                .withUsername(input.getUsername())//
                .withPassword(input.getPassword()).build();
    }

    @Override
    public Dipendenti convertFrom(DipeRegister input) {
        return Dipendenti.builder().withName(input.getName())//
                .withCognome(input.getCognome())//
                .withEmail(input.getEmail())//
                .withUsername(input.getUsername())//
                .withPassword(input.getPassword()).build();
    }
}
