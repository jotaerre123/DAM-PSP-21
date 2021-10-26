package com.salesianostriana.dam._E07;

import com.salesianostriana.dam._E07.model.AddedTo;
import com.salesianostriana.dam._E07.model.Artist;
import com.salesianostriana.dam._E07.model.Playlist;
import com.salesianostriana.dam._E07.model.Song;
import com.salesianostriana.dam._E07.repos.ArtistRepository;
import com.salesianostriana.dam._E07.service.AddedToService;
import com.salesianostriana.dam._E07.service.ArtistService;
import com.salesianostriana.dam._E07.service.PlaylistService;
import com.salesianostriana.dam._E07.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test(){

        Artist artist = Artist.builder()
                .name("LiSa")
                .build();

        artistService.edit(artist);

        Song song = Song.builder()
                .title("Gurenge")
                .album("Op")
                .year("2020")
                .build();

        song.addArtist(artist);

        songService.save(song);

        Playlist playlist = Playlist.builder()
                .name("Favoritos")
                .description("Todas las canciones favoritas de JRWTF")
                .build();

        playlistService.save(playlist);




        addedToService.createAddedTo(playlist, song, playlistService, songService);






        System.out.println("Título Canción: " + song.getTitle());

        System.out.println("Artista Canción: " + artist.getName());

        System.out.println("Nombre de la Playlist: " + playlist.getName());

    }

}
