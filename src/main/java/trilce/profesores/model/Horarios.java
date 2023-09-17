/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table (name = "horarios")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
/*
@Getter
@Setter
*/
public class Horarios {
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_horario")
    private long id;
    
    
    //DATOS INCLUIDOS
    
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
    @ManyToOne
    @JoinColumn(name="profesor_id")
    //@JsonIgnore
    private Profesores profesor;
    
    @ManyToOne
    @JoinColumn(name="sede_id")
    private Sedes sede;
    
    @ManyToOne
    @JoinColumn(name="silabo_id")
    private Silabo silabo;
    
    //DATOS PROPIOS
    private String seccion;
    @Column (name = "h_inicio_hora")
    private Long h_i_hora;
    @Column (name = "h_inicio_minutos")
    private Long h_i_min;
    @Column (name = "h_fin_hora")
    private Long h_f_hora;
    @Column (name = "h_fin_minutos")
    private Long h_f_min;

    
    //CONSTRUCTORES

    public Horarios(String seccion, Long h_i_hora, Long h_i_min, Long h_f_hora, Long h_fin_min) {
        this.seccion = seccion;
        this.h_i_hora = h_i_hora;
        this.h_i_min = h_i_min;
        this.h_f_hora = h_f_hora;
        this.h_f_min = h_fin_min;
        
        this.profesor= new Profesores();
        this.sede= new Sedes();
        this.silabo = new Silabo();

    }

    
    
    public Horarios() {
    }

    //GETTERS Y SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public Sedes getSede() {
        return sede;
    }

    public void setSede(Sedes sede) {
        this.sede = sede;
    }

    public Silabo getSilabo() {
        return silabo;
    }

    public void setSilabo(Silabo silabo) {
        this.silabo = silabo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Long getH_i_hora() {
        return h_i_hora;
    }

    public void setH_i_hora(Long h_i_hora) {
        this.h_i_hora = h_i_hora;
    }

    public Long getH_i_min() {
        return h_i_min;
    }

    public void setH_i_min(Long h_i_min) {
        this.h_i_min = h_i_min;
    }

    public Long getH_f_hora() {
        return h_f_hora;
    }

    public void setH_f_hora(Long h_f_hora) {
        this.h_f_hora = h_f_hora;
    }

    public Long getH_f_min() {
        return h_f_min;
    }

    public void setH_f_min(Long h_f_min) {
        this.h_f_min = h_f_min;
    }

    
}
