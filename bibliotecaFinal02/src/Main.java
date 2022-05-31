import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ColectionEmployee listOfEmployee = new ColectionEmployee();
        ColectionBook listOfBooks = new ColectionBook();
        ColectionCostumer listOfCostumer = new ColectionCostumer();

        System.out.println("******* WELCOME TO LEBRARY SYSTEM ******* ");
        while (true) {
            showPrincipalMenu();
            int firstMenu = sc.nextInt();

            if (firstMenu == 1) {
                while(true) {
                    showRHMenu();
                    int rhMenu = sc.nextInt();

                    if (rhMenu == 1) {
                        System.out.println("Type the employee name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Type number of the CPF eg(097.927.154-10): ");
                        String cpf = sc.nextLine();
                        System.out.println("Type number of the Cttp eg(124): ");
                        int ctps = sc.nextInt();
                        System.out.println("Type the role: ");
                        sc.nextLine();
                        String role = sc.nextLine();
                        System.out.println("Type salary of the employee: ");
                        double salary = sc.nextDouble();
                        listOfEmployee.admit(new Employee(name, cpf, ctps, role, salary));

                    } else if (rhMenu == 2) {
                        System.out.println("Type the cpf that employee that you want fired");
                        String cpf = sc.next();
                        listOfEmployee.dismiss(cpf);
                    } else if (rhMenu == 3) {
                        System.out.println("Type the cpf that employee that you want research");
                        String cpf = sc.next();
                        listOfEmployee.lookForEmployee(cpf);

                    } else if (rhMenu == 4) {
                        listOfEmployee.displayStaff();
                    } else if (rhMenu == 5) {
                        listOfEmployee.isThereAnyEmployee();
                    } else if (rhMenu == 0) {
                        break;
                    }
                }
            }
            else if(firstMenu == 2){

                while(true){
                    showStorageMenu();
                    int storageMenu = sc.nextInt();
                    if (storageMenu == 1){
                        System.out.println("Type the book name to add: ");
                        sc.nextLine();
                        String  Name = sc.nextLine();
                        System.out.println("Type the name of the Author ");
                        String NameAuthor = sc.nextLine();
                        System.out.println("Type the Relase Year ");
                        int ReleaseYear = sc.nextInt();
                        System.out.println("Type the devolution Date: ");
                        sc.nextLine();
                        String DevolutionDate = sc.nextLine();
                        System.out.println("Type the price of the Book that the Librabry payed for it ");
                        double Price = sc.nextDouble();
                        System.out.println("Type the Id of the Book");
                        String Id = sc.next();
                        listOfBooks.addBook(new Book(Name, NameAuthor, ReleaseYear, DevolutionDate,  Price, Id ));


                    }
                    else if(storageMenu == 2){
                        System.out.println("Type the id of the Book that you want delet from the Storage");
                        String Id = sc.next();
                        listOfBooks.removeBook(Id);
                    }
                    else if(storageMenu == 3){
                        System.out.println("Type the Id of the Book that you want research");
                        String Id = sc.next();
                        listOfBooks.lookForBook(Id);
                    }
                    else if(storageMenu == 4){
                        listOfBooks.displayBooks();
                    }
                    else if(storageMenu == 5){
                        listOfBooks.isThereAnyBook();
                    }
                    else if(storageMenu == 0){
                        break;
                    }
                }

            }

            else if(firstMenu == 3){
                while(true){
                    showCostumerMenu();
                    int menuCostumer = sc.nextInt();
                    if(menuCostumer == 1) {
                        System.out.println("Type the costumer name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Type number of the CPF eg(097.927.154-10): ");
                        String cpf = sc.next();
                        System.out.println("Type number of the registrancion(studant card) eg(124): ");
                        int registration = sc.nextInt();
                        System.out.println("Type the Id of the Book that the costumer will borrow: ");
                        String Idborrow = sc.next();
                        listOfCostumer.addCostumer(new Costumer(name, cpf, registration ,  Idborrow));
                    }
                    else if(menuCostumer == 2){
                        System.out.println("Type the cpf that costumer that you want delet");
                        String cpf = sc.next();
                        listOfCostumer.removeCostumer(cpf);
                    }
                    else if(menuCostumer == 3){
                        System.out.println("Type the cpf that costumer that you want research");
                        String cpf = sc.next();
                        listOfCostumer.lookForCostumer(cpf);
                    }
                    else if(menuCostumer == 4){
                        listOfCostumer.displayCostumer();
                    }
                    else if(menuCostumer == 5){
                        listOfCostumer.isThereAnyCostumer();
                    }
                    else if(menuCostumer == 0){
                        break;
                    }
                }


            }

            else if(firstMenu == 0){
                break;
            }




        }
        sc.close();
    }

    private static void showPrincipalMenu() {
        System.out.print("----------------------------------------+\n" +
                "+               MENU                   +\n" +
                "+                                      +\n" +
                "+          [1] - RH                    +\n" +
                "+          [2] - STORAGE               +\n" +
                "+          [3] - CLIENTS               +\n" +
                "+          [0] - GET OUT               +\n" +
                "+-------------------------------------+ \n");
    }

    private static void showRHMenu(){
        System.out.println("+------------MENU---RH-------------+\n" +
                "+                                               +\n" +
                "+          [1] - HIRED                 +\n" +
                "+          [2] - FIRED                 +\n" +
                "+          [3] - LOOK FOR              +\n" +
                "+          [4] - DISPLAY STAFF         +\n" +
                "+          [5] - IS THERE ANY EMPLOYEE +\n" +
                "+          [0] - BACK                  +\n" +
                "+------------------------------------- +\n"
        );
    }

    private static void showStorageMenu(){
        System.out.println("+------------MENU---STORAGE----------+\n" +
                "+                                       +\n" +
                "+          [1] - ADD TO STORAGE         +\n" +
                "+          [2] - REMOVE FROM STORAGE    +\n" +
                "+          [3] - LOOK FOR THE STORAFE   +\n" +
                "+          [4] - DISPLAY ALL BOOKS      +\n" +
                "+          [5] - IS THERE ANY BOOK      +\n" +
                "+          [0] - BACK                   +\n" +
                "+-------------------------------------  +\n"
        );
    }

    private static void showCostumerMenu(){
        System.out.println("+------------MENU---STORAGE----------+\n" +
                "+                                       +\n" +
                "+          [1] - ADD COSTUMER           +\n" +
                "+          [2] - REMOVE COSTUMER         +\n" +
                "+          [3] - LOOK FOR COSTUMER       +\n" +
                "+          [4] - DISPLAY ALL COSTUMERS   +\n" +
                "+          [5] - IS THERE COSTUMER       +\n" +
                "+          [0] - BACK                    +\n" +
                "+-------------------------------------   +\n"
        );
    }

}
