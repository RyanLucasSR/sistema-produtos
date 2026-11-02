package br.com.rapoza.produtos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoDto {

    @NotBlank
    private String nome;

    @NotNull
    private BigDecimal preco;

    @NotNull
    private Integer quantidade;
}
