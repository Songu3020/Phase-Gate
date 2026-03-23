from unittest import TestCase
import sunday_task

class TestEvenCount(TestCase):
    def test_Even_count(self):
        numbers = [2,4,5,6,7]
        even_count = sunday_task
        actual = sunday_task.count_even_numbers(numbers)
        expected  = 3
        self.assertEqual(actual, expected) 

class TestLinearSearch(TestCase):
    def test_linear_Search(self):
        numbers = [10,20,30,40]
        target = 30
        actual = sunday_task.linear_Search(numbers, target)
        expected = 2
        self.assertEqual(actual, expected)
        
        
        

        
    
