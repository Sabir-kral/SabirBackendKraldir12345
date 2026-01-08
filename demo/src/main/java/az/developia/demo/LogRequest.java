package az.developia.demo;

import lombok.Data;

@Data
public class LogRequest {
    private String message;
    private String logType;
}
