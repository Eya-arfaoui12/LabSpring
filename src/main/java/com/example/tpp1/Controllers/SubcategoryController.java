package com.example.tpp1.Controllers;

import com.example.tpp1.Models.Subcategory;
import com.example.tpp1.Services.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubcategoryController {
    @Autowired
    SubcategoryService subcategoryService;

    @RequestMapping("/addSubcategory")
    public String addSubcategory(Model model) {
        Subcategory subcategory = new Subcategory();
        model.addAttribute("SubcategoryForm", subcategory);
        return "new_subcategory";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSubcategory(@ModelAttribute("SubcategoryForm") Subcategory subcategory) {
        subcategoryService.createSubcategory(subcategory);
        return "redirect:/all";
    }
}
