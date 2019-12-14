package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by rfh on 12/14/2019
 */
public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();
}
