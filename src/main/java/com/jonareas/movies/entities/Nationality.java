package com.jonareas.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Nacionalidad")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Nationality implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNacionalidad")
    private Long id;


    @Column(name = "nombre")
    private String name;

    @Column(name = "activo")
    private boolean isActive;

}
