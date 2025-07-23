/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.api.controller;

import java.util.List;
import java.util.Optional;
import local.gabriel.FastAndFuriousFood.domain.model.ItemPedido;
import local.gabriel.FastAndFuriousFood.domain.model.Pedido;
import local.gabriel.FastAndFuriousFood.domain.model.Produto;
import local.gabriel.FastAndFuriousFood.domain.repository.PedidoRepository;
import local.gabriel.FastAndFuriousFood.model.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController
@RequestMapping("/fastfurious")
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @GetMapping("/pedido")
    public List<Pedido> listas() {
        return pedidoRepository.findAll();
    }
    
    @GetMapping("/pedido/{id}")
     public ResponseEntity<Pedido> buscar(@PathVariable Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        
        if(pedido.isPresent()) {
            return ResponseEntity.ok(pedido.get());
        }else {
            return ResponseEntity.notFound().build();
        }
     }
     
     @PostMapping("/pedido")
     public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {
        Pedido pedidoSalvo = pedidoService.salvarPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSalvo);
    }
    
    @DeleteMapping("pedido/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        pedidoService.excluir(id);
        return new ResponseEntity(HttpStatus.OK);

    }
    
    @PutMapping("/pedido/{id}")
    public ResponseEntity<Pedido> atualizar(@PathVariable Long id,
                                        @RequestBody Pedido pedidoAtualizado) {
    Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);

    if (pedidoOptional.isEmpty()) {
        return ResponseEntity.notFound().build();
    }

    Pedido pedidoExistente = pedidoOptional.get();

    // Atualizar status
    pedidoExistente.setStatus(pedidoAtualizado.getStatus());

    // Limpar itens antigos (se necessário)
    pedidoExistente.getItens().clear();

    // Adicionar os novos itens e garantir que cada item aponte pro pedido
    for (ItemPedido item : pedidoAtualizado.getItens()) {
        item.setPedido(pedidoExistente);
        pedidoExistente.getItens().add(item);
    }

    // Salvar o pedido com os novos dados
    Pedido pedidoSalvo = pedidoRepository.save(pedidoExistente);

    return ResponseEntity.ok(pedidoSalvo);
}
}
