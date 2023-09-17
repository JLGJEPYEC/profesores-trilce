/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trilce.profesores.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import trilce.profesores.model.Horarios;

/**
 *
 * @author jolo
 */
public interface HorariosRepository extends JpaRepository<Horarios,Long>{
    
}
