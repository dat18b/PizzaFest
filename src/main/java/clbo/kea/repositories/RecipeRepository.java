package clbo.kea.repositories;

import clbo.kea.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findByCookTime(int cooktime);
}
