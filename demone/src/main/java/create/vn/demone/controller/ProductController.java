package create.vn.demone.controller;

import create.vn.demone.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product("1","Iphone8","Cùi",3000000,"Apple"));
        products.add(new Product("2","IphoneX","Tạm",5000000,"Apple"));
        products.add(new Product("3","Iphone11","Vừa",8000000,"Apple"));
        products.add(new Product("4","Iphone12","Vừa Vừa",10000000,"Apple"));
        products.add(new Product("5","Iphone13","Tốt",15000000,"Apple"));
        products.add(new Product("6","Iphone14","Rất Tốt",20000000,"Apple"));
        products.add(new Product("7","Iphone15","Miễn chê",30000000,"Apple"));
        products.add(new Product("8","Z-Flip","Ngon",25000000,"Samsung"));
        products.add(new Product("9","ZFold","Xịn",40000000,"Samsung"));
        products.add(new Product("10","SamsungS23Ultra","Tốt",23000000,"Samsung"));
    }


    @GetMapping
    public List<Product> getProducts(){
        return products;
    }
    @GetMapping("/{id}")
    public Product getProById(@PathVariable String id){
        for (Product product: products){
            if (product.getId().equals(id)){
                return product;
            }
        }return null;
    }
}

