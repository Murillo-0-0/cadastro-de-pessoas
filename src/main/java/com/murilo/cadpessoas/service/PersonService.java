package com.murilo.cadpessoas.service;


import com.murilo.cadpessoas.dto.request.PersonRequestDTO;
import com.murilo.cadpessoas.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO PersonDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO PersonDTO);

    String delete(Long id);
}
