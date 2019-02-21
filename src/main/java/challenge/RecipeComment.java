package challenge;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Classe para mapear o comentário da receita no MongoDB
 *
 */

@Document(collection = "recipeComment")
public class RecipeComment {
    private Long id;
    private String comment;

    public RecipeComment(){}

    public RecipeComment(Long id, String comment) {
        this.id = id;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
