package az.developia.demo;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerMapper {
    public static ComputerResponse toDTO(ComputerEntity entity){
        ComputerResponse computerResponse = new ComputerResponse();
        computerResponse.setId(entity.getId());
        computerResponse.setBrand(entity.getBrand());
        computerResponse.setModel(entity.getModel());
        computerResponse.setColor(entity.getColor());
        computerResponse.setPrice(entity.getPrice());

        return computerResponse;
    }

    public static List<ComputerResponse> toDTOList(List<ComputerEntity> entities){
        return entities.stream().map(ComputerMapper::toDTO).collect(Collectors.toList());
    }
}
