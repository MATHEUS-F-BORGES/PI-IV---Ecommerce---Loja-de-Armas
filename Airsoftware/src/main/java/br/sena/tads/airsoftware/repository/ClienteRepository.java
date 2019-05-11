/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sena.tads.airsoftware.repository;

import br.senac.tads.airsoftware.model.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author victor
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
