package com.salesianostriana.dam._E07.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();


    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private LocalDateTime datetime;

    //Sale error si se pone order
    private int orden;



    public void addSong(Song s){
       this.song = s;

        s.getAddedTo2().add(this);
    }

    public void removeSong(Song s){
        this.song = s;
        s.getAddedTo2().remove(this);
    }

    public void addPlaylist(Playlist p){
        this.playlist = p;

        p.getAddedTo().add(this);
    }

    public void removePlaylist(Playlist p){
        this.playlist = p;

        p.getAddedTo().remove(this);
    }

    public void addSongPLaylist(Song s, Playlist p){
        addSong(s);

        addPlaylist(p);

    }

    public void removeSongPlaylist(Song s, Playlist p){
        removeSong(s);
        removePlaylist(p);
    }


}
