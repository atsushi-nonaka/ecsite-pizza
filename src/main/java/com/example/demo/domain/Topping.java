package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topping {
	private Integer id;
	private String name;
	private Integer priceM;
	private Integer priceL;
}
