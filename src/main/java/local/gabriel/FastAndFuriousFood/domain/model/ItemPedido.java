/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 *
 * @author ppjata
 */
@Entity
public class ItemPedido {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    
    private long qntd;
    private double preco;
    
     @Enumerated(EnumType.STRING)
    private StatusPedido status;
    
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFinalizacao;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, int id, Produto produto, long qntd, double preco, StatusPedido status, LocalDateTime dataAbertura, LocalDateTime dataFinalizacao) {
        this.id = id;
        this.produto = produto;
        this.qntd = qntd;
        this.preco = preco;
        this.status = status;
        this.dataAbertura = dataAbertura;
        this.dataFinalizacao = dataFinalizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public long getQntd() {
        return qntd;
    }

    public void setQntd(long qntd) {
        this.qntd = qntd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDateTime getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(LocalDateTime dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }    
}
