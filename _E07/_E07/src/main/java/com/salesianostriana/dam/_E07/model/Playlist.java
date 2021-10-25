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
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String description;

    @Builder.Default
    @ManyToMany
    private List<Song> songList = new ArrayList<>();


    public void addSong(Song s){
        if (this.getSongList()== null)
            this.setSongList(new ArrayList<>());
        this.getSongList().add(s);

        if (s.getPlaylist() == null)
            s.setPlaylist(new ArrayList<>());
        s.getPlaylist().add(this);
    }

    public void removeSong(Song s){
        s.getPlaylist().remove(this);
        this.getSongList().remove(s);
    }

}
