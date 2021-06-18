package javareference.parttwo.exploringjavalang;

public class CurrentTimeMillisDemo {
    public static void main(String args[]) {
        long start, end;
        System.out.println("Timing a for loop from 0 to 100,000,000");
        // time a for loop from 0 to 100,000,000
//        start = System.currentTimeMillis(); // get starting time
//        for(long i=0; i < 100000000L; i++) ;
//        end = System.currentTimeMillis(); // get ending time

        // NanoTime
        start = System.nanoTime(); // get starting time
        for(long i=0; i < 100000000L; i++) ;
        end = System.nanoTime(); // get ending time
        System.out.println("Elapsed time: " + (end-start));

    }
}
