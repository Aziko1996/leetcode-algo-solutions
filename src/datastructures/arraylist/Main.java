package datastructures.arraylist;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            myArrayList.add(i);

        }
        myArrayList.add(100);
        myArrayList.add(101);
        for(int i = 0; i < 102; i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println();
        // System.out.println(myArrayList.get(2000));
    }

}
