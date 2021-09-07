package com.aique.collections.hashtable;

import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;



public class HashtableTest {

    public void whenPutAndGet_thenReturnsValue() {
        Hashtable<Word, String> table = new Hashtable<Word, String>();

        Word word = new Word("cat");
        table.put(word, "an animal");

        String definition = table.get(word);

        System.out.println( definition);

        definition = table.remove(word);

        System.out.println( definition);
    }

    public void whenThesameInstanceOfKey_thenReturnsValue() {
        Hashtable<Word, String> table = new Hashtable<Word, String>();
        Word word = new Word("cat");
        table.put(word, "an animal");
        String extracted = table.get(word);
        System.out.println( extracted);
    }

    public void whenEqualsOverridden_thenReturnsValue() {
        Hashtable<Word, String> table = new Hashtable<Word, String>();
        Word word = new Word("cat");
        table.put(word, "an animal");
        String extracted = table.get(new Word("cat"));
        System.out.println(extracted);
    }

    /**
     * ConcurrentModificationException
      */
    public void whenIterate_thenFailFast() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "an animal");
        table.put(new Word("dog"), "another animal");

        Iterator<Word> it = table.keySet().iterator();
        System.out.println("iterator created");

        table.remove(new Word("dog"));
        System.out.println("element removed");

        while (it.hasNext()) {
            Word key = it.next();
            System.out.println(table.get(key));
        }
    }

    public void whenEnumerate_thenNotFailFast() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("1"), "one");
        table.put(new Word("2"), "two");
        table.put(new Word("3"), "three");
        table.put(new Word("4"), "four");
        table.put(new Word("5"), "five");
        table.put(new Word("6"), "six");
        table.put(new Word("7"), "seven");
        table.put(new Word("8"), "eight");

        Enumeration<Word> enumKey = table.keys();
        System.out.println("Enumeration created");
        table.remove(new Word("1"));
        System.out.println("element removed");
        while (enumKey.hasMoreElements()) {
            Word key = enumKey.nextElement();
            System.out.println(table.get(key));
        }
    }

    public void whenAddElements_thenIterationOrderUnpredicable() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("1"), "one");
        table.put(new Word("2"), "two");
        table.put(new Word("3"), "three");
        table.put(new Word("4"), "four");
        table.put(new Word("5"), "five");
        table.put(new Word("6"), "six");
        table.put(new Word("7"), "seven");
        table.put(new Word("8"), "eight");

        Iterator<Map.Entry<Word, String>> it = table.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Word, String> entry = it.next();
            System.out.println(entry.getValue());
        }
    }

    public void whenGetOrDefault_thenDefaultGot() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");
        Word key = new Word("dog");
        String definition;

        // old way
        /* if (table.containsKey(key)) {
            definition = table.get(key);
        } else {
            definition = "not found";
        }*/

        // new way
        definition = table.getOrDefault(key, "not found");

        System.out.println(definition);
    }

    public void whenPutifAbsent_thenNotRewritten() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");

        String definition = "an animal";
        // old way
        /* if (!table.containsKey(new Word("cat"))) {
            table.put(new Word("cat"), definition);
        }*/
        // new way
        table.putIfAbsent(new Word("cat"), definition);

        System.out.println(table.get(new Word("cat")));
    }

    public void whenRemovePair_thenCheckKeyAndValue() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");

        // old way
        /* if (table.get(new Word("cat")).equals("an animal")) {
            table.remove(new Word("cat"));
        }*/

        // new way
        boolean result = table.remove(new Word("cat"), "an animal");

        System.out.println(result);
    }

    public void whenReplacePair_thenValueChecked() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");

        String definition = "an animal";

        // old way
        /* if (table.containsKey(new Word("cat")) && table.get(new Word("cat")).equals("a small domesticated carnivorous mammal")) {
            table.put(new Word("cat"), definition);
        }*/
        // new way
        table.replace(new Word("cat"), "a small domesticated carnivorous mammal", definition);

        System.out.println(table.get(new Word("cat")));

    }

    public void whenKeyIsAbsent_thenNotRewritten() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");

        // old way
        /* if (!table.containsKey(cat)) {
            String definition = "an animal";// calculate
            table.put(new Word("cat"), definition);
        }
        */
        // new way

        table.computeIfAbsent(new Word("cat"), key -> "an animal");
        System.out.println(table.get(new Word("cat")));

    }


    public void whenKeyIsPresent_thenComputeIfPresent() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");

        Word cat = new Word("cat");
        // old way
        /* if (table.containsKey(cat)) {
            String concatination = cat.getName() + " - " + table.get(cat);
            table.put(cat, concatination);
        }*/

        // new way
        table.computeIfPresent(cat, (key, value) -> key.getName() + " - " + value);

        System.out.println(table.get(cat));

    }

    public void whenCompute_thenForAllKeys() {

        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        String[] animals = { "cat", "dog", "dog", "cat", "bird", "mouse", "mouse" };
        for (String animal : animals) {
            table.compute(animal, (key, value) -> (value == null ? 1 : value + 1));
        }
        System.out.println(table.values());

    }

    public void whenInsteadOfCompute_thenMerge() {

        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        String[] animals = { "cat", "dog", "dog", "cat", "bird", "mouse", "mouse" };
        for (String animal : animals) {
            table.merge(animal, 1, (oldValue, value) -> (oldValue + value));
        }
        System.out.println(table.values());
    }

    public void whenForeach_thenIterate() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");
        table.put(new Word("dog"), "another animal");
        table.forEach((k, v) -> System.out.println(k.getName() + " - " + v)

        );
    }

    public void whenReplaceall_thenNoIterationNeeded() {

        Hashtable<Word, String> table = new Hashtable<Word, String>();
        table.put(new Word("cat"), "a small domesticated carnivorous mammal");
        table.put(new Word("dog"), "another animal");
        table.replaceAll((k, v) -> k.getName() + " - " + v);

        System.out.println(table.values());
    }
}