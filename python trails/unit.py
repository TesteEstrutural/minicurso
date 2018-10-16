import unittest
import coverage
import foo
class MyTestCases(unittest.TestCase):
    def tests(self):
        self.assertEqual(foo.insertionSort([3,2,1]), [1,2,3])


if __name__ == "__main__":
    unittest.main()
