package pl.szynan.utils.home.config;

import java.io.InputStream;
import java.util.Properties;

public class Configurator {
	
	private final String configurationPath;
	
	public Configurator (String path) {
		configurationPath = path;
	}
	
	public void configure() {
		// create and load default properties
		Properties defaultProps = new Properties();
		try (InputStream in = getClass().getResourceAsStream(configurationPath)) {
			defaultProps.load(in);
			String locale = defaultProps.getProperty("locale");
			try (InputStream inl = getClass().getResourceAsStream(locale)) {
				Properties localeProps = new Properties();
				localeProps.load(inl);
				Locale.load(localeProps);
			}
		} catch (Exception e){
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
