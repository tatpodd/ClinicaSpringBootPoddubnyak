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
@Table(name = "Medico")


public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String grupoSanguineo;
    @Column(length = 50, nullable = false)
    private String alergias;
    @Column(length = 50, nullable = false)
    private String enfermedadesPrevias;
    @Column(length = 50, nullable = false)
    private String medicamentosActuales;
    @Column(length = 50, nullable = false)
    private String antecedentesFamiliares;
    @Column(length = 50, nullable = false)
    private LocalDate fechaUltimaConsulta;
    @Column(length = 50, nullable = false)
    private String estadoActual;
    @Column(length = 50, nullable = false)
    private String motivoConsulta;
    @Column(length = 50, nullable = false)
    private String recomendaciones;


    @OneToOne
   @JoinColumn(name="tarjeta_profesional_id" , referencedColumnName = "id")
   private  TarjetaProfesional tarjetaProfesional;


}
