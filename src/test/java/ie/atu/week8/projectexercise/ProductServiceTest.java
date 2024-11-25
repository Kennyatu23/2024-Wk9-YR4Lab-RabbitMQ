package ie.atu.week8.projectexercise;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @InjectMocks
    private ProductService productService;
    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSaveProductForApplyDiscount() {
        Product product = new Product(1l, "Laptop", "Expensive", 1500);
        when(productRepository.save(product)).thenReturn(product);
        Product expectedProduct = productService.saveProduct(product);
        assertEquals(1350, expectedProduct.getPrice());
    }


    @Test
    void testValidateProductForIllegalArguments() {
        Product product = new Product();
        //assertThrows(IllegalArgumentException.class)
    }
}
