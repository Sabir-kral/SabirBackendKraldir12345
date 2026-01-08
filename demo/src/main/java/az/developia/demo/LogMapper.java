package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class LogMapper {
       public static LogResponse toDTO(LogEntity entity){
           LogResponse logResponse = new LogResponse();
           logResponse.setId(entity.getId());
           logResponse.setMessage(entity.getMessage());
           logResponse.setLogType(entity.getLogType());

        return logResponse;
    }

    public static List<LogResponse> toDTOList(List<LogEntity> entities){
        return entities.stream().map(LogMapper::toDTO).collect(Collectors.toList());
    }
}
