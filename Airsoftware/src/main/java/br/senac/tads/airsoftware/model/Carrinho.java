package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author victor
 */
@Entity(name = "tb_carrinho")
public class Carrinho implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int quantidade;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;
    @OneToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "carrinho_produto",
            joinColumns = @JoinColumn(name = "carrinho_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private Set<Produto> produtos;
    
    public Carrinho() {
    }

    public Carrinho(Long id, int quantidade, BigDecimal valor) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
