package com;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class MycalculationsTest {
	
	Mycalculations mycalculations;

	@BeforeEach
	void start() {
		mycalculations= new Mycalculations();	
	}
	@Test
	void testAddTwonumber() {
		int c= mycalculations.addTwonumber(10,10);
		assertEquals(c, 20);
	}

	@Test
	void testSubTwonumber() {
	//	fail("Not yet implemented");
	}

	@Test
	void testMultTwonumber() {
		//fail("Not yet implemented");
	}

}
