package pruebaInterbank.service;

import org.springframework.stereotype.Service;
import pruebaInterbank.model.Cliente;

import java.util.List;


public interface ClienteService {

    List<Cliente> listCliente(Integer id);
    Cliente guardar (Cliente cliente);

    void eliminar(Integer id);

    List<Cliente> listar ();
}
