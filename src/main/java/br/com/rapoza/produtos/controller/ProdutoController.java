package br.com.rapoza.produtos.controller;

import br.com.rapoza.produtos.database.model.ProdutoEntitiy;
import br.com.rapoza.produtos.dto.ProdutoDto;
import br.com.rapoza.produtos.service.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
@Validated
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntitiy> getProdutos(){
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDto createProduct(@Valid @RequestBody ProdutoDto produtoDto){
        return produtoService.createProduct(produtoDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDto updateProduct(@PathVariable Integer id,
                                    @Valid @RequestBody ProdutoDto produtoDto){
        return produtoService.updateProduct(produtoDto, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Integer id){
        produtoService.deleteProduct(id);
    }
}
