package com.armyfleet.domain;

import org.testng.*;
import org.testng.annotations.*;

class EchoTest {

	@Test
	public void testEcho(){
		Echo echo = new Echo();
		echo.reportTime();
	}	
}