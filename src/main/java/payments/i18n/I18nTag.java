package payments.i18n;

import org.apache.log4j.Logger;
import payments.common.Constants;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class I18nTag extends TagSupport {
	private static final Logger LOG = Logger.getLogger(I18nTag.class);
	private String locale;
	private String propertyKey;

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();

		// gets locale from clientbean.
		HttpSession session = pageContext.getSession();

		String selLocale = (String) session.getAttribute("selectedLocale");
		System.out.println("selLocale " + selLocale);

		if (selLocale == null || (!selLocale.equals(Constants.LOCALE_EN) && !selLocale.equals(Constants.LOCALE_RU))) {
			System.out.println("selLocale in " + selLocale);
			LOG.debug("Was setuppped default locale --> " + Constants.LOCALE_DEFAULT);
			locale = Constants.LOCALE_DEFAULT;
		} else {

			if (selLocale.equals(Constants.LOCALE_EN)) {
				System.out.println("EN");
			}
			if (selLocale.equals(Constants.LOCALE_RU)) {
				System.out.println("RU");
			}

			locale = selLocale;
		}

		String message = ResourceManager.getMessage(propertyKey, locale);
		try {
			writer.print(message);
		} catch (IOException ex) {
			LOG.error("Cannot write message.", ex);
		}
		return SKIP_BODY;
	}

	public int doEndTag() {
		return EVAL_PAGE;
	}
}