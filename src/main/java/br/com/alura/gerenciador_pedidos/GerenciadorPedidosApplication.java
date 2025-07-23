package br.com.alura.gerenciador_pedidos;

import br.com.alura.gerenciador_pedidos.main.Main;
import br.com.alura.gerenciador_pedidos.repository.CategoriaRepository;
import br.com.alura.gerenciador_pedidos.repository.PedidoRepository;
import br.com.alura.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {
	@Autowired
	ProdutoRepository produtoRepository;
	@Autowired
	CategoriaRepository categoriaRepository;
	@Autowired
	PedidoRepository pedidoRepository;


	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.principal(produtoRepository, categoriaRepository, pedidoRepository);
	}
}
