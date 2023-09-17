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
@Table (name = "grado_escolar")
/*
@Getter
@Setter
*/
public class GradoEscolar {
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_ge")
    private long id;
    
    //DATOS PROPIOS
    private String grado;
    private String tipo_grado;

    //CONSTRUCTORES
    public GradoEscolar(String grado, String tipo_grado) {
        this.grado = grado;
        this.tipo_grado = tipo_grado;
    }

    public GradoEscolar() {
    }

    //GETTERS Y SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTipo_grado() {
        return tipo_grado;
    }

    public void setTipo_grado(String tipo_grado) {
        this.tipo_grado = tipo_grado;
    }
    
    
    
    
}
