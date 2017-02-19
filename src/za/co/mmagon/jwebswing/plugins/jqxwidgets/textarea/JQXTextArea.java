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
package za.co.mmagon.jwebswing.plugins.jqxwidgets.textarea;

import za.co.mmagon.jwebswing.base.html.Div;

/**
 * jqxTextArea represents an textarea widget with auto-complete capabilities.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
public class JQXTextArea extends Div<JQXTextAreaChildren, JQXTextAreaAttributes, JQXTextAreaFeature, JQXTextAreaEvents, JQXTextArea>
{

    private static final long serialVersionUID = 1L;
    private JQXTextAreaFeature feature;

    public JQXTextArea()
    {
        addFeature(getFeature());
    }

    public JQXTextAreaFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQXTextAreaFeature(this);
        }
        return feature;
    }

    @Override
    public JQXTextAreaOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
