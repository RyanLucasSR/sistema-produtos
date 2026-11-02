package br.com.rapoza.produtos.database.repository;

import br.com.rapoza.produtos.database.model.ProdutoEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends JpaRepository<ProdutoEntitiy, Integer> {
}
