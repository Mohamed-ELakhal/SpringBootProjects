package mohamed.bazaar.services;

import mohamed.bazaar.domain.Category;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * @author Mohamed Magdy
 */
public interface CategoryService {
    Page<Category> findAll(Integer pageNumber, Integer pageSize);
    Optional<Category> findById(Long id);
    Category save(Category category);
    Optional<Category> update(Long id, Category category);
    boolean delete(Long id);
}
