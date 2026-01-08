package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {
    private final LogRepo logRepo;
    public void create(String message, String logType) {
        LogEntity logEntity = new LogEntity();
        logEntity.setMessage(message);
        logEntity.setLogType(logType);

        logRepo.save(logEntity);
    }

    public List<LogResponse> getAll() {
        return LogMapper.toDTOList(logRepo.findAll());
    }

    public void delete(Long id){
        LogEntity logEntity = logRepo.findById(id).orElseThrow(()->new RuntimeException("not Found"));
        logRepo.delete(logEntity);

    }
}
