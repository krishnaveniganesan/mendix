// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mendixsso.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import mendixsso.implementation.SessionManager;

public class LogOutUser extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String uuid;

	public LogOutUser(IContext context, java.lang.String uuid)
	{
		super(context);
		this.uuid = uuid;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        SessionManager.logoutAllSessionsOfForeignIdentity(getContext(), uuid);
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "LogOutUser";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
