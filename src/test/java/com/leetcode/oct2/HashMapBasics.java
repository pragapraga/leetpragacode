package com.leetcode.oct2;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Praga","+91-90909-10900");
        contacts.put("Gokul","+1-18000-97788");

        contacts.get("Raji");

        System.out.println(contacts.get("Raji"));  //prints null

        System.out.println("----------------------------");


        contacts.getOrDefault("Will Smith","No Number available"); //defaults to message
        System.out.println(contacts.getOrDefault("Will Smith","No Number available"));


        System.out.println("----------------------------");
        contacts.put("Nazreen","+91-6881904049");
        contacts.put("Muralee","+91-3390744939");
        contacts.put("Govind","+91-9394059425");
        contacts.put("Anand","+91-3846063508");
        contacts.put("Mari","+91-4955326805");
        contacts.put("Gokul","+91-0024594158");

        Iterator<Map.Entry<String, String>> itr = contacts.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------------");

        System.out.println(contacts.containsKey("Gokul")); //Time Complexity O[1]
        System.out.println(contacts.containsValue("Gokul")); //Time Complexity O[n] ??

        System.out.println("----------------------------");


        Iterator<Map.Entry<String, String>> itrAgain = contacts.entrySet().iterator();
        try{
            while(itrAgain.hasNext()){
                contacts.remove("Praga");
                System.out.println("ConcurrentModification "+itrAgain.next());
            }
        }
        catch (ConcurrentModificationException e){
            e.printStackTrace();
        }

        System.out.println("----------------------------");


        ConcurrentHashMap<String,String> contactsConcurrent = new ConcurrentHashMap<>(contacts);

        System.out.println("Before Removing Muralee ::"+contactsConcurrent.containsKey("Muralee")); // returns true


        Iterator<Map.Entry<String,String >> concurrentItr = contactsConcurrent.entrySet().iterator();
        while(concurrentItr.hasNext()){
            contactsConcurrent.remove("Muralee");
            System.out.println("ConcurrentModification "+concurrentItr.next());
        }


        System.out.println("After Removing Muralee ::"+contactsConcurrent.containsKey("Muralee")); // returns false


        System.out.println("----------------------------");

    }
}
