/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.domain.repository;

import local.gabriel.FastAndFuriousFood.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
