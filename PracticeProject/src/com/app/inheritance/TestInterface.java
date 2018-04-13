package com.app.inheritance;

public interface TestInterface {
	
	default boolean equals()
	{
		return false;
	}

}
