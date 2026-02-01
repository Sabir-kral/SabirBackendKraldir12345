package az.developia.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class MyHandler {
    @ExceptionHandler(CustomException.class)
    public Map<String, Object> handleCustomException(CustomException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", ex.getMessage());
        map.put("error", ex.getError());
        map.put("status", ex.getStatus());

        return map;
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, Object> handleValidationException(MethodArgumentNotValidException ex) {
        Map<String, Object> map = new HashMap<>();

        FieldError fieldError = ex.getBindingResult().getFieldErrors().get(0);

        map.put("message", fieldError.getDefaultMessage());
        map.put("error", "Validasiy xetasi vardi balaca sen bilmessen(qeyd bunlar saka olsun diye yazilir)");
        map.put("status", 400);

        return map;
    }

    @ExceptionHandler(AccessDeniedException.class)
    public Map<String, Object> AccessDenied(){
        Map<String, Object> map = new HashMap<>();

        map.put("message","senin bunu etmeye icazen yoxdur balaca");
        map.put("error","Forbidden");
        map.put("Statur",403);
        return map;
    }

    public Map<String,Object> InfernalServerError(){
        Map<String, Object> map= new HashMap<>();
        map.put("message","senin ya kodun sehvdi yada url sevhdi balaca");
        map.put("error","infernal server error");
        map.put("status",500);
        return map;
    }
}
