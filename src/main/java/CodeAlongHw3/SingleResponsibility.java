package CodeAlongHw3;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SingleResponsibility {
    /*
    This principle states that a class should have only one responsibility, in other words,
    a class should have only one reason to change
  */
    public static void main(String[] args) {

    }
}

class ProductService {

    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }

    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendEmail() {
        System.out.println("email sent");
    }
}

@Data
@AllArgsConstructor
class Product {
    private String name;
}

