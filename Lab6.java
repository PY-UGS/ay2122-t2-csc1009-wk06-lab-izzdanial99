import java.util.*;

public class Lab6 {

    public static void addAndSort(LinkedList<Integer> list, int value) {
        System.out.println("Contents before adding: " + list);
        list.add(value);
        Collections.sort(list);
        System.out.println("Contents after adding: " + list + "\n");
    }

    public static LinkedList<Integer> swapValues(LinkedList<Integer>list, int indexOne, int indexTwo) {
        System.out.println("Contents before swapping: " + list );
        int temp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, temp);
        System.out.println("Contents after swapping: " + list + "\n");
        return list;
    }

    public static int findValue(LinkedList<Integer> list, int searchVal) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchVal) {
                return i;
            }
        }
        return -1;
    }

    public static HashMap<Integer, Integer> addAndSortHash(HashMap hashmap, int value) {
        hashmap.put(hashmap.size(), value);
        // sort
        System.out.println("Before sort: " + hashmap);
       LinkedList<Integer> tempList = new LinkedList<Integer>();

        for (int i = 0; i < hashmap.size(); i++) {
            tempList.add((int) hashmap.get(i));
        }

        Collections.sort(tempList);

        for (int i = 0; i < hashmap.size(); i++) {
            hashmap.put(i, tempList.get(i));
        }

        System.out.println("After sorting: " + hashmap + "\n");
        return hashmap;
    }

    public static HashMap<Integer, Integer> swapValuesHash (HashMap hashmap, int indexOne, int indexTwo) {
        System.out.println("Before swapping: " + hashmap);
        int temp;
        temp = (int) hashmap.get(indexOne);
        hashmap.put(indexOne, hashmap.get(indexTwo));
        hashmap.put(indexTwo, temp);
        System.out.println("After swapping: " + hashmap + "\n");
        return hashmap;
    }

    public static int findValueHash(HashMap hashmap, int value) {

        for (int i = 0; i < hashmap.size(); i++) {
            if ((int) hashmap.get(i) == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Question 1
        System.out.println("Qn1");
        LinkedList<Integer> newList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        addAndSort(newList, 13);

        // Question 2
        System.out.println("Qn2");
        newList = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        swapValues(newList,1, 5);

        // Question 3, generating 500 random int
        System.out.println("Qn3");
        Random random = new Random();
        newList = new LinkedList<Integer>();
        for (int i = 0; i < 500; i++) newList.add(random.nextInt(1000,9999));
        int result = findValue(newList, 1544);
        if (result == -1) {
            System.out.println("Unable to find value.\n");
        } else {
            System.out.println("Found value at index: " + result + ".\n");
        }

        System.out.println("Qn4");
        // Question 4
        HashMap hashmap = new HashMap();
        // initialise 1,3,5,7,9,11 array to hashmap
        for (int i = 1; i < 7; ++i) {
            hashmap.put(i-1,i * 2 -1);
        }
        addAndSortHash(hashmap, 2);

        // Question 5
        System.out.println("Qn4");
        swapValuesHash(hashmap, 1, 5);

        // Question 6
        System.out.println("Qn4");
        hashmap = new HashMap();
        for (int i = 0; i < 500; i ++) hashmap.put(i, random.nextInt(1000,9999));
        result = findValueHash(hashmap, 2345);
        if (result == -1) {
            System.out.println("Unable to find value.");
        } else {
            System.out.println("Found value at index: " + result + ".");
        }
    }

}
