package br.senac.tads.airsoftware.controller;

import br.senac.tads.airsoftware.model.Cliente;
import br.senac.tads.airsoftware.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Matheus
 */
@Controller
//@RequestMapping("/login")
public class ClienteController {

    @Autowired
    private ClienteRepository ClienteRepository;

    @GetMapping("/cadastrar_cliente")
    public String adicionarNovo() {
        return "/cadastrar_cliente";

    }

    @PostMapping("/salvarCliente")
    public ModelAndView salvar(Cliente c) {
        ClienteRepository.save(c);
        return new ModelAndView("/pesquisar_clientes");
    }

    @GetMapping("/pesquisar_clientes")
    public ModelAndView listar() {
        List<Cliente> cliente;
        cliente = (List<Cliente>) ClienteRepository.findAll();
        return new ModelAndView("/pesquisar_clientes")
                .addObject("clientes", cliente);
    }

    
     @GetMapping("/editarcliente/{id}")
    public ModelAndView editar(
            @PathVariable("id") Long id) {
            
            ModelAndView modelAndView = new ModelAndView("/cadastrar_cliente");
            Optional<Cliente> opitional = ClienteRepository.findById(id);
            Cliente cliente = opitional.get();
            modelAndView.addObject("cliente", cliente);
        return  modelAndView;
    }
}
