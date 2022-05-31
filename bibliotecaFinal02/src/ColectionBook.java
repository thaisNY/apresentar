import java.util.List;
import java.util.ArrayList;

import static java.util.Objects.nonNull;

public class ColectionBook implements ContractBook{
    ArrayList<Book> listOfBooks = new ArrayList<Book>();


    public void addBook(Book book){
        listOfBooks.add(book);
        System.out.println("The Book was add to the storage!");
    }

    public void removeBook(String Id){

        for(int i = 0; i<=listOfBooks.size()-1; i++){
            if(nonNull(listOfBooks.get(i)) && listOfBooks.get(i).getId().equals(Id)){
                listOfBooks.remove(i);
                System.out.println("The book was remove from the storage!");
            }else{
                System.out.println("Book did not find!");
                break;
            }
        }

    }

    public void lookForBook(String Id){

        for(int i = 0; i<=listOfBooks .size()-1; i++){
            if(nonNull(listOfBooks .get(i)) && listOfBooks .get(i).getId().equals(Id)){
                System.out.println(listOfBooks .get(i));
            }else{
                System.out.println("Book did not find!");
                break;
            }
        }
    }

    public void displayBooks(){

        System.out.println("************ CURRENT STORAGE ************");
        for (int i = 0; i < listOfBooks.size(); i++){
            System.out.println("["+ (i + 1) +"] -" +  listOfBooks .get(i).getName() + " -ID-  " + listOfBooks .get(i).getId());
        }
    }

    public void isThereAnyBook() {
        if ( listOfBooks.size() > 0) {
            System.out.println("The size is " +  listOfBooks.size());
        } else {
            System.out.println("Is empety");
        }
    }
}
