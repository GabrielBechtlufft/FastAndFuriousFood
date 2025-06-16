/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 *
 * @author ppjata
 */

@Entity
public class Produto {
    
    @Id
    private long id;
    
    private String nome;
    private double preco;
    private double qntd;
    private String linkImagem;

    public Produto() {
    }

    public Produto(long id, String nome, double preco, double qntd, String linkImagem) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
        this.linkImagem = linkImagem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQntd() {
        return qntd;
    }

    public void setQntd(double qntd) {
        this.qntd = qntd;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.id == other.id;
    }
    
        
}


