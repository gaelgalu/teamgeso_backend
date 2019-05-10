package teamgeso.CIapp.Controllers;

import teamgeso.CIapp.Models.Producto;

import teamgeso.CIapp.Repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

import java.util.Date;
import java.util.List;

import java.text.ParseException;


@CrossOrigin(origins = "http://157.230.12.110:8082")
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Producto getProductById(@PathVariable Long id) {
        return productRepository.findProductoById(id);
    }

    @PostMapping("/nuevo")
    @ResponseBody
    public Producto create(@RequestBody Producto resource) throws ParseException {
        Date date = new Date();
        long time = date.getTime();
        new Timestamp(time);
        resource.setExpirationDate(new Timestamp(time));
        return productRepository.save(resource);
    }

}