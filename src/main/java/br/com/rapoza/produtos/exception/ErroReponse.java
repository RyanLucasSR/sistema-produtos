package br.com.rapoza.produtos.exception;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ErroReponse {

    private String message;

    private Integer status;
}
