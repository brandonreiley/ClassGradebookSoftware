public class Assignment implements Comparable <Assignment>{
	private String name;
	private String type;
	private String description;
	private int ID;
	private double percentage;
	

	public Assignment(String name, String type, String description, int ID, double percentage) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.ID = ID;
		this.percentage = percentage;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public int compareTo(Assignment second) {
		return name.compareTo(second.getName());
	}
}
