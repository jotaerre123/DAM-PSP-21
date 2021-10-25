package com.salesianostriana.dam._E07.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String description;

}
