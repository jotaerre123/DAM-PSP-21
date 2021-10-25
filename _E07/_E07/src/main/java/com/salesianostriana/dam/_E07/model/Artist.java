package com.salesianostriana.dam._E07.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter@Builder
public class Artist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Builder.Default
    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();

}
