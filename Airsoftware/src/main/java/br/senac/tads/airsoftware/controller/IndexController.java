/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.airsoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {

        return "index";
    }

     @GetMapping("/login")
    public String login() {

        return "login";
    }
    
    
     @GetMapping("/carrinho")
    public String carrinho() {

        return "carrinho";
    }
    
    @GetMapping("/pesquisar")
    public String pesquisar() {

        return "pesquisar";
    }

    @GetMapping("/armas")
    public String armas() {

        return "armas";
    }
    @GetMapping("/acessorios")
    public String acessorios() {

        return "acessorios";
    }
    @GetMapping("/pedidos")
    public String pedidos() {

        return "pedidos";
    }
    
    @GetMapping("/cadastrar_produto")
    public String cadastrar_produto() {

        return "cadastrar_produto";
    }
    
    @GetMapping("/cadastrar_cliente")
    public String cadastrar_cliente() {

        return "cadastrar_cliente";
    }
    
    @GetMapping("/pesquisar_clientes")
    public String pesquisar_clientes() {

        return "pesquisar_clientes";
    }
    
    
    @GetMapping("/produto")
    public String produto() {

        return "produto";
    }
    
    @GetMapping("/estoque")
    public String estoque() {

        return "estoque";
    }
    
    @GetMapping("/vendas")
    public String vendas() {

        return "vendas";
    }

}