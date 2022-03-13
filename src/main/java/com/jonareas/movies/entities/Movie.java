package com.jonareas.movies.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Pelicula")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPelicula")
    private Long id;

    @Column(name = "titulo")
    private String title;

    @Column(name = "tipoMetraje")
    private String type;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nacionalidad")
    private Nationality nationality;

    @ManyToOne(optional = false)
    @JoinColumn(name = "clasificacion")
    private Rating rating;

    @Column(name = "duracion")
    private String length;

    @Column(name = "sinopsis")
    private String synopsis;

}
