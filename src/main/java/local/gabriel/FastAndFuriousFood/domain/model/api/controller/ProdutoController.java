/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.gabriel.FastAndFuriousFood.domain.model.api.controller;

import java.util.List;
import local.gabriel.FastAndFuriousFood.domain.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjata
 */
@RestController
@RequestMapping("/fastfurious")
public class ProdutoController {
   List<Produto> listaProdutos; 
   
   @GetMapping("/produto")
   public String listas() {
       return "teste api";
}
}