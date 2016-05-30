package payments.i18n;

import org.apache.log4j.Logger;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class ResourceManager {

	private static final Logger LOG = Logger.getLogger(ResourceManager.class);

	private static int countLocaleParts;
	private static String[] localeParts;
	private static StringTokenizer strToken;

	/**
	 * Method returns message according locale and key of message
	 * 
	 * @param propertyKey
	 * @param locale
	 * @return message according locale
	 */
	public static String getMessage(String propertyKey, String locale) {
		String message = null;
		Locale loc = null;

		// separates a string like "ru_RU" in part "ru", "RU".
		strToken = new StringTokenizer(locale, "_");
		countLocaleParts = strToken.countTokens();
		localeParts = new String[countLocaleParts];
		for (int i = 0; i < countLocaleParts; i++) {
			localeParts[i] = strToken.nextToken();
		}

		switch (countLocaleParts) {
		case 1:
			loc = new Locale(localeParts[0]);
			break;
		case 2:
			loc = new Locale(localeParts[0], localeParts[1]);
			break;
		default:
			loc = new Locale(localeParts[0]);
			break;
		}

		ResourceBundle bundle = ResourceBundle.getBundle("messages", loc);
		try {
			message = bundle.getString(propertyKey);
		} catch (MissingResourceException ex) {
			LOG.error("Cannot find propertyKey ", ex);
			message = propertyKey;
		}
		LOG.debug("Got propertyKey --> " + propertyKey
				+ "; Returned message --> " + message);
		return message;
	}
}