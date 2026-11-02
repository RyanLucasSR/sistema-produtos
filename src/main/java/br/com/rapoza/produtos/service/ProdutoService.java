package br.com.rapoza.produtos.service;

import br.com.rapoza.produtos.database.model.ProdutoEntitiy;
import br.com.rapoza.produtos.database.repository.IProdutoRepository;
import br.com.rapoza.produtos.dto.ProdutoDto;
import br.com.rapoza.produtos.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final IProdutoRepository produtoRepository;

    public List<ProdutoEntitiy> findAll() {
        return produtoRepository.findAll();
    }

    public ProdutoDto createProduct(ProdutoDto produtoDto) {
        ProdutoEntitiy produto = ProdutoEntitiy.builder()
                .nome(produtoDto.getNome())
                .preco(produtoDto.getPreco())
                .quantidade(produtoDto.getQuantidade())
                .build();

        produtoRepository.save(produto);
        return produtoDto;
    }

    public ProdutoDto updateProduct(ProdutoDto produtoDto, Integer id) {
        ProdutoEntitiy produto = produtoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Produto não encontrado!"));

        produto.setNome(produtoDto.getNome());
        produto.setPreco(produtoDto.getPreco());
        produto.setQuantidade(produtoDto.getQuantidade());

        produtoRepository.save(produto);

        return produtoDto;
    }

    public void deleteProduct(Integer id) {
        produtoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Produto não encontrado!"));

        produtoRepository.deleteById(id);
    }
}
