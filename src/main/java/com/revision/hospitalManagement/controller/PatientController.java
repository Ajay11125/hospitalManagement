package com.revision.hospitalManagement.controller;


import com.revision.hospitalManagement.DTO.PatientDTO;
import com.revision.hospitalManagement.repository.PatientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PatientController {



    @GetMapping("/patient/{id}")
    public ResponseEntity<PatientDTO> getPatient(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(new PatientDTO());
    }
}
