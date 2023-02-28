import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaration of variables
        String playerA = "";
        String playerB = "";
        String continueGame = "";
       // create new scanner
        Scanner in = new Scanner(System.in);
        // start looping
        while (true) {
            while (true) {

                System.out.println("what's your move Player A: R, P or S?");
                playerA = in.nextLine();
                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    break;// only if it's matches uppercase R P or S
                }
                System.out.println("that is not a valid move.");// if they input something else
            }


            while (true) {

                System.out.println("what's your move Player B: R, P or S?");
                playerB = in.nextLine();
                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    break;// only if it's matches uppercase R P or S
                }
                System.out.println("that is not a valid move.");// if they input something else
            }
            // game start
            if (playerA.equals(playerB)) {
                System.out.println("tie game!");
            } else if (playerA.equals("R")) {
                if (playerB.equals("P")) {
                    System.out.println(" Paper covers Rock");
                    System.out.println("Player B win");
                }
            } else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    //display output
                    System.out.println(" Paper covers Rock");
                    System.out.println("Player A win");
                }
            } if (playerA.equals("S")) {
                if (playerB.equals("P")) {
                    //display output
                    System.out.println("Scissors cut Paper");
                    System.out.println("Player B win ");
                }
            }if (playerA.equals("P")) {
                if (playerB.equals("S")) {
                    //display output
                    System.out.println("Scissors cut Paper");
                    System.out.println("Player B win ");
                }
            }
            else if (playerA.equals("S")) {
                if (playerB.equals("R")) {
                    //display output
                    System.out.println("Rock break Scissors");
                    System.out.println(" player B win ");
                }
            }
                    if (playerA.equals("R")) {
                    if (playerB.equals("S")) {
                    //display output
                            System.out.println("Rock break Scissors");
                            System.out.println("Player A win ");
                        }
                    }

                    System.out.println(" Play again? Y/N");//asking the user if they want to keep playing
                    continueGame = in.nextLine();
                    if (continueGame.equals("N")) {
                        break;// if they enter N then the game end
                    }
                }
            }
        }


























