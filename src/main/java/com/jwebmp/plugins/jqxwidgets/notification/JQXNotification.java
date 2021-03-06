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
package com.jwebmp.plugins.jqxwidgets.notification;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxNotification represents a jQuery widget which displays an unobtrusive notification to the user. Multiple instances of the same notification can be shown at the same time.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 20 Dec 2015
 */
@ComponentInformation(name = "JQX Notification",
		description = "jqxNotification represents a jQuery widget which displays an unobtrusive notification to the user. Multiple instances of the same notification can be shown at the same time. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxnotification/jquery-notification-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXNotification
		extends Div<JQXNotificationChildren, JQXNotificationAttributes, JQXNotificationFeature, JQXNotificationEvents, JQXNotification>
		implements GlobalChildren
{


	private JQXNotificationFeature feature;

	public JQXNotification()
	{
		addFeature(getFeature());
	}

	public JQXNotificationFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXNotificationFeature(this);
		}
		return feature;
	}

	@Override
	public JQXNotificationOptions getOptions()
	{
		return getFeature().getOptions();
	}

	public Div addText(String textToAdd)
	{
		JQXNotificationDiv d = new JQXNotificationDiv();
		d.setText(textToAdd);
		add(d);
		return d;
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

		JQXNotification that = (JQXNotification) o;

		return getFeature().equals(that.getFeature());
	}
}
