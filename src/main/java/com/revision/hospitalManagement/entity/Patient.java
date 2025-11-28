package com.revision.hospitalManagement.entity;


import com.revision.hospitalManagement.enums.Gender;
import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.sql.ast.spi.LockingClauseStrategy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Entity
@Table(
        name = "patient_table",
        uniqueConstraints = {
                @UniqueConstraint(name = "patient_name",columnNames ={"name"}),
                @UniqueConstraint(name = "unique_DOB_email",columnNames = {"dateOfBirth","email"})
        }

)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate dateOfBirth;

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @CreatedDate
    @Column(updatable = false)
    private LocalDate createdAt;
}
