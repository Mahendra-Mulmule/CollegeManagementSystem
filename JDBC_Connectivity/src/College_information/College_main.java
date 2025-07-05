package College_information;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class College_main {
	public static void main(String[] args) throws SQLException {
		
	
		        Scanner sc = new Scanner(System.in);
		        College_interface_impliment ci = new College_interface_impliment();

		        while (true) {
		            System.out.println("\n===== College Management System =====");
		            System.out.println("1. Add College");
		            System.out.println("2. Delete College by ID");
		            System.out.println("3. Show All Colleges");
		            System.out.println("4. Search College by ID");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    // Add college
		                    System.out.print("Enter College ID: ");
		                    int id = sc.nextInt();
		                    sc.nextLine(); // consume newline

		                    System.out.print("Enter College Name: ");
		                    String name = sc.nextLine();

		                    System.out.print("Enter College Location: ");
		                    String location = sc.nextLine();

		                    System.out.print("Enter College Type: ");
		                    String type = sc.nextLine();

		                    System.out.print("Enter College Average Fee: ");
		                    int fee = sc.nextInt();

		                    College college = new College(id, name, location, type, fee);
		                    ci.addCollege(college);
		                    break;

		                case 2:
		                    // Delete college
		                    System.out.print("Enter College ID to delete: ");
		                    int deleteId = sc.nextInt();
		                    boolean deleted = ci.D_CollgeBy_id(deleteId);
		                    if (deleted) {
		                        System.out.println("✅ College deleted.");
		                    } else {
		                        System.out.println("❌ College not found.");
		                    }
		                    break;

		                case 3:
		                    // Show all colleges
		                    List<College> list = ci.getcollege();
		                    if (list.isEmpty()) {
		                        System.out.println("No colleges found.");
		                    } else {
		                        list.forEach(System.out::println);
		                    }
		                    break;

		                case 4:
		                    // Search by ID
		                    System.out.print("Enter College ID to search: ");
		                    int searchId = sc.nextInt();
		                    ci.infoby_id(searchId);
		                    break;

		                case 5:
		                    // Exit
		                    ci.closeconnection();
		                    System.out.println("👋 Exiting the program. Goodbye!");
		                    sc.close();
		                    System.exit(0);
		                    break;

		                default:
		                    System.out.println("⚠️ Invalid choice. Try again.");
		            }
		        }
		    
		
		
	}

}
