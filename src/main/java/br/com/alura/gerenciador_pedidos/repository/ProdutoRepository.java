package br.com.alura.gerenciador_pedidos.repository;

import br.com.alura.gerenciador_pedidos.model.Categoria;
import br.com.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String nome);

    List<Produto> findByCategoria(Categoria categoria);

    List<Produto> findByPrecoGreaterThan(Double preco);

    List<Produto> findByPrecoLessThan(Double preco);

    List<Produto> findByNomeContaining(String nome);

    List<Produto> findByCategoriaOrderByPrecoAsc(Categoria categoria);

    List<Produto> findByCategoriaOrderByPrecoDesc(Categoria categoria);

    long countByCategoria(Categoria categoria);

    long countByPrecoGreaterThan(Double preco);

    List<Produto> findByPrecoLessThanOrNomeContaining(Double preco, String nome);
    List<Produto> findTop3ByOrderByPrecoDesc();
    List<Produto> findTop5ByOrderByPrecoAsc();

    @Query("SELECT p FROM Produto p WHERE p.preco > :valor")
    List<Produto> produtosComValorMaiorQue(Double valor);

    @Query("SELECT p FROM Produto p ORDER BY p.preco ASC")
    List<Produto> produtosOrdenadosPeloPrecoAsc();

    @Query("SELECT p FROM Produto p ORDER BY p.preco DESC")
    List<Produto> produtosOrdenadosPeloPrecoDesc();

    @Query("SELECT p FROM Produto p WHERE p.nome ILIKE :letra%")
    List<Produto> produtosQueComecaoComALetra(String letra);

    @Query("SELECT AVG(p.preco) FROM Produto p")
    Double mediaDePrecosDeProdutos();

    @Query("SELECT MAX(p.preco) FROM Produto p WHERE p.categoria = :categoria")
    Double maiorValorDaCategoria(Categoria categoria);

    @Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome")
    List<Object[]> produtosDaCategoria(Categoria categoria);

    @Query("SELECT c.nome, COUNT(p) FROM Produto p JOIN p.categoria c GROUP BY c.nome HAVING COUNT(p) > :quantidade")
    List<Object[]> categoriasComMaisDe(long quantidade);

    @Query("SELECT p FROM Produto p WHERE (:categoria IS NULL OR p.categoria = :categoria) AND (:nome IS NULL OR p.nome ILIKE :nome%)")
    List<Produto> buscaProdutosPorCategoriaEPorNome(Categoria categoria, String nome);

    @Query(value = "SELECT * FROM produto ORDER BY valor DESC LIMIT 5", nativeQuery = true)
    List<Produto> top5ProdutoMaisCaros();
}
