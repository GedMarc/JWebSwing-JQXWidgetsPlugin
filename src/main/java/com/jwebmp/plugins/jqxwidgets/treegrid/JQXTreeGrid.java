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
package com.jwebmp.plugins.jqxwidgets.treegrid;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxTreeGrid is a lightweight jQuery widget which represents data in a tree-like structure.
 * <p>
 * The TreeGrid(also known as TreeList) widget supports multi column display of hierarchical data, data paging, sorting and filtering, data editing, columns resizing, fixed
 * columns, conditional
 * formatting, aggregates and rows selection.
 * <p>
 * It can read and display the data from your data sources like XML, JSON, Array, CSV or TSV.
 * <p>
 * jqxTreeGrid has intuitive and easy to use APIs and works across devices and browsers.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 24 Dec 2015
 */
@ComponentInformation(name = "JQX Tree Grid",
		description = "jqxTreeGrid is a lightweight jQuery widget which represents data in a tree-like structure. The TreeGrid(also known as TreeList) widget supports multi column display of hierarchical data, data paging, sorting and filtering, data editing, columns resizing, fixed columns, conditional formatting, aggregates and rows selection.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtreegrid/jquery-treegrid-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXTreeGrid
		extends Div<JQXTreeGridChildren, JQXTreeGridAttributes, JQXTreeGridFeature, JQXTreeGridEvents, JQXTreeGrid>
{


	private JQXTreeGridFeature feature;

	public JQXTreeGrid()
	{
		addFeature(getFeature());
	}

	public JQXTreeGridFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXTreeGridFeature(this);
		}
		return feature;
	}

	@Override
	public JQXTreeGridOptions getOptions()
	{
		return getFeature().getOptions();
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

		JQXTreeGrid that = (JQXTreeGrid) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
