/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.jqxwidgets.dataadapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jwebmp.Component;
import com.jwebmp.components.DataAdapter;
import com.jwebmp.guicedinjection.GuiceContext;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterOptions;
import com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterSourceData;
import com.jwebmp.plugins.pools.jqxwidgets.JQXReferencePool;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A Data Adapter Component
 * <p>
 *
 * @param <A>
 * 		The attribute
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "JQX Data Adapter",
		description = "jqxDataAdapter represents a jQuery plug-in which simplifies data binding and data operations and supports binding to local and remote data",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxdataadapter/jquery-data-adapter.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQXWidgetsPlugin/wiki")

public class JQXDataAdapter<A extends com.jwebmp.plugins.jqxwidgets.dataadapter.options.JQXDataAdapterSourceData, J extends JQXDataAdapter<A, J>>
		extends DataAdapter<JQXDataAdapterChildren, JQXDataAdapterAttributes, JQXDataAdapterFeature, JQXDataAdapterEvents, J>
		implements IJQXDataAdapter<A>
{

	private static final long serialVersionUID = 1L;
	private JQXDataAdapterFeature<A> feature;

	/**
	 * Constructs a new Data Adapter
	 *
	 * @param component
	 */
	@SuppressWarnings("unchecked")
	public JQXDataAdapter(Component component)
	{
		super(component);
		addFeature(getFeature());
		if (component != null)
		{
			component.getJavascriptReferences()
			         .add(JQXReferencePool.Data.getJavaScriptReference());
		}
	}

	/**
	 * Returns the JS feature for this data adapter
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public final JQXDataAdapterFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXDataAdapterFeature(this);
		}
		return feature;
	}

	/**
	 * Returns a cleaner version of me
	 *
	 * @return
	 */
	public IJQXDataAdapter asMe()
	{
		return this;
	}

	@Override
	protected StringBuilder renderHTML(int tabCount)
	{
		return new StringBuilder();
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

		JQXDataAdapter<?, ?> that = (JQXDataAdapter<?, ?>) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	/**
	 * Returns all the options associated with the given feature
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public JQXDataAdapterOptions<A> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Renders the given JavaScript for the given component
	 *
	 * @return
	 */
	@Override

	public StringBuilder renderJavascript()
	{
		JQXDataAdapterSourceData dataPacket = getOptions().getLocaldata();
		try
		{
			return new StringBuilder(GuiceContext.getInstance(ObjectMapper.class)
			                                     .writeValueAsString(dataPacket));
		}
		catch (JsonProcessingException ex)
		{
			Logger.getLogger(JQXDataAdapter.class.getName())
			      .log(Level.SEVERE, null, ex);
		}
		return new StringBuilder();
	}

}