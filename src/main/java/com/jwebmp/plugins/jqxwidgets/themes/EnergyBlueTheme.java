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
package com.jwebmp.plugins.jqxwidgets.themes;

import com.jwebmp.base.references.CSSReference;
import com.jwebmp.htmlbuilder.css.themes.Theme;

/**
 * A default theme for a web site Very monochrome stock standard stuff
 *
 * @author Marc Magon
 */
public class EnergyBlueTheme
		extends Theme
{

	public EnergyBlueTheme()
	{
		super("Energy Blue Theme", "jqxenergyblue");
		getCssReferences().add(new CSSReference("JQXenergyblueTheme", 3.91, "bower_components/jqwidgets/jqwidgets/styles/jqx.energyblue.css",
		                                        "https://jqwidgets.com/public/jqwidgets/styles/jqx.energyblue.css"));

	}

}