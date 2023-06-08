package com.store.orders;

/*import com.example.demo.Models.Customer;
import com.example.demo.Models.Item;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.ItemsRepository;
import com.example.demo.Repositories.OrdersRepository;*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class OrdersController {
    private final OrdersRepository OrderRepo;
    /*private final CustomerRepository CustRepo;
    private final ItemsRepository ItemsRepo;*/
    private static final Logger log = LoggerFactory.getLogger(OrdersController.class);
    List<String>itemInfo = new ArrayList<>();
    List<String>customerInfo = new ArrayList<>();
    OrdersController(OrdersRepository OrderRepo){
        this.OrderRepo = OrderRepo;

    }
    @RequestMapping("orders")
    public List<Orders> getAllOrders(){
        log.info("Orders are showing");
        return OrderRepo.findAll();
    }

    @Value("${items-service.url}")
    private String itemsServiceBaseUrl;
    @Value("${customers-service.url}")
    private String customersServiceBaseUrl;
    @RequestMapping("orders/add/{ItemsId}/{CustomersId}")
    public String addOrderns(@PathVariable Long ItemsId, @PathVariable Long CustomersId){

        System.out.println(ItemsId);
        System.out.println(CustomersId);
        RestTemplate restTemplateCustomer = new RestTemplate();
        String customer = restTemplateCustomer.getForObject(customersServiceBaseUrl + "/customers/" + CustomersId, String.class);

        RestTemplate restTemplateItem = new RestTemplate();
        String item =restTemplateItem.getForObject(itemsServiceBaseUrl + "/items/" + ItemsId, String.class);
        System.out.println(item);
        System.out.println(customer);

        JsonParser springParser = JsonParserFactory.getJsonParser();
        Map< String, Object > mapItem = springParser.parseMap(item);
        Map< String, Object > mapCustomer = springParser.parseMap(customer);

        for (Map.Entry < String, Object > entry: mapItem.entrySet()) {
            itemInfo.add(entry.getValue().toString());

        }

        for (Map.Entry < String, Object > entry: mapCustomer.entrySet()) {
            customerInfo.add(entry.getValue().toString());
        }

        Orders k1 = new Orders((LocalDate.now()).toString(), customerInfo.get(0), itemInfo.get(0));


        OrderRepo.save(k1);

        log.info("Order has been added.");
        return "Order has been placed for customer with id:" + customerInfo.get(0) + " named " + customerInfo.get(1)
                + " and with personal number:" + customerInfo.get(2)+"\n"
                + "with item id:" + itemInfo.get(0) + " which is " +itemInfo.get(1) + " costing " + itemInfo.get(2);
    }

}
