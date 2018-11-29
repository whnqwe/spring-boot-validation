package cn.zhangspace.springbootvalidation.config;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class UserAddressValidator implements ConstraintValidator<ValidUserAddress, String> {

    @Override
    public void initialize(ValidUserAddress constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(Objects.equals(value,null)){
            return false;
        }

        Boolean addressSuffix = value.startsWith("ZH_");
        if(addressSuffix){
            return true;
        }
        return false;
    }
}
