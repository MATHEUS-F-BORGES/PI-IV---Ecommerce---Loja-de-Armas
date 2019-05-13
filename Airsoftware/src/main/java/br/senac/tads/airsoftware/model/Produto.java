package br.senac.tads.airsoftware.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author victor
 */
@Entity(name = "tb_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal precoCompra;
    @Column(precision = 6, scale = 2, nullable = false)
    private BigDecimal precoVenda;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String informacoes;
    @Column(nullable = false)
    private int quantidade;
    private String categoria;
    private String subCategoria;
    @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY)
    private Set<ImagemProduto> imagens;
    @Column(nullable = false, insertable = true, updatable = false)
    private LocalDateTime dataCadastro;
    @ManyToMany(mappedBy = "produtos", fetch = FetchType.LAZY)
    private Set<Carrinho> carrinho;

    public Produto() {
    }

    public Produto(Long id, String nome, BigDecimal precoCompra, BigDecimal precoVenda, String descricao, String informacoes, int quantidade, String categoria, String subCategoria, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
        this.informacoes = informacoes;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.dataCadastro = dataCadastro;
    }

    public Produto(Long id, String nome, BigDecimal precoCompra, BigDecimal precoVenda, String descricao, String informacoes, int quantidade, String categoria, String subCategoria, Set<ImagemProduto> imagens, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
        this.informacoes = informacoes;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.imagens = imagens;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public Set<ImagemProduto> getImagens() {
        return imagens;
    }

    public void setImagens(Set<ImagemProduto> imagens) {
        this.imagens = imagens;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Set<Carrinho> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Set<Carrinho> carrinho) {
        this.carrinho = carrinho;
    }
    
}
