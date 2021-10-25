package com.salesianostriana.dam._E07.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    private String album;

    private String year;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTo2 = new ArrayList<>();

    public void addArtist(Artist a){
        this.artist = a;
        if (a.getSongs() == null){
            a.setSongs(new ArrayList<>());
            a.getSongs().add(this);
        }

    }

    public void removeArtist(Artist a){
        this.artist = null;

        a.getSongs().remove(this);
    }

}
