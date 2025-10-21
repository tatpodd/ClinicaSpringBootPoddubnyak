package com.example.ClinicaSpringBootPoddubnyak.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TarjetaProfesional")

public class TarjetaProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String numeroTarjeta;
    @Column(length = 50, nullable = false)
    private String nombreTitular;
    @Column(length = 50, nullable = false)
    private LocalDate fechaExpedicion;
    @Column(length = 50, nullable = false)
    private LocalDate fechaVencimiento;
    @Column(length = 50, nullable = false)
    private Integer documentoIdentidad;
    @Column(length = 50, nullable = false)
    private  String profesion;
    @Column(length = 50, nullable = false)
    private  String especialidad;
    @Column(length = 50, nullable = false)
    private  String entidad;
    @Column(length = 50, nullable = false)
    private  Boolean estado;

   @OneToOne(mappedBy = "tarjetaProfesional")
   private Medico medico;

}
