package com.andriosi.fabio.udemy.erudio.services;

import com.andriosi.fabio.udemy.erudio.exceptions.UnsupportedDivisionByZeroException;
import com.andriosi.fabio.udemy.erudio.exceptions.UnsupportedMethOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double getSum(String firstNumber, String secondNumber) throws Exception{
        return convertToDouble(firstNumber) + convertToDouble(secondNumber);
    }

    public Double getDivision(String firstNumber, String secondNumber)throws Exception{
        if(convertToDouble(secondNumber) == 0){
            throw new UnsupportedDivisionByZeroException("Plese set a numeric value diferent the zero");
        }else{
            return convertToDouble(firstNumber) / convertToDouble(secondNumber);
        }

    }

    public Double getMultiply(String firstNumber, String secondNumber)throws Exception{
        return convertToDouble(firstNumber) * convertToDouble(secondNumber);
    }

    public Double getSub(String firstNumber, String secondNumber)throws Exception{
        return convertToDouble(firstNumber) - convertToDouble(secondNumber);
    }

    private boolean isNumber(String strNumber){
        if(strNumber == null) return false;
         return strNumber.matches("-?[0-9]{1,13}(\\.[0-9]*)?");
    }

    private Double convertToDouble(String strNumber){
        if(strNumber != null){
            String number =  strNumber.replaceAll(",",".");
            if(isNumber(number)){
                return Double.parseDouble(number);
            }else{
                throw new UnsupportedMethOperationException("Please set a numeric value!");
            }
        }else{
            return null;
        }
    }
}
