package pl.szynan.utils.home;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.szynan.utils.home.config.Configurator;
import pl.szynan.utils.home.gui.ThingsToBuyController;
import pl.szynan.utils.home.model.Category;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	private final ObservableList<Category> categories = FXCollections.observableArrayList();

	static {
		new Configurator("Configuration.properties").configure();
	}

	public MainApp() {
	}

	@Override
	public void start(final Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Home Manager");
		initRootLayout();
		showThingsToBuy();
	}

	public void initRootLayout() {
		try {
			final FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("gui/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			final Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public void showThingsToBuy() {
		try {
			final FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("gui/ThingsToBuy.fxml"));
			final AnchorPane thingsToBuy = (AnchorPane) loader.load();

			rootLayout.setCenter(thingsToBuy);

			final ThingsToBuyController controller = loader.getController();
			controller.setMainApp(this);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public ObservableList<Category> getCategories() {
		return categories;
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
