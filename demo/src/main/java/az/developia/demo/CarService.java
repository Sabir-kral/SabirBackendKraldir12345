package az.developia.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepostory carRepository;

    public CarEntity add(CarEntity request) {
        CarEntity car = new CarEntity();
        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setPrice(request.getPrice());
        car.setYear(request.getYear());
        carRepository.save(car);
        return car;
    }

    public List<CarEntity> findByName(String Brand) {
        return carRepository.findByBrandContainingIgnoreCase(Brand);
    }



    public List<CarEntity> getAll() {
        return carRepository.findAll();
    }

    public CarEntity findById(Long id) {
        CarEntity car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        return car;
    }


}