package com.example.tpp1.Controllers;

import com.example.tpp1.Models.Category;
import com.example.tpp1.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/addCategory")
    public String addCategory(Model model) {
        Category category = new Category();
        model.addAttribute("CategoryForm", category);
        return "new_category";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveCategory(@ModelAttribute("CategoryForm") Category category) {
        categoryService.createCategory(category);
        return "redirect:/all";
    }
}
