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
package za.co.mmagon.jwebswing.plugins.jqxwidgets;

import za.co.mmagon.jwebswing.utilities.StaticStrings;

/**
 * @author MXM3727
 */
public enum JQXRoundedCornerTypes
{
	All,
	Top,//- for top corners
	
	Bottom,//' - for bottom corners
	
	Left,// - for left corners
	
	Right,// - for right corners
	
	Top_right,// - for top right corners
	
	Top_left,// - for top left corners
	
	Bottom_right,// - for bottom right corners
	
	Bottom_left,// - for bottom left corners
	;
	
	@Override
	public String toString()
	{
		return "jqx-rc-" + name().toLowerCase().replace(StaticStrings.CHAR_UNDERSCORE, '-');
	}
	
}
