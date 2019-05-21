package com.codegym.controller;

import com.codegym.model.Employees;
import com.codegym.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;



    @GetMapping("/employees")
    public ModelAndView listEmployees(@PageableDefault(value = 4) Pageable pageable){
        Page<Employees>employees = employeesService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("employees/list");
        modelAndView.addObject("employees", employees);
        return modelAndView;

    }
    @GetMapping("/create-employees")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("employees/create");
        modelAndView.addObject("employees",new Employees());
        return modelAndView;
    }

    @PostMapping("/create-employees")
    public ModelAndView saveEmployees(@ModelAttribute Employees employees){
        employeesService.save(employees);
        ModelAndView modelAndView = new ModelAndView("employees/create");
        modelAndView.addObject("employees", new Employees());
        modelAndView.addObject("message", " New employees are successfully created");
        return modelAndView;
    }
    @GetMapping("/edit-employees/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id){
        Employees employees = employeesService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employees/edit");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @PostMapping("/edit-employees")
    public ModelAndView updateEmployees(@ModelAttribute("employees")Employees employees){
        employeesService.save(employees);
        ModelAndView modelAndView = new ModelAndView("employees/edit");
        modelAndView.addObject("employees", employees);
        modelAndView.addObject("message", "Staff information has been changed");
        return modelAndView;
    }
    @GetMapping("/delete-employees/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        employeesService.remove(id);
        ModelAndView modelAndView = new ModelAndView("redirect:/employees");
        redirectAttributes.addFlashAttribute("message", "Employee has been removed from the list");
        return modelAndView;
    }
    @GetMapping("/views-employees/{id}")
    public ModelAndView showViewForm(@PathVariable Integer id){
        Employees employees = employeesService.findById(id);
        ModelAndView modelAndView = new ModelAndView("employees/views");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
