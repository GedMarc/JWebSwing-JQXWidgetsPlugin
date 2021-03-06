/*
 * Copyright (C) 2016 GedMarc
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
package com.jwebmp.plugins.jqxWidgets.buttons;

import com.jwebmp.core.Page;
import com.jwebmp.plugins.jqxwidgets.JQXRoundedCornerTypes;
import com.jwebmp.plugins.jqxwidgets.buttons.JQXButtonImagesPositions;
import com.jwebmp.plugins.jqxwidgets.buttons.JQXButtonOptions;
import com.jwebmp.plugins.jqxwidgets.buttons.JQXButtonTemplates;
import com.jwebmp.plugins.jqxwidgets.buttons.JQXButtonTextImageRelation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author GedMarc
 */
public class JQXButtonOptionsTest

{

	public JQXButtonOptionsTest()
	{
	}

	/**
	 * Test of getDelay method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetDelay()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setDelay(500);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"delay\" : 500\n" + "}", jpo.toString());
	}

	/**
	 * Test of setDelay method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetDelay()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setDelay(600);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"delay\" : 600\n" + "}", jpo.toString());
	}

	/**
	 * Test of getDisabled method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetDisabled()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setDisabled(true);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"disabled\" : true\n" + "}", jpo.toString());
	}

	/**
	 * Test of setDisabled method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetDisabled()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setDisabled(true);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"disabled\" : true\n" + "}", jpo.toString());
	}

	/**
	 * Test of getRoundedCorners method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetRoundedCorners()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setRoundedCorners(JQXRoundedCornerTypes.Bottom);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"roundedCorners\" : \"jqx-rc-bottom\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setRoundedCorners method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetRoundedCorners()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setRoundedCorners(JQXRoundedCornerTypes.Top);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"roundedCorners\" : \"jqx-rc-top\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of getRtl method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetRtl()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setRtl(true);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"rtl\" : true\n" + "}", jpo.toString());
	}

	/**
	 * Test of setRtl method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetRtl()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setRtl(true);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"rtl\" : true\n" + "}", jpo.toString());
	}

	/**
	 * Test of getTemplate method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetTemplate()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTemplate(JQXButtonTemplates.Info);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"template\" : \"info\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setTemplate method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetTemplate()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTemplate(JQXButtonTemplates.Info);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"template\" : \"info\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of getToggled method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetToggled()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setToggled(true);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"toggled\" : true\n" + "}", jpo.toString());
	}

	/**
	 * Test of setToggled method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetToggled()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setToggled(false);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"toggled\" : false\n" + "}", jpo.toString());
	}

	/**
	 * Test of getImgSrc method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetImgSrc()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgSrc("src");
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgSrc\" : \"src\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setImgSrc method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetImgSrc()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgSrc("src");
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgSrc\" : \"src\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of getImgWidth method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetImgWidth()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgWidth(500);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgWidth\" : 500\n" + "}", jpo.toString());
	}

	/**
	 * Test of setImgWidth method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetImgWidth()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgWidth(500);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgWidth\" : 500\n" + "}", jpo.toString());
	}

	/**
	 * Test of getImgHeight method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetImgHeight()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgHeight(500);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgHeight\" : 500\n" + "}", jpo.toString());
	}

	/**
	 * Test of setImgHeight method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetImgHeight()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgHeight(500);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgHeight\" : 500\n" + "}", jpo.toString());
	}

	/**
	 * Test of getImgPosition method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetImgPosition()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgPosition(JQXButtonImagesPositions.bottom);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgPosition\" : \"bottom\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setImgPosition method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetImgPosition()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setImgPosition(JQXButtonImagesPositions.bottom);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"imgPosition\" : \"bottom\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of getTextPosition method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetTextPosition()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTextPosition(JQXButtonImagesPositions.bottom);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"textPosition\" : \"bottom\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setTextPosition method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetTextPosition()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTextPosition(JQXButtonImagesPositions.bottom);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"textPosition\" : \"bottom\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of getTextImageRelation method, of class JQXButtonOptions.
	 */
	@Test
	public void testGetTextImageRelation()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTextImageRelation(JQXButtonTextImageRelation.textAboveImage);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"textImageRelation\" : \"textAboveImage\"\n" + "}", jpo.toString());
	}

	/**
	 * Test of setTextImageRelation method, of class JQXButtonOptions.
	 */
	@Test
	public void testSetTextImageRelation()
	{
		Page<?> p = new Page();
		JQXButtonOptions jpo = new JQXButtonOptions();
		jpo.setTextImageRelation(JQXButtonTextImageRelation.textAboveImage);
		System.out.println(jpo.toString());
		assertEquals("{\n" + "  \"textImageRelation\" : \"textAboveImage\"\n" + "}", jpo.toString());
	}

}
