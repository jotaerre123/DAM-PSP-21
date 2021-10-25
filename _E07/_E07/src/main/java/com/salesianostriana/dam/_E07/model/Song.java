package com.salesianostriana.dam._E07.model;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Artist artist;

    private String album;

    private String year;

}
