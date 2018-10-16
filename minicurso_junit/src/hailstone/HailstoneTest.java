package hailstone;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class HailstoneTest {

	@Test
	//{3, 10, 5, 16, 8, 4, 2, 1}
	void test3() {
		List<Integer> expected = new ArrayList<>();
		expected.add(3);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Hailstone.hailstoneSequence(3));
	}
	
	@Test
	// {17,52, 26, 13,40, 20, 10, 5, 16, 8, 4, 2, 1}
	void test17() {
		List<Integer> expected = new ArrayList<>();
		expected.add(17);
		expected.add(52);
		expected.add(13);
		expected.add(40);
		expected.add(20);
		expected.add(10);
		expected.add(5);
		expected.add(16);
		expected.add(8);
		expected.add(4);
		expected.add(2);
		expected.add(1);
		assertEquals(expected, Hailstone.hailstoneSequence(17));
	}

}
