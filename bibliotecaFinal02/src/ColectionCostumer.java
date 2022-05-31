import java.util.List;
import java.util.ArrayList;

import static java.util.Objects.nonNull;

public class ColectionCostumer {
    ArrayList<Costumer> listOfCostumer = new ArrayList<>();


    public void addCostumer(Costumer costumer){
        listOfCostumer.add(costumer);
        System.out.println("Hired Employee!");
    }

    public void removeCostumer(String cpf){

        for(int i = 0; i<=listOfCostumer.size()-1; i++){
            if(nonNull(listOfCostumer.get(i)) && listOfCostumer.get(i).getCpf().equals(cpf)){
                listOfCostumer.remove(i);
                System.out.println("Demiss Employee!");
            }else{
                System.out.println("Employee did not find!");
                break;
            }
        }

    }

    public void lookForCostumer(String cpf){

        for(int i = 0; i<=listOfCostumer.size()-1; i++){
            if(nonNull(listOfCostumer.get(i)) && listOfCostumer.get(i).getCpf().equals(cpf)){
                System.out.println(listOfCostumer.get(i));
            }else{
                System.out.println("Employee did not find!");
                break;
            }
        }
    }

    public void displayCostumer(){

        System.out.println("************ CURRENT STAFF ************");
        for (int i = 0; i < listOfCostumer.size(); i++){
            System.out.println("["+ (i + 1) +"] -" +  listOfCostumer.get(i).getName() + " -CPF:  " + listOfCostumer.get(i).getCpf());
        }
    }

    public void isThereAnyCostumer() {
        if (listOfCostumer.size() > 0) {
            System.out.println("The size is " + listOfCostumer.size());
        } else {
            System.out.println("Is empety");
        }
    }
}
