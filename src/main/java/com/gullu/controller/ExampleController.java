package com.gullu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gullu.Bean.CustomerBean;

@Controller
public class ExampleController {
	
	@RequestMapping("/index.html")
	public String indexpage() {
		return "index";
	}
	 
	  
    @RequestMapping(value="/form.html", method=RequestMethod.GET)
    public String customerForm(@ModelAttribute("custCmd") CustomerBean customer){
        return "form";
    }
 
    @RequestMapping(value="/form.html", method=RequestMethod.POST)
    public String customerSubmit(Map<String,Object> map,@ModelAttribute("custCmd") CustomerBean customer) {
    	String result="";
    	if(customer!=null) {
    	System.out.println(customer.getFirst_Name());
    	System.out.println(customer.getLast_Name());
    	
    	result="file submitted";
    	map.put("result",result);
    	}
    	else {
    		result="File not submitted";
    		map.put("result", result);
    	}
    	return "form";       
    }
}
