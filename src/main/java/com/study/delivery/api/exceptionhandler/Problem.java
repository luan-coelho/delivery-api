package com.study.delivery.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problem {

	private Integer statusCode;
	private LocalDateTime datetime;
	private String title;
	private List <Field> fields;
}
