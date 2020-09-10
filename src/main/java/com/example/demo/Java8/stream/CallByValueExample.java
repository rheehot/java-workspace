package com.example.demo.Java8.stream;

/**
 * @author Geonguk Han
 * @since 2020-09-10
 */
public class CallByValueExample {

    public static void main(final String[] args) {
        final int a = 1;
        final int b = 2;
        System.out.println("============== call by value ================");
        System.out.println("before a:" + a + ", b:" + b);

        swap(a, b);

        System.out.println("after a:" + a + ", b:" + b);


        System.out.println("============== call by reference ==============");

        final MyClass aClass = new MyClass(1);
        final MyClass bClass = new MyClass(2);

        System.out.println("before aClsss : " + aClass + ", bClass:" + bClass);

        swapValueByReference(aClass, bClass);

        System.out.println("after aClsss : " + aClass + ", bClass:" + bClass);
    }

    static void swap(int i, int j) {
        final int temp = i;
        i = j;
        j = temp;
    }

    static void swapReference(MyClass a, MyClass b) {
        final MyClass temp = a;
        a = b;
        b = temp;
    }

    static void swapValueByReference(final MyClass a, final MyClass b) {
        final int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

    static class MyClass {
        int value;

        public MyClass(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
