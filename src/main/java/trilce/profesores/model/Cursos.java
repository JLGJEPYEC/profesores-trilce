/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author jolo
 */

@Entity
@Table(name = "cursos")
@Getter
@Setter
public class Cursos {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_curso")
    private long id;
    
    //@Column (name = "nombre_curso")
    private String nombre_curso;

    public Cursos(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    

    public Cursos() {
    }


    
    
    
}
