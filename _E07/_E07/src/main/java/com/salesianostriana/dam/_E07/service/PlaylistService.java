package com.salesianostriana.dam._E07.service;

import com.salesianostriana.dam._E07.model.Playlist;
import com.salesianostriana.dam._E07.repos.PlaylistRepository;
import com.salesianostriana.dam._E07.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist,Long, PlaylistRepository> {
}
