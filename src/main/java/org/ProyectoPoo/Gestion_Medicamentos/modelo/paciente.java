package org.ProyectoPoo.Gestion_Medicamentos.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;
import org.junit.ClassRule;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Required;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class paciente {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idPaciente;

    @Column(name= "nombre", length = 30, nullable = false)
    @Required(message = "El nombre del paciente no puede quedar vacío.")
    private String nombre;

    @Column(name= "apellido", length = 30, nullable = false)
    @Required(message = "El apellido del paciente no puede quedar vacío.")
    private String apellido;

    @Column(name= "fecha_nacimiento", nullable = false)
    @Required(message = "La fecha de nacimiento no puede quedar vacía.")
    private LocalDate fecha;

    @Column(length = 20)
    private String telefono;

    @Column(length = 200)
    private String direccion;
}


