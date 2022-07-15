/**
 * 
 */
package com.trungcu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Admin
 *
 */
class TestCI {

	@Test
	void test() {
		assertEquals(5, new com.trungcu.core.Test().a(5));
		assertEquals(7, new com.trungcu.core.Test().a(7));
	}

}
