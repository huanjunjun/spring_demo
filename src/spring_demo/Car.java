package spring_demo;

public class Car {
    private String cname;
   	private String crop;
    private String cprice;
    

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public String getCprice() {
		return cprice;
	}
	public void setCprice(String cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Car [cname=" + cname + ", crop=" + crop + ", cprice=" + cprice + "]";
	}
       
       
}
