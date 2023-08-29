// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.StringUtils;

/**
 * Given a, escapes it to html codes, for example
 * 
 * "< Joe & John >" will be converted to 
 * "&lt; Joe &amp; John &gt;"
 */
public class EscapeHTML extends CustomJavaAction<java.lang.String>
{
	private java.lang.String rawString;

	public EscapeHTML(IContext context, java.lang.String rawString)
	{
		super(context);
		this.rawString = rawString;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.escapeHTML(rawString);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "EscapeHTML";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
