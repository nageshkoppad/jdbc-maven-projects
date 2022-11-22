package com.jar.maven.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperMarketDTO implements Serializable {
	private int id;
	private String name;
	private String company;
	private String gstNo;
	private int pincode;
	private String type;

}
