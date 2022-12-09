package me.dio.gameawards.controller.games;

import me.dio.gameawards.controller.ApiErrorDto;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public abstract class BaseRestController {
    @ExceptionHandler (NoContentException.class)
    public ResponseEntity<Void> handlerNoContentException(NoContentException exception){
        return ResponseEntity.noContent().build();

    }
    @ExceptionHandler (BusinessException.class)
    public ResponseEntity<ApiErrorDto> c(BusinessException exception){
        ApiErrorDto error = new ApiErrorDto(exception.getMessage());
        return ResponseEntity.badRequest().body(error);

    }
    @ExceptionHandler (Throwable.class)
    public ResponseEntity<ApiErrorDto> handlerUnexpectException(Throwable exception){
        ApiErrorDto error = new ApiErrorDto("Ocorreu um erro inesperado.");
        return ResponseEntity.internalServerError().body(error);

    }

}
