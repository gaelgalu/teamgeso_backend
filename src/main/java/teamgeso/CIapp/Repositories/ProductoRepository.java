package teamgeso.CIapp.Repositories;

import teamgeso.CIapp.Models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Producto findProductoById(Long id);
}