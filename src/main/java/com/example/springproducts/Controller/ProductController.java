package Controller;



import com.example.springproducts.model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/")
    public String getProducts(Model model) {
        // Список продуктов (пока вручную)
        List<Items> products = new ArrayList<>();
        products.add(new Items(1L, "Laptop", "Gaming laptop", 1200.00));
        products.add(new Items(2L, "Phone", "Smartphone with good camera", 800.00));
        products.add(new Items(3L, "Headphones", "Wireless headphones", 150.00));

        // Передаём список в модель
        model.addAttribute("products", products);

        // Рендерим шаблон index.html
        return "index";
    }
}
