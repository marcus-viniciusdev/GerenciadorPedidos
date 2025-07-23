package br.com.alura.gerenciador_pedidos.main;

import br.com.alura.gerenciador_pedidos.model.Categoria;
import br.com.alura.gerenciador_pedidos.model.Pedido;
import br.com.alura.gerenciador_pedidos.model.Produto;
import br.com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.gerenciador_pedidos.repository.ProdutoRepository;

import java.time.LocalDate;

public class Main {
    public void principal(ProdutoRepository produtoRepositorio, CategoriaRepository categoriaRepositorio, PedidoRepository pedidoRepositorio) {
        Produto produto = new Produto("Café", 20.50);
        Categoria categoria = new Categoria(1L, "Alimento/Bebida");
        Pedido pedido = new Pedido(1L, LocalDate.of(2023, 6, 17));

        produtoRepositorio.save(produto);
        categoriaRepositorio.save(categoria);
        pedidoRepositorio.save(pedido);
    }
}
