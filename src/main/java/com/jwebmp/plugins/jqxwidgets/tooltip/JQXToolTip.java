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
package com.jwebmp.plugins.jqxwidgets.tooltip;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxTooltip represents a jQuery widget that displays a popup message. The widget can be used in combination with any html element. You just need to call the jqxTooltip's 'add'
 * method and pass the
 * html element as parameter.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Tooltip",
		description = "jqxTooltip represents a jQuery widget that displays a popup message. The widget can be used in combination with any html element. You just need to call the jqxTooltip's 'add' method and pass the html element as parameter. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtooltip/jquery-tooltip-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXToolTip
		extends Div<JQXToolTipChildren, JQXToolTipAttributes, JQXToolTipFeature, JQXToolTipEvents, JQXToolTip>
{


	private JQXToolTipFeature feature;

	public JQXToolTip()
	{
		addFeature(getFeature());
	}

	public JQXToolTipFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXToolTipFeature(this);
		}
		return feature;
	}

	@Override
	public JQXToolTipOptions getOptions()
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

		JQXToolTip that = (JQXToolTip) o;

		return getFeature().equals(that.getFeature());
	}
}
