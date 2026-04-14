import java.util.*;

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC20 - Prevent Search on Empty Train ");
        System.out.println("===========================================\n");

        List<String> bogieIds = new ArrayList<>();

        String searchId = "BG309";

        try {

            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available in train for search operation");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie " + searchId + " found in train consist.");
            } else {
                System.out.println("Bogie " + searchId + " not found in train consist.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 validation completed...");
    }
}