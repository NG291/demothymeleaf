package com.demothemleaf.controller;

import com.demothemleaf.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ThymeleafController {
    @GetMapping("/condition")
    public ModelAndView demo(){
        ModelAndView modelAndView= new ModelAndView("condition");
        List<Customer> customers= new ArrayList<>();
        customers.add(new Customer(1, "CodeGym Ha Noi","Ha Noi"));
        customers.add(new Customer(2, "CodeGym Da Nang","Da Nang"));
        customers.add(new Customer(3, "CodeGym Ho Chi Minh","Ha Noi"));
        customers.add(new Customer(3, "CodeGym Viet Nam","Viet Nam"));
        modelAndView.addObject("customers", customers);
        return  modelAndView;
    }
    @GetMapping("/loop")
    public ModelAndView loop(){
        ModelAndView modelAndView = new ModelAndView("loop");
        List<Customer> customers= new ArrayList<>();
        customers.add(new Customer(1,"Nguyen","Nam Dinh"));
        customers.add(new Customer(2,"Huy","Thai Binh"));
        modelAndView.addObject("customers", customers);
        return  modelAndView;
    }
    @GetMapping("/expressions")
    public ModelAndView expressions(){
        ModelAndView modelAndView = new ModelAndView("/expressions");
        String name = "Demo Bieu Thuc";
        Customer customer = new Customer(1,"CodeGym");
        modelAndView.addObject("name",name);
        modelAndView.addObject("customer", customer);
        return  modelAndView;
    }

}
