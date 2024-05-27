package it.epicode.verificaSpring.services;

import it.epicode.verificaSpring.entities.Base;
import it.epicode.verificaSpring.entities.DTO.Dtobase;
import it.epicode.verificaSpring.entities.DTO.EntityBase;

public interface Mapper <S extends Dtobase, D extends Base>{

    S convertTo(D input);

    D convertFrom(S input);
}
