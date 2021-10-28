package com.salesianostriana.dam._E08;

import com.salesianostriana.dam._E08.model.*;
import com.salesianostriana.dam._E08.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ClienteService clienteService;
    private final ClienteCorporativoService clienteCorporativoService;
    private final ClienteIndividualService clienteIndividualService;
    private final PedidoService pedidoService;
    private final EmpleadoService empleadoService;

    @PostConstruct
    public void test(){

        Cliente cliente1 = Cliente.builder()
                .nombre("Pepe")
                .apellidos("Pepo Pipo")
                .mail("pepe@gmail.com")
                .build();
        clienteService.save(cliente1);
        Cliente cliente2 = Cliente.builder()
                .nombre("Inma")
                .apellidos("Domínguez Vargas")
                .mail("inma@gmail.com")
                .build();
        clienteService.save(cliente2);

        Pedido pedido1 = Pedido.builder()
                .fechaLlegada(LocalDateTime.now())
                .descripcion("Katana Nichirin Demon Slayer Color Negro")
                .transporte("GSL")
                .build();
        pedido1.addCliente(cliente1);
        pedidoService.save(pedido1);
        Pedido pedido2 = Pedido.builder()
                .fechaLlegada(LocalDateTime.now())
                .descripcion("Set Bolas Dragón Namek Dragon Ball Z")
                .transporte("DHL")
                .build();
        pedido2.addCliente(cliente2);
        pedidoService.save(pedido2);

        Empleado empleado1 = Empleado.builder()
                .nombre("Alejandro")
                .apellidos("Martín Cuevas")
                .empresa("Bungie")
                .nacionalidad("España")
                .build();
        empleadoService.save(empleado1);

        Empleado empleado2 = Empleado.builder()
                .nombre("Vicente")
                .apellidos("Rufo Bru")
                .empresa("Bungie")
                .nacionalidad("España")
                .build();
        empleadoService.save(empleado2);



        ClienteCorporativo clienteCorporativo1 = ClienteCorporativo.builder()
                .nombre("Bungie")
                .apellidos("Inc")
                .mail("bungie@gmail.com")
                .capitalEmpresa(300000000)
                .build();
        clienteCorporativo1.addEmpleado(empleado1);
        clienteCorporativoService.save(clienteCorporativo1);

        ClienteCorporativo clienteCorporativo2 = ClienteCorporativo.builder()
                .nombre("Activision")
                .apellidos("Inc")
                .mail("activision@gmail.com")
                .capitalEmpresa(300000000)
                .build();
        clienteCorporativo2.addEmpleado(empleado2);
        clienteCorporativoService.save(clienteCorporativo2);

        ClienteIndividual clienteIndividual1 = ClienteIndividual.builder()
                .nombre("Pablo")
                .apellidos("Segura Velasco")
                .mail("pablo@gmail.com")
                .nacionalidad("Peruano")
                .premium(true)
                .build();
        clienteIndividualService.save(clienteIndividual1);

        ClienteIndividual clienteIndividual2 = ClienteIndividual.builder()
                .nombre("Javier")
                .apellidos("Navarro Vega")
                .mail("javi@gmail.com")
                .nacionalidad("Peruano")
                .premium(false)
                .build();
        clienteIndividualService.save(clienteIndividual2);


    }

}
