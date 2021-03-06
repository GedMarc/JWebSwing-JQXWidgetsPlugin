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
package com.jwebmp.plugins.jqxwidgets.numberinput;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * jqxNumberInput represents a jQuery widget that allows you to input currency, percentages and any type of numeric data.
 * <p>
 * The edited data can be presented in various formats.
 * <p>
 * Other built-in capabilities are customizable number of digits and decimal digits, currency symbol's string and position, group and decimal separator character.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 20 Dec 2015
 */
@ComponentInformation(name = "JQX Number Input",
		description = "jqxNumberInput represents a jQuery widget that allows you to input currency, percentages and any type of numeric data. The edited data can be presented in various formats.",
		url = "http://www.jqwidgets.com/jquery-widgets-documentation/documentation/jqxnumberinput/jquery-number-input-getting-started.htm?search=",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQXWidgetsPlugin/wiki")
public class JQXNumberInput
		extends Div<JQXNumberInputChildren, JQXNumberInputAttributes, JQXNumberInputFeature, JQXNumberInputEvents, JQXNumberInput>
{


	private JQXNumberInputFeature feature;

	public JQXNumberInput()
	{
		addFeature(getFeature());
	}

	public JQXNumberInputFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQXNumberInputFeature(this);
		}
		return feature;
	}

	@Override
	public JQXNumberInputOptions getOptions()
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

		JQXNumberInput that = (JQXNumberInput) o;

		return getFeature().equals(that.getFeature());
	}
}
