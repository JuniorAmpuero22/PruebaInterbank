package pruebaInterbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pruebaInterbank.model.Cliente;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {


    List<Cliente> getClienteById(Integer id);
    Cliente save (Cliente cliente);
    void deleteById (Integer id);

    List<Cliente> findAll ();

}
