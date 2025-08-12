package org.ProyectoPoo.Gestion_Medicamentos.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;
import org.junit.ClassRule;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class medicamento {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idMedicamento;

    @Column(name= "nombre", length = 50, nullable = false)
    @Required(message = "El nombre del medicamento no puede quedar vacío.")
    private String nombre;

    @Column(length = 200)
    private String descripcion;

    @Column(length = 30)
    private String dosis;

    @Column(length = 30)
    private String presentacion;


    @PrePersist
    public void validarMedicamento(){
        if(Objects.equals(nombre, getNombre())){System.console().printf("El Medicamento ya esta registrado");};
    }


}



