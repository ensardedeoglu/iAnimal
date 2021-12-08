import java.util.Scanner;
import java.util.ArrayList;

public class FootHill {

    public static void main(String[] args) {


        ArrayList<iAnimal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Do you want to add a Kangaroo? (yes/no)? ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {

                Kangaroo Kangaroo = new Kangaroo();
                System.out.print("Enter ID tag? ");
                int id = scanner.nextInt();
                scanner.nextLine();
                Kangaroo.setIdTag(id);
                boolean alreadyExist = false;
                for (iAnimal animal : animals) {
                    if (animal instanceof Kangaroo) {
                        Kangaroo aKangaroo = (Kangaroo) animal;
                        if (aKangaroo.compareTo(Kangaroo) == 0) {
                            System.out.println("This animal already exists. Unable to add it.");
                            alreadyExist = true;
                        }
                    }
                }
                if (!alreadyExist) {
                    animals.add(Kangaroo);
                    System.out.println("Kangaroo added to the animal list");
                }

            }

            System.out.print("Do you want to add a Seabird? (yes/no)? ");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {

                Seabird Seabird = new Seabird();
                System.out.print("Enter ID tag? ");
                int id = scanner.nextInt();
                scanner.nextLine();
                Seabird.setIdTag(id);
                boolean alreadyExist = false;
                for (iAnimal animal : animals) {
                    if (animal instanceof Seabird) {
                        Seabird aKangaroo = (Seabird) animal;
                        if (aKangaroo.compareTo(Seabird) == 0) {
                            System.out.println("This animal already exists. Unable to add it.");
                            alreadyExist = true;
                        }
                    }
                }
                if (!alreadyExist) {
                    animals.add(Seabird);
                    System.out.println("Seabird added to the animal list");
                }

            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice=scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }

        }

        for (iAnimal animal : animals) {
            System.out.println(animal);
        }

    }
}