import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleStuffTest {
    int[] intArr1 = {0, 2, 5, 6, 7, 9, 11};
    int[] intArr3 = {0, 2, 5, 6, 7, 9};
    int[] intArr2 = {0};
    int[] intArr4 = {};
////linear search tests
//    @Test
//    void linearSearchIndex6Num11()
//    {
//        int expected = 6;
//        int actual = simpleStuff.linearSearch(11, intArr1);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void linearSearchIndex5Num9()
//    {
//        int expected = 5;
//        int actual = simpleStuff.linearSearch(9, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchIndex4Num7()
//    {
//        int expected = 4;
//        int actual = simpleStuff.linearSearch(7, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchIndex3Num6()
//    {
//        int expected = 3;
//        int actual = simpleStuff.linearSearch(6, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchIndex2Num5()
//    {
//        int expected = 2;
//        int actual = simpleStuff.linearSearch(5, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchIndex1Num2()
//    {
//        int expected = 1;
//        int actual = simpleStuff.linearSearch(2, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchIndex0Num0()
//    {
//        int expected = 0;
//        int actual = simpleStuff.linearSearch(0, intArr1);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void linearSearchEmptyArray()
//    {
//        int expected = -1;
//        int actual = simpleStuff.linearSearch(0, intArr4);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void linearSearchOneValue()
//    {
//        int expected = -1;
//        int actual = simpleStuff.linearSearch(1, intArr2);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void linearSearchOneValuePass()
//    {
//        int expected = 0;
//        int actual = simpleStuff.linearSearch(1, intArr2);
//    }


    //tests for arr1
    @Test
    void binarySearchIndex6Num11()
    {
        int expected = 6;
        int actual = simpleStuff.binarySearch(11, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex5Num9()
    {
        int expected = 5;
        int actual = simpleStuff.binarySearch(9, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex4Num7()
    {
        int expected = 4;
        int actual = simpleStuff.binarySearch(7, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex3Num5()
    {
        int expected = 3;
        int actual = simpleStuff.binarySearch(6, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex2Num5()
    {
        int expected = 2;
        int actual = simpleStuff.binarySearch(5, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex1Num2()
    {
        int expected = 1;
        int actual = simpleStuff.binarySearch(2, intArr1);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex0Num0()
    {
        int expected = 0;
        int actual = simpleStuff.binarySearch(0, intArr1);
        assertEquals(expected, actual);
    }

    //second array tests
    @Test
    void binarySearchIndex0Num0Arr2()
    {
        int expected = 0;
        int actual = simpleStuff.binarySearch(0, intArr2);
        assertEquals(expected, actual);
    }

    //tests for third array test
    @Test
    void binarySearchIndex5Num9Arr3()
    {
        int expected = 5;
        int actual = simpleStuff.binarySearch(9, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex4Num7Arr3()
    {
        int expected = 4;
        int actual = simpleStuff.binarySearch(7, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex3Num5Arr3()
    {
        int expected = 3;
        int actual = simpleStuff.binarySearch(6, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex2Num5Arr3()
    {
        int expected = 2;
        int actual = simpleStuff.binarySearch(5, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex1Num2Arr3()
    {
        int expected = 1;
        int actual = simpleStuff.binarySearch(2, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchIndex0Num0Arr3()
    {
        int expected = 0;
        int actual = simpleStuff.binarySearch(0, intArr3);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchEmptyArray()
    {
        int expected = -1;
        int actual = simpleStuff.binarySearch(0, intArr4);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchOneValuePass()
    {
        int expected = 0;
        int actual = simpleStuff.binarySearch(0, intArr2);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchOneValueFail()
    {
        int expected = -1;
        int actual = simpleStuff.binarySearch(1, intArr2);
        assertEquals(expected, actual);
    }
}