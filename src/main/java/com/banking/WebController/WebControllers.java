package com.banking.WebController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.banking.Entity.Customer;
import com.banking.Service.CustomerService;

@Controller
public class WebControllers {
	
	  @Autowired
		private CustomerService service;
		@RequestMapping("/")
		public String viewHomePage(Model model) {
			List<Customer> listCustomers = service.listAll();
			model.addAttribute("listCustomers", listCustomers);
			return "index";
		}
	    
		@RequestMapping("/new")
		public String showSignup(Model model) {
			Customer customer = new Customer();
			model.addAttribute("customer", customer);
			return "register";
		}
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveCustomer(@ModelAttribute("customer") Customer customer) {
			service.save(customer);
			return "redirect:/";
		}
		@RequestMapping("/edit/{id}")
		public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
			ModelAndView mav = new ModelAndView("edit_customer");
			Customer customer = service.get(id);
			mav.addObject("customer", customer);
			return mav;
		}
		// Testing of Edit Page
		@RequestMapping("/edit")
		public String edit() {
			return "edit_customer";
		}
		@RequestMapping("/delete/{id}")
		public String deleteCustomer(@PathVariable(name = "id") int id) {
			service.delete(id);
			return "redirect:/";		
		}
}
