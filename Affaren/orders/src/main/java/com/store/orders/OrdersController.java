package com.store.orders;

/*import com.example.demo.Models.Customer;
import com.example.demo.Models.Item;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.ItemsRepository;
import com.example.demo.Repositories.OrdersRepository;*/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
    private final OrdersRepository OrderRepo;
    /*private final CustomerRepository CustRepo;
    private final ItemsRepository ItemsRepo;*/
    private static final Logger log = LoggerFactory.getLogger(OrdersController.class);

    OrdersController(OrdersRepository OrderRepo){
        this.OrderRepo = OrderRepo;

    }
    @RequestMapping("orders")
    public List<Orders> getAllOrders(){
        log.info("Orders are showing");
        return OrderRepo.findAll();
    }
    /*@RequestMapping("orders/{customerId}")
    public List<Orders> findById(@PathVariable long customerId){
        log.info("Order found with costumer id "+customerId);
        return OrderRepo.findAllByCustomer_Id(customerId);
    }
    @RequestMapping("orders/add/{ItemsId}/{CustomerId}")
    public String addItems(@PathVariable Long ItemsId, @PathVariable Long CustomerId){
        Customer customer = CustRepo.findById(CustomerId).get();
        Item item = ItemsRepo.findById(ItemsId).get();


        Orders k1 = new Orders((LocalDate.now()).toString(), customer);
        OrderRepo.save(k1);
        k1.addItems(item);
        log.info("Order has been added.");
        return "Order has been placed for customer id " + CustomerId + " with item id " + ItemsId;
    }*/

}
