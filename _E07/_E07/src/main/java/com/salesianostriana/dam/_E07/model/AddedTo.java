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
public class AddedTo implements Serializable {

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

    private int order;

}
