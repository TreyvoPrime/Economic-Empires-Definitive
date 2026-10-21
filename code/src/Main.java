import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //initialization portion.
        Scanner input = new Scanner(System.in);
        String starting_decision;
        String playerSelectedCountry;
        boolean gameRunning = true;
        //arraylist to streamline the approach for making countries.
        ArrayList<Countries> countries = new ArrayList<>();
        countries.add(new Countries("USA", 25000.0, "North America"));
        countries.add(new Countries("Japan", 4200.0, "Asia"));
        countries.add(new Countries("Germany", 4500.0, "Europe"));
        //arrayList to streamline the approach for making Buildings.
        Buildings farm = new Buildings("Farm", 1500, "Farming");
        Buildings factory = new Buildings("Factory", 3000, "Production");
        //pre-game start section
        System.out.println("Welcome to Economic Empires");
        System.out.println("Would you like to start a game. Y/N");
        starting_decision = input.nextLine().toUpperCase().trim();

        if (starting_decision.equals("Y")) {
            System.out.println("Starting game");
        } else {
            System.out.println("Game will not be starting, goodbye.");
        }
        //section to determine what country the user will play as
        System.out.println("Now it is time to choose your country. Please select a country.");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(i + ": " + countries.get(i).getCountryname());

        }

        int choice = input.nextInt();
        //get the country classs, and assign the player chosen country as the object to be used.
        Countries country = countries.get(choice);

        boolean countriesSelection = true;
        //used to determine if the country has been selected
        boolean countryBeenSelected = false;
        while (countriesSelection) {
            if (choice > countries.size()) {
                try {
                    else if (choice <= countries.size()) {
                        countriesSelection = false;
                        countryBeenSelected = true;
                    } else if (choice == 200) {
                        countriesSelection=false;
                    }
                }
            } catch (IndexOutOfBoundsException) {
                System.out.println(e.getMessage());
            }
            System.out.println("Invalid country selected, please try again");
        }
        if (countryBeenSelected) {
            while (gameRunning) {
                //introduce player to their country
                System.out.println("Welcome Advisor, you're now in control of the economy of " + country.getCountryname());
                System.out.println("Your region is " + country.getRegion());
                System.out.println("Your starting GDP is " + country.getGDP());
                System.out.println("---COUNTRY CONTROL PANEL---");
                System.out.println("1.🔨Buildings");
                System.out.println("2. 🛣️Infrastructure");
                System.out.println("3. 🚨Policies");
                System.out.println("4. ⛵Trade");
                System.out.println("5. 💵Taxes");
                System.out.println("6. 📊Statistics");
                System.out.println("7. 🌍World Stage");
                System.out.println("Choose a option");

                int decisionChoice = input.nextInt();
                //keep the loop, from becoming into a infinite while loop.
                if (decisionChoice== 1) {
                    boolean isBuilding = true;
                    while (isBuilding) {
                        System.out.println("---Buildings---");
                        System.out.println("0. Back to the country control panel");
                        System.out.println("1. 🌾Farm");
                        System.out.println("2. 🏭Factory");
                        System.out.println("Choose a option");
                        int buildingChoice = input.nextInt();
                        int farmsBuilt =0;
                        if (buildingChoice == 0) {
                            isBuilding = false;
                        } else if (buildingChoice == 1) {
                            System.out.println("How many farms would you like to build?");
                            int farmsBuilding = input.nextInt();
                            for (int a = 0; a < farmsBuilding; a++) {
                                if (country.getTreasury() >= farm.getCost()) {
                                    country.setTreasury(country.getTreasury() - farm.getCost()
                                );
                                    farmsBuilt++;
                                    System.out.println("Farms built: " + farmsBuilt);
                                } else {
                                    System.out.println("Not enough money in the treasury to build another farm!");
                                    break;
                                }
                            }
                        }
                    }

                }
                else if (decisionChoice == 0) {
                    gameRunning=false;
                }
            }

            int decisionChoice = input.nextInt();
            //keep the loop, from becoming into a infinite while loop.
            if (decisionChoice== 1) {
                boolean isBuilding = true;
                while (isBuilding) {
                    System.out.println("---Buildings---");
                    System.out.println("0. Back to the country control panel");
                    System.out.println("1. 🌾Farm");
                    System.out.println("2. 🏭Factory");
                    System.out.println("Choose a option");
                    int buildingChoice = input.nextInt();
                    int farmsBuilt =0;
                    if (buildingChoice == 0) {
                        isBuilding = false;
                    } else if (buildingChoice == 1) {
                        System.out.println("How many farms would you like to build?");
                        int farmsBuilding = input.nextInt();
                        for (int a = 0; a < farmsBuilding; a++) {
                            if (country.getTreasury() >= farm.getCost()) {
                                country.setTreasury(country.getTreasury() - farm.getCost()
                            );
                                farmsBuilt++;
                                System.out.println("Farms built: " + farmsBuilt);
                            } else {
                                System.out.println("Not enough money in the treasury to build another farm!");
                                break;
                            }
                        }
                    }
                }

            }
            else if (decisionChoice == 0) {
                gameRunning=false;
            }

        }


    }
}