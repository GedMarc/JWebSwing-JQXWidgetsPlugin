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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class JQXGridFeature
		extends Feature<GlobalFeatures, JQXGridOptions, JQXGridFeature>
{


	private final JQXGrid forComponent;
	private JQXGridOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQXGridFeature(JQXGrid forComponent)
	{
		super("JQXGridFeature");
		this.forComponent = forComponent;
		getJavascriptReferences().add(JQXReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Data.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ScrollBar.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Menu.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.ListBox.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.DropDownList.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.Grid.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridSelection.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridColumnsReOrder.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridColumnsResize.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridSort.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridPager.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridGrouping.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridEditing.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridStateSave.getJavaScriptReference());
		getJavascriptReferences().add(JQXReferencePool.GridAggregatesPlugIn.getJavaScriptReference());
		getCssReferences().add(JQXReferencePool.Core.getCssReference());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQXGridOptions getOptions()
	{
		if (options == null)
		{
			options = new JQXGridOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = forComponent.getJQueryID() + "jqxGrid(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);

	}
}
