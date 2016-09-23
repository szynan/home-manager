package pl.szynan.utils.home.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pl.szynan.utils.home.MainApp;
import pl.szynan.utils.home.model.Category;

public class ThingsToBuyController {

	@FXML
	private TableView<Category> categoryTable;
	@FXML
	private TableColumn<Category, String> nameColumn;

	private MainApp mainApp;

	public ThingsToBuyController() {
	}

	@FXML
	private void initialize() {
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		categoryTable.setItems(mainApp.getCategories());
	}
}
