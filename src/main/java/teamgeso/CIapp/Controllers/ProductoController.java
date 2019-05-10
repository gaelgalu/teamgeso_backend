package teamgeso.CIapp.Controllers;

import teamgeso.CIapp.Models.Producto;

import teamgeso.CIapp.Repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public Producto getProductById(@PathVariable Integer id) {
        return productRepository.findProductoById(id);
    }

    @RequestMapping(value = "/nuevo", method = RequestMethod.POST)
    @ResponseBody
    public Producto create(@RequestBody Producto resource){
        return productRepository.save(resource);
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        String deletedName = findById(id).getName();
        productRepository.deleteById(id);
        return deletedName;
    }

    @PutMapping("/editar/{id}")
    public HttpStatus updateProduct(@RequestBody Producto product, @PathVariable Integer id) {

        Optional<Producto> productOptional = productRepository.findById(id);

        if (!productOptional.isPresent())
            return HttpStatus.NOT_FOUND;

        product.setId(id);
        
        productRepository.save(product);

        return HttpStatus.OK;
    }

}