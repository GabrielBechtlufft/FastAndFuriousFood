/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.hsc.FastAndFuriousFood.domain.repository;

import java.util.Optional;
import local.hsc.FastAndFuriousFood.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjata
 */
public interface ProdutoRepository extends JpaRepository<Produto , Long> {
    Optional<Produto> findByCategoria(String categoria);
}
