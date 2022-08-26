package pruebaInterbank.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pruebaInterbank.model.Cliente;
import pruebaInterbank.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("id/{clienteId}")
    public List<Cliente> obtenerCliente(@PathVariable Integer clienteId){

        return clienteService.listCliente(clienteId);
    }

    @PostMapping("guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente){

        return clienteService.guardar(cliente);
    }
    @DeleteMapping("id/{clienteId}")
    public String eliminarCliente(@PathVariable Integer clienteId){

         clienteService.eliminar(clienteId);

         return "cliente eliminado";
    }
    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteService.listar();
    }

}
