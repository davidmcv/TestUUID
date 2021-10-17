package com.company;

public class Main {

    public static void main(String[] args) {
        // Warm the random generator.
        java.util.UUID uuid;
        uuid = java.util.UUID.randomUUID();

        long stop = 0;
        long start = System.nanoTime();

        int loops = 1000000;  // One million.
        for ( int i = 0; i < loops; i++ ) {
            uuid = java.util.UUID.randomUUID();
        }

        stop = System.nanoTime();

        long elapsed = ( stop - start );

        System.out.println( "UUIDs: " + loops );
        System.out.println( "Nanos: " + elapsed );
        System.out.println( "Nanos per uuid: " + ( elapsed / loops ) + " ( micros per: " + ( elapsed / loops / 1000 ) + " )" );
    }
}
