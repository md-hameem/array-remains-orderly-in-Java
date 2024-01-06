/*
Suppose that values is an ordered array of integers. The programs describe how to insert a new value so that the resulting array remains orderly in Java and how to complete the following task on the array list?

a. Test whether the two array lists contain the same elements in the same order.
b. Copy an array list to another array list.
c. Fill in an array list with 0, overriding all the elements of it.
d. Delete all the elements of an array list.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOrders{

    public static void main(String[] args) {
        List<Integer> orderedList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int newValueToInsert = 6;

        insertValueInOrder(orderedList, newValueToInsert);
        System.out.println("A. Ordered List after inserting " + newValueToInsert + ": " + orderedList);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        boolean areEqual = areListsEqual(list1, list2);
        System.out.println("Are the two lists equal? Answer: " + areEqual);

        List<Integer> copiedList = copyList(list1);
        System.out.println("B. Answer: Copied List: " + copiedList);

        List<Integer> filledList = fillListWithZero(5);
        System.out.println("C. Answer: Filled List with 0: " + filledList);

        List<Integer> listToDelete = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        deleteAllElements(listToDelete);
        System.out.println("D. Answer: List after deleting all elements: " + listToDelete);
    }

    private static void insertValueInOrder(List<Integer> orderedList, int newValue) {
        int index = 0;
        while (index < orderedList.size() && orderedList.get(index) < newValue) {
            index++;
        }
        orderedList.add(index, newValue);
    }

    private static boolean areListsEqual(List<Integer> list1, List<Integer> list2) {
        return list1.equals(list2);
    }

    private static List<Integer> copyList(List<Integer> sourceList) {
        return new ArrayList<>(sourceList);
    }

    private static List<Integer> fillListWithZero(int size) {
        List<Integer> filledList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            filledList.add(0);
        }
        return filledList;
    }

    private static void deleteAllElements(List<Integer> list) {
        list.clear();
    }
}
