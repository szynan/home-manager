package pl.szynan.utils.home.model;

import java.util.LinkedList;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Entity {

	private final StringProperty name;
	private final IntegerProperty id;
	private final List<Category> categories;
	private final IntegerProperty priority;
	private final StringProperty info;

	public Entity(String name, int id) {
		this.name = new SimpleStringProperty(name);
		this.id = new SimpleIntegerProperty(id);
		this.categories = new LinkedList<Category>();
		this.priority = new SimpleIntegerProperty(0);
		this.info = new SimpleStringProperty("");
	}

}
