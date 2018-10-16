package abb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {
	BinarySearchTree<Integer> popula(int [] arr) {
		bst =  new BinarySearchTree<Integer>();
		for(int i: arr)
			bst.insert(i);
		return bst;
	}
	
	BinarySearchTree<Integer> bst;
	
	@BeforeEach
	void instancia() {
		bst =  new BinarySearchTree<Integer>();
	}
	
	@Test
	void testNotNull() {
		assertNotNull(bst);
	}

	@Test
	void testSize1() {
		bst.insert(2);
		assertEquals(1, bst.size());
	}
	
	@Test
	void testBalancedSearch() {
		int [] arr = {15,10,20,8,12,16,25};
		bst = popula(arr);
		assertTrue(bst.contains(15));
		assertTrue(bst.contains(10));
		assertTrue(bst.contains(20));
		assertTrue(bst.contains(8));
		assertTrue(bst.contains(12));
		assertTrue(bst.contains(16));
		assertTrue(bst.contains(25));
		assertFalse(bst.contains(0));
		
	}
}
