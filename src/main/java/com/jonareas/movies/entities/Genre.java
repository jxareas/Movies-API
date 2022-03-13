package com.jonareas.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Genero")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Genre implements BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenero")
    private Long id;


    @Column(name = "nombre")
    private String name;

    @Column(name = "activo")
    private boolean isActive;





}
