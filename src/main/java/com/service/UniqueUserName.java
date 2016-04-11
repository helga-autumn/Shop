package com.service;

import java.lang.annotation.ElementType;

import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ElementType.FIELD})


@Constraint(validatedBy=UniqueUserNameValidator.class)
public @interface UniqueUserName {
	String message();
	Class<?>[] groups() default {};
	Class <?extends Payload>[] payload() default {};
	
	
	

}
