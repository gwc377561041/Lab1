package com.teamgz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Main m = new Main();
		String result = m.derivative("1+2+3", 'x');
		assertEquals("0",result);
	}

}
