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
package com.jwebmp.plugins.jqxwidgets.panel;

/**
 * This Class
 *
 * @author GedMarc
 * @since 20 Dec 2015
 */
public enum JQXPanelSizeModes
{
	/**
	 * In the 'fixed' mode, the panel displays scrollbars, if its content requires it.
	 */
	fixed,
	/**
	 * In the wrap mode, the scrollbars are not displayed and the panel automatically changes its size.
	 */
	wrap;

	@Override
	public String toString()
	{
		return super.toString();
	}

}
