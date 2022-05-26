package com.metanit;

/*
20. В списке (односвязном) целых чисел для каждого элемента, содержащего простое число,
    удалить элементы перед и после данного элемента, если они, в свою очередь, не
    являются простыми числами.
 */

public class Logic {

    public static void number(MyList myList1) throws Exception {

        int size = myList1.size();

        for (int i = 0; i < myList1.size(); i++) {
                if (myList1.getAt(i) % 2 != 0) {
                    if (isVailedLeft(i-1)) {
                        if (myList1.getAt(i-1) % 2 == 0) {
                            myList1.removeAt(i - 1);
                        }
                    } if (isVailedRight(i+1, size)) {
                        if (myList1.getAt(i+1) % 2 == 0) {
                            myList1.removeAt(i + 1);
                        }
                    }
                }
        }

    }

    private static boolean isVailedLeft(int i) {
        return (i >= 0);
    }

    private static boolean isVailedRight(int i, int size) {
        return (i <= size);
    }

}
