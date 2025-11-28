
package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public CarEntity add(@RequestBody CarEntity request) {
        return carService.add(request);
    }

    @GetMapping("/by-name")
    public List<CarEntity> findByName(@RequestParam(name = "name") String name) {
        return carService.findByName(name);
    }


    @GetMapping
    public List<CarEntity> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public CarEntity findById(@PathVariable Long id) {
        return carService.findById(id);
    }




}
