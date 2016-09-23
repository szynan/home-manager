package pl.szynan.utils.home.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pl.szynan.utils.home.MainApp;
import pl.szynan.utils.home.config.Locale;
import pl.szynan.utils.home.model.Category;
import pl.szynan.utils.home.model.Entity;

public class ThingsToBuyController {

	@FXML
	private TableView<Category> categoriesTable;
	@FXML
	private TableColumn<Category, String> categoryName;

	@FXML
	private TableView<Entity> entitiesTable;
	@FXML
	private TableColumn<Entity, String> entityNo;
	@FXML
	private TableColumn<Entity, String> entityName;
	@FXML
	private TableColumn<Entity, String> entityPriority;
	@FXML
	private TableColumn<Entity, String> entityCreationDate;

	private MainApp mainApp;

	public ThingsToBuyController() {
	}

	@FXML
	private void initialize() {
		categoryName.setText(Locale.ThingsToBuy_categoryName);
		categoryName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		entityNo.setText(Locale.ThingsToBuy_entityNo);
		entityName.setText(Locale.ThingsToBuy_entityName);
		entityPriority.setText(Locale.ThingsToBuy_entityPriority);
		entityCreationDate.setText(Locale.ThingsToBuy_entityCreationDate);
	}

	public void setMainApp(final MainApp mainApp) {
		this.mainApp = mainApp;
		categoriesTable.setItems(mainApp.getCategories());
	}
}
