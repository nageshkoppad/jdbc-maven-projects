package place.in.stadium.enum1;

public enum StadiumTypes {
	 CRICKET("cricket stadium") ,FOOTBALL("football stadium"),HOCKEY("hockey stadium");
	private String value;

	
	private StadiumTypes(String value) {
		this.value = value;
	}
		
		public String getValue() {
			return value;
}
}
