package main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class MyExceptionAdvice {
    @ExceptionHandler(value = MyException.class)
    public ResponseEntity<MyErrorResponse>
    handleGenericNotFoundException(MyException e){
        MyErrorResponse error = new MyErrorResponse(e.getMessage());
        return new ResponseEntity<MyErrorResponse>(error, HttpStatus.NOT_FOUND);
    }
}
