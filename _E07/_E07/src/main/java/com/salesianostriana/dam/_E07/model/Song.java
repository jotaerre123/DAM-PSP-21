package com.salesianostriana.dam._E07.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    private String album;

    private String year;

    @Builder.Default
    @ManyToMany(mappedBy = "listSongs", fetch = FetchType.EAGER)
    private List<Playlist> playlist = new ArrayList<>();

    public void addArtist(Artist a){
        this.artist = a;
        a.getSongs().add(this);
        this.artist = null;
    }

}
