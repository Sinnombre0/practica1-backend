// Interfaz 

import java.util.List;

public interface categoryInterfaz {
    void getCategories();
    void getChildCategories(Integer categoryId);
    void createCategory(category category);
    void deleteCategory(Integer id);
}
