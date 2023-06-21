package com.manhnam.array.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
//        placesToVisit.add(adelaide);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("Adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter value:");
            try {
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);
                switch (menuItem) {
                    case "F" -> {
                        System.out.println("User wants to go forward");
                        if (!forward) {
                            iterator.next();
                        }
                        if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                            forward = true;
                        } else {
                            System.out.println("Reaching the end of itinerary");
                        }
                    }
                    case "B" -> {
                        System.out.println("User wants to go backward");
                        if (forward) {
                            iterator.previous();
                        }
                        if (iterator.hasPrevious()) {
                            System.out.println(iterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are in the start of itinerary");
                        }
                    }
                    case "L" -> {
                        System.out.println("User wants to see list");
                        System.out.println(placesToVisit);
                    }
                    case "M" -> {
                        System.out.println("User wants to print menu");
                        printMenu();
                    }
                    case "Q" -> {
                        System.out.println("User wants to quit");
                        quitLoop = true;
                    }
                    default -> printMenu();

                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.print("Please enter something\n");

            }

        }
    }

    public static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place.name());
                return;
            }
        }
        int matchedIndex = 0;
        for (var placeTraverse : list
        ) {
            if (placeTraverse.distance() > place.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);

    }

    private static void printMenu() {
        System.out.println("""
               Available actions
               (F)orward
               (B)ackwards
               (L)ist Places
               (M)enu
               (Q)uit:"""
        );
    }
}
