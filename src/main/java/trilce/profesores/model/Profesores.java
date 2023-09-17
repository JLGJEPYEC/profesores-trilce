 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation .JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
import lombok.Getter;
import lombok.Setter;
*/
/**
 *
 * @author jolo
 */

@Entity
@Table (name = "profesores")

/*
@Getter
@Setter
*/
public class Profesores {
    
    //DATOS PARA ID
    @Id
    @Column (name = "dni")
    private long id;
    
    //DATOS PROPIOS
    private String nombres;
    private String app;
    private String apm;
    private String email;
    private String pass;
    private String esuperior;
    private String tipoesuperior;
    private String ieducativa;
    
    
    //DATOS INCLUIDOS
    @JsonIdentityInfo
        (generator = ObjectIdGenerators.PropertyGenerator.class,
                property = "id")
    @OneToMany( mappedBy = "profesor")
    private List<Horarios> ListaHorarios;
    
    //CONSTRUCTORES
    public Profesores(long id, String nombres, String app, String apm, 
            String email, String pass, String esuperior, String tipoesuperior, 
            String ieducativa) {
        this.id = id;
        this.nombres = nombres;
        this.app = app;
        this.apm = apm;
        this.email = email;
        this.pass = pass;
        this.esuperior = esuperior;
        this.tipoesuperior = tipoesuperior;
        this.ieducativa = ieducativa;
        this.ListaHorarios = new ArrayList<>();
    }

    public Profesores() {
    }

    //GETTERS Y SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEsuperior() {
        return esuperior;
    }

    public void setEsuperior(String esuperior) {
        this.esuperior = esuperior;
    }

    public String getTipoesuperior() {
        return tipoesuperior;
    }

    public void setTipoesuperior(String tipoesuperior) {
        this.tipoesuperior = tipoesuperior;
    }

    public String getIeducativa() {
        return ieducativa;
    }

    public void setIeducativa(String ieducativa) {
        this.ieducativa = ieducativa;
    }
    
    
    public List<Horarios> getListaHorarios() {
        return ListaHorarios;
    }

    public void setListaHorarios(List<Horarios> ListaHorarios) {
        this.ListaHorarios = ListaHorarios;
    }
    

    
}
