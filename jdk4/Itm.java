package epm.com.jdk4;

public class Itm {

	private String itemname;
	private double price;

	public Itm(String itemname, double price){
	this.itemname = itemname;
	this.price = price;
	}
	public String getItemname() { return itemname; }
	public void setItemname(String itemname) { this.itemname = itemname; }
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemname == null) ? 0 : itemname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Itm other = (Itm) obj;
		if (itemname == null) {
			if (other.itemname != null)
				return false;
		} else if (!itemname.equals(other.itemname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

}
