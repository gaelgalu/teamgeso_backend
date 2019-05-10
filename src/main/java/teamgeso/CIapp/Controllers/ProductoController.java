package teamgeso.CIapp.Controllers;

import teamgeso.CIapp.Models.Producto;
import teamgeso.CIapp.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController{
	@Autowired
    private ProductoRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Producto> getAllUsers() {
        return productRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Producto create(@RequestBody Producto resource) {
        return productRepository.save(resource);
    }
}