package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mkyong.customer.dao.CustomerDAO;
import com.mkyong.customer.model.Customer;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      ApplicationContext context =
    		new ClassPathXmlApplicationContext("file:src/resources/Spring-Module.xml");

        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        //Customer customer = new Customer(, "mkyong",28);
        //customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1.getAge() + ":" + customer1.getName() +" : "+ customer1.getCustId());

    }
}
