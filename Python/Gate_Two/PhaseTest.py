from unittest import TestCase
import phase

class PhaseLevelFourFunction(TestCase):

    def test_for(self):

        actual = phase.add_numbers(2,2)

        expected = 4
        

        self.assertEqual(expected,actual)
    
    def test_for_even_numbers(self):

        actual = phase.add_numbers(4,2)
        expected = 6

        self.assertEqual(expected,actual)

    def test_for_square(self):

        actual = phase.add_square(5)
        expected = 5 * 5
        self.assertEqual(expected,actual)

