package com.example.ejerciciotres.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class Comentario {

    @Id @GeneratedValue
    private Long id;
    private String texto;
    private Date fecha;
}
