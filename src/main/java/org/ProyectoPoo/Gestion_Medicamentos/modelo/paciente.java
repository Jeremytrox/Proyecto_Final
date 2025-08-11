package org.ProyectoPoo.Gestion_Medicamentos.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;


@Entity
public class paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long idPaciente;

    @Column(length = 100) @Required
    private String nombre;

    @Column(length = 100) @Required
    private String apellido;

    @Required
    private java.time.LocalDate fechaNacimiento;

    @Column(length = 20)
    private String telefono;

    @Stereotype("MEMO")
    private String direccion;

    // Getters y Setters
    public Long getIdPaciente() { return idPaciente; }
    public void setIdPaciente(Long idPaciente) { this.idPaciente = idPaciente; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public java.time.LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(java.time.LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
