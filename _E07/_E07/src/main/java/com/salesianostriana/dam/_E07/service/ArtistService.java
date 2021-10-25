package com.salesianostriana.dam._E07.service;

import com.salesianostriana.dam._E07.model.Artist;
import com.salesianostriana.dam._E07.repos.ArtistRepository;
import com.salesianostriana.dam._E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist, Long, ArtistRepository> {
}
