/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trilce.profesores.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import trilce.profesores.model.TemasClases;
/**
 *
 * @author jolo
 */
public interface TemasClasesRepository extends JpaRepository<TemasClases,Long>{
    
}
