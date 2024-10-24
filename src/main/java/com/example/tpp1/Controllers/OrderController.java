package com.example.tpp1.Controllers;

import com.example.tpp1.Models.Order;
import com.example.tpp1.Services.OrderService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping("/addOrder")
    public String addOrder(Model model) {
        Order order = new Order();
        model.addAttribute("OrderForm", order);
        return "new_order";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("OrderForm") Order order) {
        orderService.createOrder(order);
        return "redirect:/all";
    }
}
