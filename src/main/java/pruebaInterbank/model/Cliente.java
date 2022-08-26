package pruebaInterbank.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private Integer numeroDocumento;
}
