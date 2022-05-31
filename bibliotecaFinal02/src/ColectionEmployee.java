import java.util.List;
import java.util.ArrayList;

import static java.util.Objects.nonNull;

public class ColectionEmployee implements ContractEmployee{
    ArrayList<Employee> listOfEmployee = new ArrayList<>();


    public void admit(Employee employee){
        listOfEmployee.add(employee);
        System.out.println("Hired Employee!");
    }

    public void dismiss(String cpf){

        for(int i = 0; i<=listOfEmployee.size() -1; i++){
            if(nonNull(listOfEmployee.get(i)) && listOfEmployee.get(i).getCpf().equals(cpf)){
                listOfEmployee.remove(i);
                System.out.println("Demiss Employee!");
            }else{
                System.out.println("Employee did not find!");
                break;
            }
        }

    }

    public void lookForEmployee(String cpf){

        for(int i = 0; i<=listOfEmployee.size()-1; i++){
            if(nonNull(listOfEmployee.get(i)) && listOfEmployee.get(i).getCpf().equals(cpf)){
                System.out.println(listOfEmployee.get(i));
            }else{
                System.out.println("Employee did not find!");
                break;
            }
        }
        /*int indexEmployee = listOfEmployee.indexOf(employee);
        System.out.println("The index of the employee is " + Integer.toString(indexEmployee));*/

    }

    public void displayStaff(){

        System.out.println("************ CURRENT STAFF ************");
        for (int i = 0; i < listOfEmployee.size(); i++){
            System.out.println("["+ (i + 1) +"] -" +  listOfEmployee.get(i).getName() + " -CPF:  " + listOfEmployee.get(i).getCpf());
        }
    }

    public void isThereAnyEmployee() {
        if (listOfEmployee.size() > 0) {
            System.out.println("The size is " + listOfEmployee.size());
        } else {
            System.out.println("Is empety");
        }
    }
}
