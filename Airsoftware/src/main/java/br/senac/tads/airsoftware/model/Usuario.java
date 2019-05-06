package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author victor
 */
@Entity(name = "tb_usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String hashSenha;
    
    private List<Papel> papeis;
    @OneToOne(mappedBy = "usuario")
    private Cliente cliente;

    public Usuario() {
    }

    public Usuario(Long id, String email, String hashSenha, List<Papel> papeis) {
        this.id = id;
        this.email = email;
        this.hashSenha = hashSenha;
        this.papeis = papeis;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String senha) {
        this.hashSenha = senha;
    }

//    public void setSenha(String senhaAberta) {
//        this.hashSenha = BCrypt.hashpw(senhaAberta, BCrypt.gensalt());
//    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

//    public boolean validarSenha(String senhaAberta) {
//        return BCrypt.checkpw(senhaAberta, hashSenha);
//    }

    public boolean verificarPapel(String nomePapel) {
        for (Papel p : papeis) {
            if (p.getNome().equals(nomePapel)) {
                return true;
            }
        }
        return false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
