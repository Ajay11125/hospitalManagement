package com.revision.hospitalManagement;

import com.revision.hospitalManagement.entity.Patient;
import com.revision.hospitalManagement.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTest {
    @Autowired
    private PatientRepository patientRepository;
    @Test
    public void testPatientRepository(){
        List<Patient> patientList=patientRepository.findAll();
        System.out.println(patientList);
    }

}
