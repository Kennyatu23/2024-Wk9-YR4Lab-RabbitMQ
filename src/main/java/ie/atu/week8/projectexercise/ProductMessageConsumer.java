package ie.atu.week8.projectexercise;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class ProductMessageConsumer {

    @RabbitListener(queues = "productQueue")
    public void processProductMessage(Product product) {
        System.out.println("Received message: " + product.toString());
    }
}
