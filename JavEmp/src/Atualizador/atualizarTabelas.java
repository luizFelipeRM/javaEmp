/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atualizador;

import Produtos.telaEstoque;
import Produtos.telaGerenciarProdutos;

/**
 *
 * @author luiz
 */

public class atualizarTabelas {
    telaEstoque estoque = new telaEstoque();
    telaGerenciarProdutos tirarPedido = new telaGerenciarProdutos();
    
    
    public void atualizar(){
        estoque.preencherTabela("select *from produtos order by nome");
        tirarPedido.preencherTabela("select *from produtos order by nome");
   }
}
