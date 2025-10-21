package com.example.ClinicaSpringBootPoddubnyak.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="paciente")

    public class Paciente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(length = 50, nullable = false)
        private String nombreCompleto;
        @Column(length = 50, nullable = false)
        private Integer documentoIdentidad;
        @Column(length = 50, nullable = false)
        private LocalDateTime fechaNacimiento;
        @Column(length = 50, nullable = false)
        private String sexo;
        @Column(length = 50, nullable = false)
        private String direccion;
        @Column(length = 50, nullable = false)
        private String telefono;
        @Column(length = 50, nullable = false)
        private String correoElectronico;
        @Column(length = 50, nullable = false)
        private String estadoCivil;
        @Column(length = 50, nullable = false)
        private String ocupacion;

    @OneToOne
    @JoinColumn(name = "historia_clinica_id", referencedColumnName = "id")
    private HistoriaClinica historiaClinica;

}
