
public class Item extends Inventory {
	public String name;
	public String desc;

	Item() {

	}

	public Item(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}




}


