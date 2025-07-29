package br.com.alura.gerenciador_pedidos.main;

import br.com.alura.gerenciador_pedidos.model.Categoria;
import br.com.alura.gerenciador_pedidos.model.Fornecedor;
import br.com.alura.gerenciador_pedidos.model.Produto;
import br.com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.gerenciador_pedidos.repository.FornecedorRepository;
import br.com.alura.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.gerenciador_pedidos.repository.ProdutoRepository;

import java.util.Arrays;
import java.util.List;

public class Main {
    public void principal(ProdutoRepository produtoRepositorio, CategoriaRepository categoriaRepositorio, PedidoRepository pedidoRepositorio, FornecedorRepository fornecedorRepositorio) {
        Categoria bebida = new Categoria(1L, "Bebida");
//        Categoria alimento = new Categoria(2L, "Alimento");
        Categoria eletronico = new Categoria(3L, "Eletrônicos");
//        Categoria moveis = new Categoria(4L, "Móveis");
        Categoria utensilios = new Categoria(5L, "Utensílios");
//
//        Fornecedor fornecedor1 = new Fornecedor("Apple");
        Fornecedor fornecedor2 = new Fornecedor("Supermercados BH");
//        Fornecedor fornecedor3 = new Fornecedor("IKEA");
//        fornecedorRepositorio.saveAll(List.of(fornecedor1, fornecedor2, fornecedor3));
//
//        Produto cafe = new Produto("Café", 20.50, bebida, fornecedor2);
//        Produto feijao = new Produto("Feijão", 8.00, alimento, fornecedor2);
//        Produto tablet = new Produto("Tablet", 3250.00, eletronico, fornecedor1);
//        Produto sofa = new Produto("Sofá", 3000.00, moveis, fornecedor3);
//        Produto macarrao = new Produto("Macarrão", 11.90, alimento, fornecedor2);
//        Produto smartphone = new Produto("Smartphone", 2700.00, eletronico, fornecedor1);
//        Produto cerveja = new Produto("Cerveja", 12.00, bebida, fornecedor2);
//        Produto notebook = new Produto("Notebook", 5000.00, eletronico, fornecedor1);
//        Produto arroz = new Produto("Arroz", 9.50, alimento, fornecedor2);
//
//        bebida.setProdutos(List.of(cafe, cerveja));
//        alimento.setProdutos(List.of(feijao, arroz, macarrao));
//        eletronico.setProdutos(List.of(tablet, smartphone, notebook));
//        moveis.setProdutos(List.of(sofa));
//
//        categoriaRepositorio.save(bebida);
//        categoriaRepositorio.save(alimento);
//        categoriaRepositorio.save(eletronico);
//        categoriaRepositorio.save(moveis);

//        Categoria bebida = new Categoria(1L, "Bebida");
//        Fornecedor fornecedor2 = new Fornecedor("Supermercados BH");
//        fornecedorRepositorio.save(fornecedor2);
//
//        Produto cafe1 = new Produto("Café Pilão", 20.50, bebida, fornecedor2);
//        Produto cafe2 = new Produto("Café Três Corações", 20.50, bebida, fornecedor2);
//        Produto cafe3 = new Produto("Café Santa Clara", 20.50, bebida, fornecedor2);
//        Produto cafe4 = new Produto("Café L'or", 20.50, bebida, fornecedor2);
//        Produto filtro = new Produto("Filtro de papel para café", 7.50, utensilios, fornecedor2);
//
//        bebida.setProdutos(List.of(cafe1, cafe2, cafe3, cafe4));
//        utensilios.setProdutos(List.of(filtro));
//
//        categoriaRepositorio.saveAll(List.of(bebida, utensilios));

//        List<Produto> cafe = produtoRepositorio.findByNome("Café");
//        cafe.forEach(c -> System.out.println(c.getNome()));

//        List<Produto> produtosBebidas = produtoRepositorio.findByCategoria(bebida);
//        produtosBebidas.forEach(b -> System.out.println(b.getNome()));

//        List<Produto> produtosPremium = produtoRepositorio.findByPrecoGreaterThan(200.0);
//        produtosPremium.forEach(p -> System.out.println(p.getNome()));

//        List<Produto> produtosBaratos = produtoRepositorio.findByPrecoLessThan(200.0);
//        produtosBaratos.forEach(b -> System.out.println(b.getNome()));

//          List<Produto> cafes = produtoRepositorio.findByNomeContaining("Café");
//          cafes.forEach(c -> System.out.println(c.getNome()));

//        List<Produto> eletronicosBaratos = produtoRepositorio.findByCategoriaOrderByPrecoAsc(eletronico);
//        eletronicosBaratos.forEach(b -> System.out.println(b.getNome() + " Preço: " + b.getPreco()));
//
//        List<Produto> eletronicosCaros = produtoRepositorio.findByCategoriaOrderByPrecoDesc(eletronico);
//        eletronicosCaros.forEach(b -> System.out.println(b.getNome() + " Preço: " + b.getPreco()));

//        System.out.println("Quantidade de eletrônicos: " + produtoRepositorio.countByCategoria(eletronico));

//        System.out.println("Quantidade de produtos caros: " + produtoRepositorio.countByPrecoGreaterThan(200.0));

//        List<Produto> cafesEProdutosBaratos = produtoRepositorio.findByPrecoLessThanOrNomeContaining(12.0, "Café");
//        cafesEProdutosBaratos.forEach(p -> System.out.println(p.getNome()));
//
//        List<Produto> produtosMaisCaros = produtoRepositorio.findTop3ByOrderByPrecoDesc();
//        System.out.println("Top 3 produtos mais caros");
//        produtosMaisCaros.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));
//
//        List<Produto> produtosMaisBaratos = produtoRepositorio.findTop5ByOrderByPrecoAsc();
//        System.out.println("Top 5 produtos mais baratos");
//        produtosMaisBaratos.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

//        List<Produto> produtosMaisCarosQue200 = produtoRepositorio.produtosComValorMaiorQue(200.0);
//        produtosMaisCarosQue200.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

//        List<Produto> produtosAsc = produtoRepositorio.produtosOrdenadosPeloPrecoAsc();
//        produtosAsc.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));
//
//        List<Produto> produtosDesc = produtoRepositorio.produtosOrdenadosPeloPrecoDesc();
//        produtosDesc.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

//        List<Produto> produtoQueComecaoComS = produtoRepositorio.produtosQueComecaoComALetra("s");
//        produtoQueComecaoComS.forEach(p -> System.out.println(p.getNome()));

//        Double mediaDoPreco = produtoRepositorio.mediaDePrecosDeProdutos();
//        System.out.println("A média dos preços do produtos é " + mediaDoPreco);

//        Double precoMaisAltoDosAlimentos = produtoRepositorio.maiorValorDaCategoria(alimento);
//        System.out.println(precoMaisAltoDosAlimentos);

        List<Produto> bebidasQueSaoCafes = produtoRepositorio.buscaProdutosPorCategoriaEPorNome(bebida, "Café");
        bebidasQueSaoCafes.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

        List<Produto> eletronicos = produtoRepositorio.buscaProdutosPorCategoriaEPorNome(eletronico, null);
        eletronicos.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

        List<Produto> coisasHaverCafe = produtoRepositorio.buscaProdutosPorCategoriaEPorNome(null, "Café");
        coisasHaverCafe.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));

        List<Produto> produtosMaisCaros = produtoRepositorio.top5ProdutoMaisCaros();
        System.out.println("Top 5 produtos mais caros");
        produtosMaisCaros.forEach(p -> System.out.println(p.getNome() + " - Preço: " + p.getPreco()));
    }
}
