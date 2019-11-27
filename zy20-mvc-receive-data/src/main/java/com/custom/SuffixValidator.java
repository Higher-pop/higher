package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author SherWin
 * @date 2019/11/13 19:33
 */
public class SuffixValidator implements ConstraintValidator<Suffix,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.substring(s.length())!="W"){
            return false;
        }
        return true;
    }
}
