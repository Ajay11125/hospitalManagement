package com.revision.hospitalManagement.repository;


import com.revision.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByName(String Name);
    List<Patient> findByDateOfBirth(LocalDate date);

    @Query("select p from Patient p where email=?1" )
    Patient findByEmail(@Param("Email") String email);
}
