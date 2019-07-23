package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	
	@RequestMapping(value="calculate")
	public ModelAndView calculateResult(@RequestParam("n1")String n1,@RequestParam("n2")String n2,@RequestParam("op")String op)
	{
		Integer number1 = Integer.valueOf(n1);
		Integer number2 = Integer.valueOf(n2);
		String operator = op;
		Map<String, Object>attributes=new HashMap<>();
		Integer result = 0;
		switch(op)
		{
		case "+":
			result = number1+number2;
			break;

		case "-":
			result = number1-number2;
			break;

		case "*":
			result = number1*number2;
			break;

		case "/":
			result = number1/number2;
			break;
		}
		String viewname = "calculatorview";
		attributes.put("result", result);
		return new ModelAndView(viewname, attributes);
	}

}
