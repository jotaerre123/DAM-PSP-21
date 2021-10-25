package com.salesianostriana.dam._E07.service;

import com.salesianostriana.dam._E07.model.Song;
import com.salesianostriana.dam._E07.repos.SongRepository;
import com.salesianostriana.dam._E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
