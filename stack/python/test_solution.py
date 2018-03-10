import unittest
import solution


class TestUtilModule(unittest.TestCase):
    def setUp(self):
        self.balanced_strings = ('({(<>)})', '()', '[]()', '{{}}')
        self.unbalanced_strings = ('({())})<', '[', '(){', '<{}')

    def test_balanced(self):
        for case in self.balanced_strings:
            self.assertTrue(solution.is_balanced(case), "Expected balanced string")

    def test_unbalanced(self):
        for case in self.unbalanced_strings:
            self.assertFalse(solution.is_balanced(case), "Expected unbalanced string")


if __name__ == '__main__':
    suite = unittest.TestSuite()
    suite.addTest(TestUtilModule('test_balanced'))
    suite.addTest(TestUtilModule('test_unbalanced'))

    runner = unittest.TextTestRunner()
    runner.run(suite)
