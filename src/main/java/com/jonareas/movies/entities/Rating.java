package com.jonareas.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Clasificacion")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Rating implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClasificacion")
    private Long id;


    @Column(name = "abreviacion")
    private String abbreviation;

    @Column(name = "nombre")
    private String name;

    @Column(name = "activo")
    private boolean isActive;

}
