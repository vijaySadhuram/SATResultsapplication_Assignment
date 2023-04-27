import java.util.HashMap;
import java.util.Scanner;

class SatResult {
    private String name;
    private String address;
    private int satScore;
    private boolean passed;

    public SatResult(String name, String address, int satScore) {
        this.name = name;
        this.address = address;
        this.satScore = satScore;
        this.passed = (satScore > 30);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSatScore() {
        return satScore;
    }

    public boolean getPassed() {
        return passed;
    }

    public void setSatScore(int satScore) {
        this.satScore = satScore;
        this.passed = (satScore > 30);
    }
}

class SatResultsApp {
    private HashMap<String, SatResult> satResults;

    public SatResultsApp() {
        this.satResults = new HashMap<>();
    }

    public void insertData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter address (city country pincode):");
        String[] address = sc.nextLine().split(" ");
        System.out.println("Enter SAT score:");
        int satScore = sc.nextInt();
        sc.nextLine(); // consume newline
        SatResult satResult = new SatResult(name, String.join(" ", address), satScore);
        satResults.put(name, satResult);
        System.out.println("Data inserted successfully!");
    }

    public void viewAllData() {
        System.out.println("All SAT results:");
        for (SatResult satResult : satResults.values()) {
            System.out.println(satResult.getName() + ": " + satResult.getAddress() + ", SAT score: " +
                    satResult.getSatScore() + ", " + (satResult.getPassed() ? "Passed" : "Failed"));
        }
    }

    public void getRank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        int rank = 1;
        int score = satResults.get(name).getSatScore();
        for (SatResult satResult : satResults.values()) {
            if (satResult.getSatScore() > score) {
                rank++;
            }
        }
        System.out.println("Rank of " + name + " is " + rank);
    }

    public void updateScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        SatResult satResult = satResults.get(name);
        if (satResult == null) {
            System.out.println("No SAT result found for " + name);
        } else {
            System.out.println("Enter new SAT score:");
            int satScore = sc.nextInt();
            sc.nextLine(); // consume newline
            satResult.setSatScore(satScore);
            System.out.println("Score updated successfully!");
        }
    }

    public void deleteRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        SatResult satResult = satResults.remove(name);
        if (satResult == null) {
            System.out.println("No SAT result found for " + name);
        } else {
            System.out.println("Record deleted successfully!");
        }
    }
}

public class SATResultsapplication{
public static void main(String[] args) {
    SatResultsApp app = new SatResultsApp();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("Select an option:");
        System.out.println("1. Insert data");
        System.out.println("2. View all data");
        System.out.println("3. Get rank");
        System.out.println("4. Update score");
        System.out.println("5. Delete one record");
        System.out.println("6. Exit");

        int option = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (option) {
            case 1:
                app.insertData();
                break;
            case 2:
                app.viewAllData();
                break;
            case 3:
                app.getRank();
                break;
            case 4:
                app.updateScore();
                break;
            case 5:
                app.deleteRecord();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid option!");
        }
    }
}

}