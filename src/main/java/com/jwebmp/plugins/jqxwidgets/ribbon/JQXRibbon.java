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
package com.jwebmp.plugins.jqxwidgets.ribbon;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqxwidgets.panel.JQXPanel;

import java.util.ArrayList;
import java.util.List;

/**
 * jqxRibbon represents a jQuery widget which can be used as a tabbed toolbar or mega menu.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Ribbon",
		description = "jqxRibbon represents a jQuery widget which can be used as a tabbed toolbar or mega menu. ",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxribbon/jquery-ribbon-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXRibbon
		extends Div<JQXRibbonChildren, NoAttributes, JQXRibbonFeature, JQXRibbonEvents, JQXRibbon>
{


	private JQXRibbonFeature feature;

	private JQXRibbonList unorderedList;
	private JQXRibbonContent itemDivs;
	private List<JQXRibbonItem> ribbonItems;

	public JQXRibbon()
	{
		addFeature(getFeature());
		unorderedList = new JQXRibbonList();
		itemDivs = new JQXRibbonContent();
		add(unorderedList);
		add(itemDivs);
	}

	public JQXRibbonFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXRibbonFeature(this);
		}
		return feature;
	}

	public JQXRibbonItem addRibbonItem(String itemHeader, JQXPanel componentToDisplay)
	{
		return addRibbonItem(new ListItem(itemHeader), componentToDisplay);
	}

	private JQXRibbonItem addRibbonItem(ListItem item, JQXPanel componentToDisplay)
	{
		JQXRibbonItem rib = new JQXRibbonItem(item, componentToDisplay);
		return addRibbonItem(rib);
	}

	public JQXRibbonItem addRibbonItem(JQXRibbonItem ribbon)
	{
		unorderedList.add(ribbon.getHeader());
		itemDivs.add(ribbon.getContent());
		getRibbonItems().add(ribbon);
		return ribbon;
	}

	public List<JQXRibbonItem> getRibbonItems()
	{
		if (ribbonItems == null)
		{
			ribbonItems = new ArrayList<>();
		}
		return ribbonItems;
	}

	public void setRibbonItems(List<JQXRibbonItem> ribbonItems)
	{
		if (this.ribbonItems == null)
		{
			this.ribbonItems = new ArrayList<>();
		}
		this.ribbonItems = ribbonItems;
	}

	@Override
	public JQXRibbonOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		result = 31 * result + unorderedList.hashCode();
		result = 31 * result + itemDivs.hashCode();
		result = 31 * result + getRibbonItems().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQXRibbon))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQXRibbon jqxRibbon = (JQXRibbon) o;

		if (!getFeature().equals(jqxRibbon.getFeature()))
		{
			return false;
		}
		if (!unorderedList.equals(jqxRibbon.unorderedList))
		{
			return false;
		}
		if (!itemDivs.equals(jqxRibbon.itemDivs))
		{
			return false;
		}
		return getRibbonItems().equals(jqxRibbon.getRibbonItems());
	}

	public static class JQXRibbonItem

	{


		private ListItem header;
		private Div content;

		public JQXRibbonItem(ListItem header)
		{
			this(header, null);
		}

		public JQXRibbonItem(ListItem header, Div content)
		{
			this.header = header;
			this.content = content;
		}

		public ListItem getHeader()
		{
			return header;
		}

		public void setHeader(ListItem header)
		{
			this.header = header;
		}

		public Div getContent()
		{
			return content;
		}

		public void setContent(Div content)
		{
			this.content = content;
		}
	}
}
