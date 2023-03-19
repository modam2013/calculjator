package com.example.calculjator;

import org.springframework.stereotype.Service;

    @Service
    public class CalculatorServisImpl implements CalculatorServis {
        public int sum( int num1,int num2){
            return num1+num2;
        }
        public int minus( int num1,int num2){
            return num1-num2;
        }
        public int umnogit( int num1,int num2){
            return num1*num2;
        }
        public int podelit( int num1,int num2){
            return num1/ num2;
        }
    }

