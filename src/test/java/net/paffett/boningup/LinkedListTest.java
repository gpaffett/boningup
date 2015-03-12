package net.paffett.boningup;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals; 

import junit.framework.TestCase;

public class LinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	    LinkedList<String> strings = new LinkedList<String>(); 
	    assertEquals("Should Equal Zero", 0, strings.size());
	    strings.add("One");
	    assertEquals("Should Equal One", 1, strings.size());
	    strings.add("Two");
	    assertEquals("Should Equal Two", 2, strings.size());
	    strings.add("Three");
	    assertEquals("Should Equal Three", 3, strings.size());
	    strings.add("Four");
	    assertEquals("Should Equal Four", 4, strings.size());
	    strings.add("Five");
	    assertEquals("Should Equal Five", 5, strings.size());
	    strings.add("Six");
	    assertEquals("Should Equal Six", 6, strings.size());
	    strings.add("Seven");
	    assertEquals("Should Equal Seven", 7, strings.size());
	}
	
	@Test
	public void testGet() {
		LinkedList<String> strings = new LinkedList<String>(); 
	    strings.add("One");
	    strings.add("Two");
	    strings.add("Three");
	    strings.add("Four");
	    strings.add("Five");
	    strings.add("Six");
	    strings.add("Seven");
	    
	    assertEquals("Seven", strings.get(6));
	    assertEquals("One", strings.get(0));
	    assertEquals("Two", strings.get(1));
	}
	
	

}
