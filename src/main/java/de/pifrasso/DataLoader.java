package de.pifrasso;

import de.pifrasso.model.Customer;
import de.pifrasso.model.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private CustomerRepository customerRepository;

    @Autowired
    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void run(ApplicationArguments args) {
        customerRepository.save(new Customer(1, "Michael", "lala"));

        customerRepository.save(new Customer(5, "lala", "lala"));
    }
}