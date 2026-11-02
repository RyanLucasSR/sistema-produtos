package br.com.rapoza.produtos.handler;

import br.com.rapoza.produtos.exception.ErroReponse;
import br.com.rapoza.produtos.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErroReponse> handlerNotFoundException(NotFoundException ex){
        ErroReponse reponse = ErroReponse.builder()
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(reponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErroReponse> handlerException(Exception ex){
        ErroReponse reponse = ErroReponse.builder()
                .message(ex.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(reponse);
    }
}
