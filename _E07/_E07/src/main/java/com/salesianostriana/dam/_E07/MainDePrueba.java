package com.salesianostriana.dam._E07;

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

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void init(){

        Artist artist = Artist.builder()
                .name("LiSa")
                .build();

        artistService.edit(artist);

        Song song = Song.builder()
                .title("Gurenge")
                .artist(artist)
                .build();

        songService.save(song);

        song.addArtist(artist);

        Playlist playlist = Playlist.builder()
                .name("Favoritos")
                .build();

        playlistService.save(playlist);

        playlist.addSong(song);

        playlistService.edit(playlist);

        System.out.println("Título Canción" + playlist.getSongList().get(0).getTitle());

        System.out.println("Artista Canción" + playlist.getSongList().get(0).getArtist().getName());

        System.out.println("Nombre de la Playlist" + playlist.getName());

    }

}
