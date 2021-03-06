package com.company.myArrayList.test;

import com.company.myArrayList.MyArrayList;
import com.company.myArrayList.MyList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    MyList<Integer> list;


    @BeforeEach
    void init() {

        list = new MyArrayList<>();
    }

    @Test
    void testAdd_oneEl_size1_equalTo() {
        list.add(5);
        assertEquals(5,list.get(0));
        assertEquals(1,list.size());
        assertTrue(list.contains(5));
    }

    @Test
    void testAdd_threeDifferentE_size3_equalTo() {
        list.add(16);
        list.add(5);
        list.add(0);
        assertEquals(16,list.get(0));
        assertEquals(5,list.get(1));
        assertEquals(0,list.get(2));
        assertEquals(3,list.size());
        assertTrue(list.contains(16));
        assertTrue(list.contains(5));
        assertTrue(list.contains(0));
        assertFalse(list.contains(100));
    }

    @Test
    void testAdd_1to100E_size100_equalTo() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        assertEquals(100,list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(i,list.get(i));
        }
        for (int i = 0; i < 100; i++) {
            assertTrue(list.contains(i));
        }
    }

    @Test
    void testRemoveIndex_oneE_size0() {
        list.add(1);
        assertEquals(1,list.remove(0));
        assertEquals(0,list.size());
    }

    @Test
    void testRemoveIndex_threeDifferentElRemoveOne_size2_equalTo() {
        list.add(16);
        list.add(5);
        list.add(671);
        assertEquals(671,list.remove(2));
        assertEquals(2,list.size());
        assertFalse(list.contains(671));
    }

    @Test
    void testRemoveIndex_100DifferentElRemove100_size0() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 0, j = 99; i < 99; i++, j--) {
            assertEquals(i,list.remove(0));
            assertEquals(j,list.size());
        }
    }

    @Test
    void testRemove16E_RemoveIndex15() {
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }
        int res = list.remove(15);
        assertEquals(15,res);

    }

    @Test
    void testRemoveIndex_IndexOutOfBoundException2() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void testGet_IndexOutOfBoundException() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void testGet_oneE_equalTo2() {
        list.add(88);
        assertEquals(88,list.get(0));
    }

    @Test
    void testGet_threeE_equalTo2() {
        list.add(88);
        list.add(17);
        list.add(910);
        assertEquals(910,list.get(2));
    }

    @Test
    void testGet_IndexOutOfBoundsException2() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class,() -> list.get(1));
    }



    @Test
    void testSort_listOfInts_sortedList() {
        MyList<Integer> expected = new MyArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        list.add(2);
        list.add(3);
        list.add(1);
        list.sort();
        for (int i = 1; i < list.size(); i++) {
            assertEquals(list.get(i),expected.get(i));
        }
    }

    @Test
    void testForEach_list_getElement() {
        list.add(1);
        list.add(2);
        list.add(3);
        int count = 1;
        for (int i:list) {
            assertEquals(i,count++);
        }
    }





    @Test
    public void testSize_emptyList_zero() {
        assertEquals(0, list.size());
    }

    @Test
    public void testAddEltAndSize_1elt_1() {
        list.add(6);
        assertEquals(1, list.size());
    }

    @Test
    public void testSize_add5elt_3() {
        list.add(5);
        list.add(5);
        list.add(5);

        assertEquals(3, list.size());
    }

    @Test
    void testGetElt_emptyListException_IndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void testSetAndGetElt_addOneElt_10() {
        list.add(9);
        list.set(0, 10);
        assertEquals(10, list.get(0));
    }

    @Test
    void testGetElt_add5Elt_7() {
        list.add(9);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(5);
        list.set(2, 7);
        assertEquals(7, list.get(2));
    }

    @Test
    void testContainsElt_add6Elt_true() {
        list.add(10);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(5);
        list.add(2);
        assertTrue(list.contains(9));
    }

    @Test
    void testContainsElt_add6Elt_false() {
        list.add(9);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(5);
        list.add(2);
        assertFalse(list.contains(1));
    }

    @Test
    void testRemoveEltByIndex_emptyListException_IndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    public void testRemoveEltByIndex_addOneElt_56() {
        list.add(56);
        assertEquals(56, list.remove(0));
    }

    @Test
    void testRemoveEltByIndex_add6Elt_99() {
        list.add(99);
        list.add(87);
        list.add(9);
        list.add(66);
        list.add(99);
        list.add(20);
        assertEquals(99, list.remove(4));
    }

    @Test
    void testRemoveByElt_emptyList_False() {
        assertFalse(list.remove((Integer) 7));
    }

    @Test
    public void testRemoveByElt_addOneElt_true() {
        list.add(56);
        assertTrue(list.remove((Integer) 56));
    }

    @Test
    public void testRemoveByElt_addOneElt_false() {
        list.add(56);
        assertFalse(list.remove((Integer) 57));
    }

    @Test
    void testRemoveByElt_add6Elt_true() {
        list.add(99);
        list.add(87);
        list.add(9);
        list.add(66);
        list.add(99);
        list.add(20);
        assertTrue(list.remove((Integer) 66));
    }

    @Test
    void testRemoveByElt_add6Elt_false() {
        list.add(99);
        list.add(87);
        list.add(9);
        list.add(66);
        list.add(99);
        list.add(20);
        assertFalse(list.remove((Integer) 100));
    }


    @Test
    void testAdd_oneE_size1_equalTo() {
        list.add(5);
        assertEquals(5, list.get(0));
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    void testAdd_threeDifferentE_size3_equalTo2() {
        list.add(16);
        list.add(5);
        list.add(0);
        assertEquals(16, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(0, list.get(2));
        assertEquals(3, list.size());
        assertTrue(list.contains(16));
        assertTrue(list.contains(5));
        assertTrue(list.contains(0));
        assertFalse(list.contains(100));
    }

    @Test
    void testAdd_1to100E_size100_equalTo2() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        assertEquals(100, list.size());
        for (int i = 0; i < list.size(); i++) {
            assertEquals(i, list.get(i));
        }
        for (int i = 0; i < 100; i++) {
            assertTrue(list.contains(i));
        }
    }

    @Test
    void testRemoveIndex_oneE_size02() {
        list.add(1);
        assertEquals(1, list.remove(0));
        assertEquals(0, list.size());
    }


    @Test
    void testRemove16consistentNums_RemoveIndex15() {
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }
        int res = list.remove(15);
        assertEquals(15, res);

    }

    @Test
    void testRemoveIndex_IndexOutOfBoundException() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }




    @Test
    void testGet_oneE_equalTo() {
        list.add(88);
        assertEquals(88, list.get(0));
    }

    @Test
    void testGet_threeE_equalTo() {
        list.add(88);
        list.add(17);
        list.add(910);
        assertEquals(910, list.get(2));
    }

    @Test
    void testGet_IndexOutOfBoundsException() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class,() -> list.get(1));
    }

    @Test
    public void testArrayIterator(){

        list.add(2);
        list.add(-1);
        list.add(23);
        list.add(4);
        list.add(89);

        MyList<Integer> afterIteration = new MyArrayList<>();

        MyList<Integer> expected = new MyArrayList<>();
        expected.add(2);
        expected.add(-1);
        expected.add(23);
        expected.add(4);
        expected.add(89);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int num = it.next();
            afterIteration.add(num);
        }

        assertEquals(expected, afterIteration);
    }

    @Test
    public void testSort_add16elt_9() {

        list.add(15);
        list.add(16);
        list.add(11);
        list.add(3);
        list.add(12);
        list.add(14);
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(13);
        list.add(10);
        list.add(2);

        list.sort();
        assertEquals(9, list.get(8));
    }
}


