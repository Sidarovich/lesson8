package epm.com.jdk4;

import java.util.List;
import java.util.ArrayList;

public class pay {
	private List<Itm> items = new ArrayList<Itm>();

	public pay() {
	}

	public List<Itm> getItems() {
		return items;
	}

	public void add(Itm item) {
		items.add(item);
	}

	public boolean delete(Itm item) {
		return items.remove(item);
	}

	public Itm findByName(String itemname) {
		for (Itm item : items) {
			if (item.getItemname().equals(itemname)) {
				return item;
			}
		}
		return null;
	}

	public double totalamount() {
		double sum = 0;
		for (Itm item : items) {
			sum = sum + item.getPrice();
		}
		return sum;
	}
}
