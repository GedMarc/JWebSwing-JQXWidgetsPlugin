/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqxwidgets.window;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * You can use the jqxWindow to direct a user’s attention to a particular activity in your application, such as entering data or viewing information. Consider using a jqxWindow
 * when you want greater
 * customization, you want to block the user interface outside the window, or when you want to retrieve a DialogResult and other data from the popup window.
 * <p>
 * jqxWindow can be displayed as a modal dialog window that blocks user interaction with the underlying user interface or as a standard window without blocking the web page's user
 * interface.
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 25 Dec 2015
 */
@ComponentInformation(name = "JQX Window",
		description = "You can use the jqxWindow to direct a user’s attention to a particular activity in your application, such as entering data or viewing information. Consider using a jqxWindow when you want greater customization, you want to block the user interface outside the window, or when you want to retrieve a DialogResult and other data from the popup window. jqxWindow can be displayed as a modal dialog window that blocks user interaction with the underlying user interface or as a standard window without blocking the web page's user interface. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxwindow/jquery-window-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXWindow
		extends Div<JQXWindowChildren, JQXWindowAttributes, JQXWindowFeature, JQXWindowEvents, JQXWindow>
{


	private JQXWindowFeature feature;

	public JQXWindow()
	{
		addFeature(getFeature());
	}

	public JQXWindowFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXWindowFeature(this);
		}
		return feature;
	}

	@Override
	public JQXWindowOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXWindow jqxWindow = (JQXWindow) o;

		return getFeature().equals(jqxWindow.getFeature());
	}
}
