/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.repository;

import br.senac.tads.airsoftware.model.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author victor
 */
@Repository
@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
    List<Produto> findByName(String name);
    
}
