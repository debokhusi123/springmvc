package com.springmvcc.first.controller;


 
	  
	import java.util.ArrayList;  
	import java.util.List;  
	import org.springframework.stereotype.Controller;  
	import org.springframework.web.bind.annotation.ModelAttribute;  
	import org.springframework.web.bind.annotation.RequestMapping;  
	import org.springframework.web.bind.annotation.RequestMethod;  
	import org.springframework.web.servlet.ModelAndView;  
 
	@Controller  
	public class EmpController {  
		List<Emp> list=new ArrayList<Emp>(); 
	    @RequestMapping("/empform")  
	    public ModelAndView showform(){  
	         //command is a reserved request attribute name, now use <form> tag to show object data  
	        return new ModelAndView("empform","command",new Emp());  
	    }  
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public ModelAndView save(@ModelAttribute("emp") Emp emp){  
	        
	        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
	           
	        list.add(new Emp(1,"rahul",35000f,"S.Engineer"));  
	        list.add(new Emp(2,"aditya",25000f,"IT Manager"));  
	        list.add(new Emp(3,"sachin",55000f,"Care Taker"));  
	        list.add( emp);
	          
	        return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping  
	    }  
	      
	    @RequestMapping("/viewemp")  
	    public ModelAndView viewemp(){  
	       System.out.println(list.size());
	    	//list.add(new Emp());
	    	 
	        return new ModelAndView("viewemp","emplist",list);  
	    }  
	    @RequestMapping(value = "/home", method = RequestMethod.GET)
		public ModelAndView welcome() {
		  return new ModelAndView("index");
		 }

	}
	  

