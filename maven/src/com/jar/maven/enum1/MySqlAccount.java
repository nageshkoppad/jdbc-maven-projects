package com.jar.maven.enum1;
public enum MySqlAccount {
	URL("jdbc:mysql://localhost:3306/collection"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String values;
	
	private MySqlAccount(String values) {
		this.values=values;
	}
	
	public String getValues() {
		return values;
	}

}
