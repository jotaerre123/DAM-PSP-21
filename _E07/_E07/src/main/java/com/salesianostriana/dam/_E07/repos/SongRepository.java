package com.salesianostriana.dam._E07.repos;

import com.salesianostriana.dam._E07.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
