package challenge;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService service;

	public Recipe save() {
		return service.save(null);
	}

	public void update() {
		service.update(null, null);
	}

	public void delete() {
		service.delete(null);
	}

	@GetMapping("/")
	public Recipe get() {
		return service.get(null);
	}

	public List<Recipe> listByIngredient() {
		return service.listByIngredient(null);
	}

	public List<Recipe> search() {
		return service.search(null);
	}

	public void like() {
		service.like(null, null);
	}

	public void unlike() {
		service.unlike(null, null);
	}

	public RecipeComment addComment() {
		return service.addComment(null, null);
	}

	public void updateComment() {
		service.updateComment(null, null, null);
	}

	public void deleteComment() {
		service.deleteComment(null, null);
	}

}
