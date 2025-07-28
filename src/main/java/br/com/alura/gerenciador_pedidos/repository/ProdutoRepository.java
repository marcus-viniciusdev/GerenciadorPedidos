package br.com.alura.gerenciador_pedidos.repository;

import br.com.alura.gerenciador_pedidos.model.Categoria;
import br.com.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

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
}
