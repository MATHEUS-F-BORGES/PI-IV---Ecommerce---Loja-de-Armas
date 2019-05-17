
package br.senac.tads.airsoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import br.senac.tads.airsoftware.repository.ProdutoRepository;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import br.senac.tads.airsoftware.model.Produto;

/**
 *
 * @author rafael.dini
 */
import java.util.Optional;
@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/cadastrar_produto")
    public String adicionarNovo() {
        return "/cadastrar_produto";
    }
    
    @PostMapping("/salvar")
      public ModelAndView salvar(Produto p) {
        produtoRepository.save(p);
        return new ModelAndView ("redirect:/pesquisar");
    }

    @GetMapping("/pesquisar")
   public ModelAndView lista() {
       List<Produto> produto; 
       produto = produtoRepository.findAll();
       return new ModelAndView ("/pesquisar").addObject("produtos", produto);
    }

   @GetMapping("/editarproduto/{id}")
    public ModelAndView editar(
            @PathVariable("id") Long id) {
            
            ModelAndView modelAndView = new ModelAndView("/cadastrar_produto");
            Optional<Produto> p = produtoRepository.findById(id);
            modelAndView.addObject("produtoobj", p.get());
        return  modelAndView;
    }
   
}
