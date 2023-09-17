/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
/*
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jolo
 */

@Entity
@Table (name = "sedes")
/*
@Getter
@Setter
*/
public class Sedes {
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    //DATOS PROPIOS
    private String nombresede;
    private String distrito;
    private String direccion;

    //CONSTRUCTORES
    public Sedes(String nombresede, String distrito, String direccion) {
        this.nombresede = nombresede;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public Sedes() {
    }

    //GETTERS Y SETTERS 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombresede() {
        return nombresede;
    }

    public void setNombresede(String nombresede) {
        this.nombresede = nombresede;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
