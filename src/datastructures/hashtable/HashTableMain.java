package datastructures.hashtable;

public class HashTableMain {

    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>(10);
        hashTable.put(10, "Aziko");
        hashTable.put(11, "Ziko");
        hashTable.put(15, "Zizi");
        hashTable.put(25, "Azizi");
        hashTable.put(25, "Aziz");
        System.out.println(hashTable.getSize());
        System.out.println(hashTable.remove(25));
        System.out.println(hashTable.remove(15));
        System.out.println(hashTable.getSize());
        hashTable.put(25, "Aziz25");
        System.out.println(hashTable.getSize());
        System.out.println(hashTable.remove(25));

    }

}
