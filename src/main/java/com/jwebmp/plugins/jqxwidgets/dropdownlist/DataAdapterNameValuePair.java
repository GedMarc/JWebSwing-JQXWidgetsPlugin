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
package com.jwebmp.plugins.jqxwidgets.dropdownlist;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.plugins.jqxwidgets.dataadapter.JQXDataAdapter;
import com.jwebmp.plugins.jqxwidgets.dataadapter.JQXDataFields;

/**
 * This Class
 *
 * @author GedMarc
 * @since 31 Dec 2015
 */
public class DataAdapterNameValuePair
		extends JQXDataAdapter<JQXDropDownListNameValuePair, DataAdapterNameValuePair>
{

	private JQXDropDownList list;

	public DataAdapterNameValuePair(Component component)
	{
		super(component);
		getOptions().getDatafields()
		            .add(new JQXDataFields(GlobalAttributes.Name.toString(), JQXDataFields.JQXDataFieldTypes.String));
		getOptions().getDatafields()
		            .add(new JQXDataFields(GlobalAttributes.Value.toString(), JQXDataFields.JQXDataFieldTypes.String));
	}

	/**
	 * Assigns the name and value pair to the list for display
	 *
	 * @param list
	 */
	public DataAdapterNameValuePair(JQXDropDownList list)
	{
		super(list);
		this.list = list;
	}

	public void updateDropDownList(JQXDropDownList list)
	{
		list.getOptions()
		    .setSource(this);
		list.getOptions()
		    .setDisplayMember(GlobalAttributes.Name.toString());
		list.getOptions()
		    .setValueMember(GlobalAttributes.Value.toString());
	}

	public void updateDropDownListSelectMenu(JQXDropDownListSelectMenu list)
	{
		list.getOptions()
		    .setSource(this);
		list.getOptions()
		    .setDisplayMember(GlobalAttributes.Name.toString());
		list.getOptions()
		    .setValueMember(GlobalAttributes.Value.toString());
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

		DataAdapterNameValuePair that = (DataAdapterNameValuePair) o;

		return list.equals(that.list);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + list.hashCode();
		return result;
	}
}
