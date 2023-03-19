package com.example.calculjator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServis servis;

    public CalculatorController(CalculatorServis servis) {
        this.servis = servis;
    }

    @GetMapping
    public String hello(){
        return " Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam (required = false)String num1,@RequestParam (required = false) String num2){
        if (num1==null||num2==null||num1.isEmpty()||num2.isEmpty()){
            return "надо передать два параметра ";
        }
        return  num1+" + "+ num2+ " = "+ servis.sum(Integer.parseInt( num1),Integer.parseInt( num2));

    }
    @GetMapping("/minus")
    public String minus(@RequestParam(required = false)String num1,@RequestParam (required = false) String num2){
        if (num1==null||num2==null||num1.isEmpty()||num2.isEmpty()) {
            return "надо передать два параметра ";
        }
        return  num1+" - "+ num2+ " = "+ servis.minus (Integer.parseInt( num1),Integer.parseInt( num2));

    }
    @GetMapping("/umnogit")
    public String umnogit(@RequestParam(required = false)String num1,@RequestParam(required = false) String num2){
        if (num1==null||num2==null||num1.isEmpty()||num2.isEmpty()) {
            return "надо передать два параметра ";
        }
        return num1+" * "+ num2+ " = "+ servis.umnogit(Integer.parseInt( num1),Integer.parseInt( num2));

    }
    @GetMapping("/podelit")
    public String podelit(@RequestParam  (required = false)String num1,@RequestParam (required = false) String num2){
        if (num1==null||num2==null||num1.isEmpty()||num2.isEmpty()) {
            return "надо передать два параметра ";
        }
        if (num2.equals("0")){
            return "делить на 0 нельзя";
        }
        return num1+" / "+ num2+ " = "+ servis.podelit(Integer.parseInt( num1),Integer.parseInt( num2));

    }

}
