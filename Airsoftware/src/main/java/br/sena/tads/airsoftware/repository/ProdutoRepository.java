/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sena.tads.airsoftware.repository;

import br.senac.tads.airsoftware.model.Produto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor
 */
public interface ProdutoRepository extends CrudRepository<Produto, Long>{
    
    List<Produto> findByName(String name);
    
}
