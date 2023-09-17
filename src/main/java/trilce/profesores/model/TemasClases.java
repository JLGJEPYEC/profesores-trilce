 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trilce.profesores.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@Table (name = "temasClases")
/*
@Getter
@Setter
@AllArgsConstructor
*/
public class TemasClases {
    //DATOS PARA ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_temas")
    public long id;
    //DATOS INCLUIDOS
    
    @ManyToOne
    @JoinColumn(name="silabo_id" )
    @JsonBackReference
    private Silabo silabo;
    
    
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
    @OneToMany( mappedBy = "temas_clase", targetEntity = DesarrolloClase.class)
    private List<DesarrolloClase> lista_dc ;
    
    
    //DATOS PROPIOS
    @Column (name = "nombre_tema")
    private String nombre_tema;
    private String descripcion;

    
    //CONSTRUCTORES
    public TemasClases(String nombreTema, String descripcion) {
        this.nombre_tema = nombreTema;
        this.descripcion = descripcion;
        this.silabo= new Silabo();
        this.lista_dc = new ArrayList<>();
    }
    
    public TemasClases() {
    }

    //GETTERS Y SETTERS 
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    

    public Silabo getSilabo() {
        return silabo;
    }

    public void setSilabo(Silabo silabo) {
        this.silabo = silabo;
    }

    public List<DesarrolloClase> getLista_dc() {
        return lista_dc;
    }

    public void setLista_dc(List<DesarrolloClase> lista_dc) {
        this.lista_dc = lista_dc;
    }

    public String getNombre_tema() {
        return nombre_tema;
    }

    public void setNombre_tema(String nombre_tema) {
        this.nombre_tema = nombre_tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
}
