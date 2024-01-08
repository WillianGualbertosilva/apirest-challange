package br.com.food.config;


import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

import br.com.food.model.enums.StatusEnum;
import br.com.food.infra.entity.Order;
import br.com.food.infra.repository.OrderRepository;
import br.com.food.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


@Configuration
public class InstantiationDataMongoDB implements CommandLineRunner {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... arg0) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        orderRepository.deleteAll();

        List<ProductDTO> productDTOList1 = Arrays.asList(new ProductDTO("bigmac", BigDecimal.valueOf(10.0)),
                new ProductDTO("refrigerante", BigDecimal.valueOf(7.0)),
                new ProductDTO("batata-frita", BigDecimal.valueOf(5.0)));

        List<ProductDTO> productDTOList2 = Arrays.asList(new ProductDTO("sunday", BigDecimal.valueOf(10.0)));


        Order orderJoao = new Order(UUID.randomUUID(), productDTOList1, BigDecimal.valueOf(22.0), StatusEnum.PROCESS);
        Order orderMaria = new Order(UUID.randomUUID(), productDTOList1, BigDecimal.valueOf(22.0), StatusEnum.PROCESS);
        Order orderJose = new Order(UUID.randomUUID(), productDTOList2, BigDecimal.valueOf(10.0), StatusEnum.CONCLUDED);

        orderRepository.saveAll(Arrays.asList(orderJoao, orderMaria, orderJose));


    }

}
