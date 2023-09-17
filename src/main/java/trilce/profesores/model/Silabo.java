/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;

//import jakarta.persistence.Column;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/*
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jolo
 */

@Entity
@Table (name = "silabo")
/*
@Getter
@Setter
*/
public class Silabo {
    
    
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_silabo")
    private long id;
    
    
    //DATOS INCLUIDOS
    @ManyToOne
    @JoinColumn(name="curso_id")
    private Cursos curso;
    
    @ManyToOne
    @JoinColumn(name="ge_id")
    private GradoEscolar ge;
    
    @JsonManagedReference
    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
    @OneToMany( mappedBy = "silabo", targetEntity = TemasClases.class)
    private List<TemasClases> temas_clase ;
  
    //DATOS PROPIOS
    private long yearmaking;
  
    //CONSTRUCTORES
    public Silabo(long yearmaking) {
        this.yearmaking = yearmaking;
        //CARGAR DATOS INCLUIDOS CON OBJETOS NUEVOS
        this.curso= new Cursos();
        this.ge=new GradoEscolar();
        //this.temas_clase= new ArrayList<>();
    }
    
    public Silabo() {
    }

    
    //GETTERS Y SETTERS 
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }

    public GradoEscolar getGe() {
        return ge;
    }

    public void setGe(GradoEscolar ge) {
        this.ge = ge;
    }

    public List<TemasClases> getTemas_clase() {
        return temas_clase;
    }

    public void setTemas_clase(List<TemasClases> temas_clase) {
        this.temas_clase = temas_clase;
    }



    public long getYearmaking() {
        return yearmaking;
    }

    public void setYearmaking(long yearmaking) {
        this.yearmaking = yearmaking;
    }

    
    
    
    
    
}
