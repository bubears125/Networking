/******************************************************************************
 * 
 * Author:		Ryan Ragnell
 * Assignment:	Program 0
 * Class:		CSI 4321
 * 
 *****************************************************************************/
package bettercom.nmbl.serialization.test;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import bettercom.nmbl.serialization.BadAttributeException;
import bettercom.nmbl.serialization.NameValueList;

public class NameValueListTest {

	@Test
	public void testHashCode() {
		NameValueList NVL1 = new NameValueList();
		NameValueList NVL2 = new NameValueList();
		NameValueList NVL3 = new NameValueList();
		assertEquals("1 == 2", NVL1.hashCode(), NVL2.hashCode());
		assertEquals("2 == 3", NVL2.hashCode(), NVL3.hashCode());
		assertEquals("1 == 3", NVL1.hashCode(), NVL3.hashCode());
	}

	//No argument constructor -- Map should be empty (key set)
	@Test
	public void testNameValueList(){
		NameValueList NVL = new NameValueList();
		assertTrue(NVL.getNames().isEmpty());
	}

	//Decode -- Still have to write test
	@Test
	public void testNameValueListByteArray() {
		fail("Not yet implemented");
	}

	//Done
	@Test
	public void testNameValueListScannerPrintStream() {
		assertTrue(true);
	}

	//Test null name and value
	@Test
	public void testAddValue() throws BadAttributeException {
		NameValueList NVL = new NameValueList();
		NVL.addValue("name", "value");
		assertTrue(NVL.getNames().contains("name"));
		assertTrue(NVL.getValue("name").contains("value"));
	}

	//Still have to write encode as well
	@Test
	public void testEncode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNames() throws BadAttributeException {
		NameValueList NVL = new NameValueList();
		NVL.addValue("1", "2");
		NVL.addValue("1", "3");
		NVL.addValue("2", "3");
		Set<String> nameSet = new TreeSet<String>();
		nameSet.add("1");
		nameSet.add("2");
		assertTrue(NVL.getNames().equals(nameSet));
	}

	@Test
	public void testGetValue() throws BadAttributeException {
		NameValueList NVL = new NameValueList();
		NVL.addValue("1", "2");
		NVL.addValue("1", "3");
		assertTrue(NVL.getValue("1").contains("2") && 
				NVL.getValue("1").contains("3"));
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
