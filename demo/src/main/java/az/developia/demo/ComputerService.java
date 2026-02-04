package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepo computerRepo;

    public ComputerResponse add(ComputerRequest request){
        ComputerEntity computerEntity = new ComputerEntity();
        computerEntity.setBrand(request.getBrand());
        computerEntity.setModel(request.getModel());
        computerEntity.setColor(request.getColor());
        computerEntity.setPrice(request.getPrice());
        computerRepo.save(computerEntity);
        return ComputerMapper.toDTO(computerEntity);
    }

    public List<ComputerResponse> getAll(){
        return ComputerMapper.toDTOList(computerRepo.findAll());
    }

    public ComputerResponse findById(Long id){
        ComputerEntity computerEntity = computerRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        return ComputerMapper.toDTO(computerEntity);
    }

    public void redakte(Long id,ComputerRequest request){
        ComputerEntity computerEntity =computerRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        computerEntity.setBrand(request.getBrand());
        computerEntity.setModel(request.getModel());
        computerEntity.setPrice(request.getPrice());
        computerEntity.setColor(request.getColor());

    }

    public void delete(Long id){
        ComputerEntity computerEntity =computerRepo.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
        computerRepo.delete(computerEntity);
    }
}
