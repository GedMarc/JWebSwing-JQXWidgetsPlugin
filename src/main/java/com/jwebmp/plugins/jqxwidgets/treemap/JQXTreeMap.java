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
package com.jwebmp.plugins.jqxwidgets.treemap;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxTreeMap displays hierarchical data as a set of nested rectangles. Each branch of the tree is given a rectangle, which is then tiled with smaller rectangles representing
 * sub-branches. A leaf
 * node's rectangle has an area proportional to a specified dimension on the data.
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 25 Dec 2015
 */
@ComponentInformation(name = "JQX Tree Map",
		description = "jqxTreeMap displays hierarchical data as a set of nested rectangles. Each branch of the tree is given a rectangle, which is then tiled with smaller rectangles representing sub-branches. A leaf node's rectangle has an area proportional to a specified dimension on the data. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxtreemap/jquery-treemap-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXTreeMap
		extends Div<JQXTreeMapChildren, JQXTreeMapAttributes, JQXTreeMapFeature, JQXTreeMapEvents, JQXTreeMap>
{


	private JQXTreeMapFeature feature;

	public JQXTreeMap()
	{
		addFeature(getFeature());
	}

	public JQXTreeMapFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXTreeMapFeature(this);
		}
		return feature;
	}

	@Override
	public JQXTreeMapOptions getOptions()
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

		JQXTreeMap that = (JQXTreeMap) o;

		return getFeature().equals(that.getFeature());
	}
}
