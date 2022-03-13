package com.jonareas.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Idioma")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Language implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIdioma")
    private Long id;


    @Column(name = "nombre")
    private String name;

    @Column(name = "activo")
    private boolean isActive;

}
