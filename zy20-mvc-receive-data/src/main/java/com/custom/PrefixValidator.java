package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author SherWin
 * @date 2019/11/13 19:26
 */
public class PrefixValidator implements ConstraintValidator<Prefix,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.substring(0,1)!="X"){
           return false;
        }
        return true;
    }
}

