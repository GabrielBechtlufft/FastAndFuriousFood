/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.DTO;

import local.gabriel.FastAndFuriousFood.domain.model.StatusPedido;

/**
 *
 * @author Aluno
 */
public class ProdutoStatusDTO {
    private StatusPedido status;

    public ProdutoStatusDTO() {
    }

    public ProdutoStatusDTO(StatusPedido status) {
        this.status = status;
    }
    
    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    
}
