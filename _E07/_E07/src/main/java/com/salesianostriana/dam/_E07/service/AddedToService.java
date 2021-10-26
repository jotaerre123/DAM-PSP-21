package com.salesianostriana.dam._E07.service;

import com.salesianostriana.dam._E07.model.AddedTo;
import com.salesianostriana.dam._E07.model.AddedToPK;
import com.salesianostriana.dam._E07.model.Playlist;
import com.salesianostriana.dam._E07.model.Song;
import com.salesianostriana.dam._E07.repos.AddedToRepository;
import com.salesianostriana.dam._E07.service.base.BaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {

    public void createAddedTo(Playlist p, Song s, PlaylistService playlistService, SongService songService){
        AddedTo addedTo = AddedTo.builder()
                .orden(4)
                .datetime(LocalDateTime.of(2020, 03, 02, 18, 30))
                .build();

        addedTo.addSongPLaylist(s,p);

        save(addedTo);
        songService.save(s);
        playlistService.save(p);

    }


    /*

    public Playlist addSongs(Song s, Playlist p){
        s.getAddedTo2().forEach(song -> {
            AddedTo add = AddedTo.builder()
                    .song(s)
                    .playlist(p)
                    .build();
            save(add);
        });

        return p;
    }

     */

}
