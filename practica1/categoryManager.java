// Implementación de la interfaz categoryInterfaz
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

public class categoryManager implements categoryInterfaz {
    private List<Category> categories = new ArrayList<>();
    private int nextId = 1;

    @Override
    public void getCategories() {
        // filtrar status == 1, imprimir o mensaje "No existen categorías registradas"
    }

    @Override
    public void getChildCategories(Integer categoryId) {
        // filtrar por parentCategoryId == categoryId
    }

    @Override
    public void createCategory(category category) {
        // validar unicidad, validar parentCategoryId existente y status 1,
        // que no sea padre de sí misma, asignar id automático (nextId++)
    }

    @Override
    public void deleteCategory(Integer id) {
        // validar que no tenga hijos, si no, status = 0
    }
    
}
