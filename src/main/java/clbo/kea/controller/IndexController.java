package clbo.kea.controller;

import clbo.kea.model.Category;
import clbo.kea.repositories.CategoryRepository;
import clbo.kea.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class IndexController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @GetMapping("/")
    public String index(){

        System.out.println(categoryRepository.findByDescription("American").get().getDescription());
        System.out.println(unitOfMeasureRepository.findByDescription("Teaspoon").get().getDescription());
        return "index";
    }

    @GetMapping("/api")
    public @ResponseBody Iterable<Category> api(){
        return categoryRepository.findAll();
    }


}
