package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.entities.Base;
import it.epicode.verificaSpring.entities.DTO.Dtobase;
import it.epicode.verificaSpring.entities.DTO.EntityBase;

public interface Mapper <D,S>{

    S map(D input);
}
