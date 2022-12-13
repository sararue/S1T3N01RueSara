package n1exercici1;

import java.util.Objects;

public class Month {
	
	//Attributes
	
	private String name;
	
	//Constructor
	
	public Month (String name) {
		this.name=name;
	}
	
	//Getters i setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	



}
