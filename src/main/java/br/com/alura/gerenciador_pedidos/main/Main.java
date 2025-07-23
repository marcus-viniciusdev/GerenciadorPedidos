package br.com.alura.gerenciador_pedidos.main;

import br.com.alura.gerenciador_pedidos.model.Categoria;
import br.com.alura.gerenciador_pedidos.model.Fornecedor;
import br.com.alura.gerenciador_pedidos.model.Pedido;
import br.com.alura.gerenciador_pedidos.model.Produto;
import br.com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.alura.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.gerenciador_pedidos.repository.ProdutoRepository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public void principal(ProdutoRepository produtoRepositorio, CategoriaRepository categoriaRepositorio, PedidoRepository pedidoRepositorio, FornecedorRepository fornecedorRepositorio) {
        Categoria bebida = new Categoria(1L, "Bebida");
        Categoria alimento = new Categoria(2L, "Alimento");
        Categoria eletronico = new Categoria(3L, "Eletrônicos");
        Categoria moveis = new Categoria(4L, "Móveis");

        Fornecedor fornecedor1 = new Fornecedor("Apple");
        Fornecedor fornecedor2 = new Fornecedor("Supermercados BH");
        Fornecedor fornecedor3 = new Fornecedor("IKEA");
        fornecedorRepositorio.saveAll(List.of(fornecedor1, fornecedor2, fornecedor3));

        Produto cafe = new Produto("Café", 20.50, bebida, fornecedor2);
        Produto feijao = new Produto("Feijão", 8.00, alimento, fornecedor2);
        Produto tablet = new Produto("Tablet", 3250.00, eletronico, fornecedor1);
        Produto sofa = new Produto("Sofá", 3000.00, moveis, fornecedor3);
        Produto macarrao = new Produto("Macarrão", 11.90, alimento, fornecedor2);
        Produto smartphone = new Produto("Smartphone", 2700.00, eletronico, fornecedor1);
        Produto cerveja = new Produto("Cerveja", 12.00, bebida, fornecedor2);
        Produto notebook = new Produto("Notebook", 5000.00, eletronico, fornecedor1);
        Produto arroz = new Produto("Arroz", 9.50, alimento, fornecedor2);

        bebida.setProdutos(List.of(cafe, cerveja));
        alimento.setProdutos(List.of(feijao, arroz, macarrao));
        eletronico.setProdutos(List.of(tablet, smartphone, notebook));
        moveis.setProdutos(List.of(sofa));

        categoriaRepositorio.save(bebida);
        categoriaRepositorio.save(alimento);
        categoriaRepositorio.save(eletronico);
        categoriaRepositorio.save(moveis);
    }
}
