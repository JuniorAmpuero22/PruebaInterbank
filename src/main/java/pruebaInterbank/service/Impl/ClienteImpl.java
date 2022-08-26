package pruebaInterbank.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pruebaInterbank.model.Cliente;
import pruebaInterbank.repository.ClienteRepository;
import pruebaInterbank.service.ClienteService;

import java.util.List;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public List<Cliente> listCliente(Integer id) {
        return clienteRepository.getClienteById(id);
    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
}
