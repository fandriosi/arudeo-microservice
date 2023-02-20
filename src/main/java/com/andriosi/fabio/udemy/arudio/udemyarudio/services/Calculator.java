package com.andriosi.fabio.udemy.arudio.udemyarudio.services;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public Double getSum(String firstNumber, String secondNumber) throws Exception{
        if(isNumber(firstNumber) && isNumber(secondNumber)){
            return convertToDouble(firstNumber) + convertToDouble(secondNumber);
        }else{
            throw new Exception("Valor inválido exception");
        }
        
    }

    public Double getDivid(String firstNumber, String secondNumber)throws Exception{
        if(isNumber(firstNumber) && isNumber(secondNumber)){
            return convertToDouble(firstNumber) + convertToDouble(secondNumber);
        }else{
            throw new Exception("Valor inválido exception");
        }
    }

    public Double getMultiply(String firstNumber, String secondNumber)throws Exception{
        if(isNumber(firstNumber) && isNumber(secondNumber)){
            return convertToDouble(firstNumber) + convertToDouble(secondNumber);
        }else{
            throw new Exception("Valor inválido exception");
        }
    }

    public Double getSub(String firstNumber, String secondNumber)throws Exception{
        if(isNumber(firstNumber) && isNumber(secondNumber)){
            return convertToDouble(firstNumber) + convertToDouble(secondNumber);
        }else{
            throw new Exception("Valor inválido exception");
        }
    }

    private boolean isNumber(String strNumber){
        if(strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\\\.?[0-9]+");
    }

    private Double convertToDouble(String strNumber){
        if(strNumber != null){
            if(isNumber(strNumber)){
                String number = strNumber.replaceAll(",", ".");
                return Double.parseDouble(number);
            }else{
                return null;
            }

        }else{
            return null;
        }
    }
}
