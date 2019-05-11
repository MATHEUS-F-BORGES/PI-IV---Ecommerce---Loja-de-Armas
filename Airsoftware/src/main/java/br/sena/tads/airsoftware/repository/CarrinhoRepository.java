/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sena.tads.airsoftware.repository;

import br.senac.tads.airsoftware.model.Carrinho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author victor
 */
@Repository
@Transactional
public interface CarrinhoRepository extends CrudRepository<Carrinho, Long>{
    
}
