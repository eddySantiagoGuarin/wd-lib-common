package com.world_dance.wd_lib_common.exception;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.world_dance.wd_lib_common.dto.ExceptionDto;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ExceptionDto> handleBadRequest(BadRequestException ex) {
        System.out.println("ENTRÓ AL HANDLER");
        ExceptionDto error = new ExceptionDto();
        error.setMessage(ex.getMessage());

        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDto> handleValidationErrors(MethodArgumentNotValidException ex) {
        ExceptionDto error = new ExceptionDto();
        String mensaje = ex.getBindingResult().getFieldError().getDefaultMessage();
        error.setMessage(mensaje);

        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFound(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleResourceNotFound(ResourceNotFoundException ex) {
        ExceptionDto error = new ExceptionDto();
        error.setMessage(ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}

