package com.example.ejerciciotres.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Builder
public class Tarea {

    @Id @GeneratedValue
    private Long id;
    private String titulo;
    private Date fechaDeCreacion;
    private Date fechaDeInicio;
    private Date fechaDeFin;
}
