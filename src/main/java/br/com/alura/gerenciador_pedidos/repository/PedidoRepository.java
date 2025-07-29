package br.com.alura.gerenciador_pedidos.repository;

import br.com.alura.gerenciador_pedidos.model.Pedido;
import br.com.alura.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByDataEntregaIsNull();
    List<Pedido> findByDataEntregaIsNotNull();
    List<Pedido> findByDataEntregaAfter(LocalDate date);
    List<Pedido> findByDataEntregaBefore(LocalDate data);
    List<Pedido> findByDataEntregaBetween(LocalDate dataInicio, LocalDate dataFim);
    @Query("SELECT p FROM Pedido p WHERE p.dataEntrega BETWEEN :dataInicio AND :dataFim")
    List<Pedido> pedidosFeitosEntre(LocalDate dataInicio, LocalDate dataFim);
}