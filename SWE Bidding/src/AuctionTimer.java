import java.util.Scanner;

import java.util.Timer;

import java.util.TimerTask;



public class AuctionTimer {

    private static int timeLeft = 300; // 5 minutes in seconds

    private static boolean auctionActive = true;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Timer timer = new Timer();



        // Schedule the countdown task

        timer.scheduleAtFixedRate(new TimerTask() {

            @Override

            public void run() {

                if (timeLeft > 0) {

                    int minutes = timeLeft / 60;

                    int seconds = timeLeft % 60;

                    System.out.printf("\rAuction Time Left: %02d:%02d", minutes, seconds);

                    timeLeft--;

                } else {

                    System.out.println("\nAuction Ended! No more bids allowed.");

                    auctionActive = false;

                    timer.cancel();

                }

            }

        }, 0, 1000); // Run every 1 second



        // Allow users to place bids while the auction is active

        while (auctionActive) {

            System.out.print("\nEnter 'bid' to place a bid: ");

            String input = scanner.nextLine();



            if ("bid".equalsIgnoreCase(input)) {

                if (auctionActive) {

                    System.out.println("✅ Bid Placed Successfully!");

                } else {

                    System.out.println("❌ Auction has ended. No more bids allowed.");

                }

            }

        }



        scanner.close();

    }

}