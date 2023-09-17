/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jolo
 */

@Entity
@Table (name = "desarrolloClase")
/*
@Getter
@Setter
@AllArgsConstructor
*/
public class DesarrolloClase {
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_dc")
    private long id;
    
    //DATOS INCLUIDOS
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
    @ManyToOne
    @JoinColumn(name="tema_clase_id")
    private TemasClases temas_clase;
    
    //DATOS PROPIOS
    private String material_clase;

    
    //CONSTRUCTORES
    public DesarrolloClase(String material_clase) {
        this.material_clase = material_clase;
    }

    public DesarrolloClase() {
    }

    //GETTERS Y SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   
    
    public TemasClases getTemas_clase() {
        return temas_clase;
    }

    public void setTemas_clase(TemasClases temas_clase) {
        this.temas_clase = temas_clase;
    }

    public String getMaterial_clase() {
        return material_clase;
    }

    public void setMaterial_clase(String material_clase) {
        this.material_clase = material_clase;
    }

   
    
    
    
}
