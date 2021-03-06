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
package com.jwebmp.plugins.jqxwidgets.grid;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * The Grid is a powerful jQuery widget that displays tabular data. It offers rich support for interacting with data, including paging, grouping, sorting, filtering and editing.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 15 Dec 2015
 */
@ComponentInformation(name = "JQX Grid",
		description = "The Grid is a powerful jQuery widget that displays tabular data. It offers rich support for interacting with data, including paging, grouping, sorting, filtering and editing. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxgrid/jquery-grid-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXGrid
		extends Div<JQXGridChildren, JQXGridAttributes, JQXGridFeature, JQXGridEvents, JQXGrid>
{


	private JQXGridFeature feature;

	public JQXGrid()
	{
		addFeature(getFeature());
	}

	public JQXGridFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXGridFeature(this);
		}
		return feature;
	}

	@Override
	public JQXGridOptions getOptions()
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
		if (!(o instanceof JQXGrid))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXGrid jqxGrid = (JQXGrid) o;

		return getFeature().equals(jqxGrid.getFeature());
	}
}
