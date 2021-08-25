package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderTopping {
	private Integer id;
	private Integer toppingId;
	private Integer orderItemId;
	private Topping topping;
}
