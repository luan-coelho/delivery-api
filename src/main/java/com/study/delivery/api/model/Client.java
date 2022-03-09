package com.study.delivery.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
	private Long id;
	private String name;
	private String email;
	private String password;
	private String phone;
}
