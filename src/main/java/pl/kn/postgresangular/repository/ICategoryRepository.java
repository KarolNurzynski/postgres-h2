package pl.kn.postgresangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kn.postgresangular.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
