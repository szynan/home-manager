package pl.szynan.utils.home.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Category {
	
	private final StringProperty name;
	private final IntegerProperty id;
	
	public Category(String name, int id) {
		this.name = new SimpleStringProperty(name);
		this.id = new SimpleIntegerProperty(id);
	}

	public StringProperty nameProperty() {
		return name;
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String name() {
		return name.get();
	}
	
	public IntegerProperty idProperty() {
		return id;
	}
	
	public void setId(int id) {
		this.id.set(id);
	}
	
	public int id() {
		return id.get();
	}

}
