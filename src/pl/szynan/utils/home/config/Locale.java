package pl.szynan.utils.home.config;

import java.util.Properties;

public class Locale {

	private static final String THINGS_TO_BUY_CATEGORY_NAME = "ThingsToBuy_categoryName";
	private static final String THINGS_TO_BUY_ENTITY_NO = "ThingsToBuy_entityNo";
	private static final String THINGS_TO_BUY_ENTITY_NAME = "ThingsToBuy_entityName";
	private static final String THINGS_TO_BUY_ENTITY_PRIORITY = "ThingsToBuy_entityPriority";
	private static final String THINGS_TO_BUY_ENTITY_CREATION_DATE = "ThingsToBuy_entityCreationDate";

	/*
	 * ThingsToBuy View Names
	 */

	public static String ThingsToBuy_categoryName;
	public static String ThingsToBuy_entityNo;
	public static String ThingsToBuy_entityName;
	public static String ThingsToBuy_entityPriority;
	public static String ThingsToBuy_entityCreationDate;

	static void load(final Properties locale) {
		ThingsToBuy_categoryName = locale.getProperty(THINGS_TO_BUY_CATEGORY_NAME);
		ThingsToBuy_entityNo = locale.getProperty(THINGS_TO_BUY_ENTITY_NO);
		ThingsToBuy_entityName = locale.getProperty(THINGS_TO_BUY_ENTITY_NAME);
		ThingsToBuy_entityPriority = locale.getProperty(THINGS_TO_BUY_ENTITY_PRIORITY);
		ThingsToBuy_entityCreationDate = locale.getProperty(THINGS_TO_BUY_ENTITY_CREATION_DATE);
	}

}
