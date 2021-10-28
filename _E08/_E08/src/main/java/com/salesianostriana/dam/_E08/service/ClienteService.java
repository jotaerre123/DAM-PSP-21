package com.salesianostriana.dam._E08.service;

import com.salesianostriana.dam._E08.model.Cliente;
import com.salesianostriana.dam._E08.repos.ClienteRepository;
import com.salesianostriana.dam._E08.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente, Long, ClienteRepository> {
}
