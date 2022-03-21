package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController {

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, path = "/calc")
	public String calculator(int num1, int num2, char operation) {


        int result;

        switch (operation) {

        case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            return num1 + " + " + num2 + " = " + result;
            

        case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            return num1 + " - " + num2 + " = " + result;

        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            return num1 + " * " + num2 + " = " + result;

        case '/':
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            return num1 + " / " + num2 + " = " + result;

        default:
            System.out.println("something went wrong");
            return "something went wrong";
            
        }

    }
	
	
}
