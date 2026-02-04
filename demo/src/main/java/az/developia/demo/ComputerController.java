package az.developia.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/computer")
public class ComputerController {
    private final ComputerService computerService;

    @PostMapping
    public ComputerResponse add(@RequestBody ComputerRequest request){
        return computerService.add(request);
    }
    @GetMapping
    public List<ComputerResponse> getAll(){
        return computerService.getAll();
    }
    @GetMapping("/{id}")
    public ComputerResponse findById(@PathVariable Long id){
        return computerService.findById(id);
    }
    @PutMapping("/{id}")
    public void redakte(@PathVariable Long id,@RequestBody ComputerRequest request){
        computerService.redakte(id,request);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        computerService.delete(id);
    }
}
