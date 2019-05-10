package teamgeso.CIapp.Controllers;

import teamgeso.CIapp.Models.Producto;

import teamgeso.CIapp.Repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import java.text.ParseException;


@CrossOrigin(origins = "*", allowCredentials = "false")
@RestController
@RequestMapping("/productos")
public class ProductoController{
	@Autowired
	private ProductoRepository productRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    //This is an example of an innecesary comment
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Producto getProductById(@PathVariable Long id) {
        return productRepository.findProductoById(id);
    }

    @PostMapping("/nuevo")
    @ResponseBody
    public Producto create(@RequestBody Producto resource) throws ParseException {
        return productRepository.save(resource);
    }

}