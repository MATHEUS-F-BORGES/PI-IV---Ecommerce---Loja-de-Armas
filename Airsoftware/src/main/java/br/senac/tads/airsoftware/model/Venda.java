package br.senac.tads.airsoftware.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author victo
 */
@Entity (name = "tb_venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, insertable = true, updatable = false)
    private LocalDateTime dataVenda;
    @Column(nullable = false)
    private Long numeroCartao;
    @Column(nullable = false)
    private String nomeTitular;
    @Column(nullable = false)
    private String dataVencimento;
    @Column(nullable = false)
    private int codigoSeguranca;
    @Column(nullable = false)
    private String statusVenda;
    
    private Set<Produto> produtos;
    @OneToOne(mappedBy = "venda")
    private Carrinho carrinho;
    @OneToMany
    private Cliente cliente;

    public Venda() {
    }

    public Venda(Long id, BigDecimal valor, LocalDateTime dataVenda, Long numeroCartao, String nomeTitular, String dataVencimento, int codigoSeguranca, String statusVenda) {
        this.id = id;
        this.valor = valor;
        this.dataVenda = dataVenda;
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataVencimento = dataVencimento;
        this.codigoSeguranca = codigoSeguranca;
        this.statusVenda = statusVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
