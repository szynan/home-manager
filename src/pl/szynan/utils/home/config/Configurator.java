package pl.szynan.utils.home.config;

import java.io.InputStream;
import java.util.Properties;

public class Configurator {

	private static final String LOCALE_PROPERTY = "locale";

	private final String configurationPath;

	public Configurator(final String path) {
		configurationPath = path;
	}

	public void configure() {
		// create and load default properties
		final Properties defaultProps = new Properties();
		try (InputStream in = getClass().getResourceAsStream(configurationPath)) {
			defaultProps.load(in);
			final String locale = defaultProps.getProperty(LOCALE_PROPERTY);
			try (InputStream inl = getClass().getResourceAsStream(locale)) {
				final Properties localeProps = new Properties();
				localeProps.load(inl);
				Locale.load(localeProps);
			}
		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
