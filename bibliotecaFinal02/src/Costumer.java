public class Costumer extends Citizen{

    private int registration; //carteira de estudante
    private  String Idborrow;

    public Costumer() {
        super();
    }

    public Costumer(String name, String cpf, int registration, String Idborrow) {
        super(name, cpf);
        this.registration = registration;
        this.Idborrow = Idborrow;
    }

    public int getRegistration(){
        return registration;
    }
    public void setRegistration(int registration){
        this.registration = registration;
    }

    //Borrowed books with students
    public String getIdborrowt(){
        return Idborrow;
    }
    public void setIdborrow(String Idborrow){
        this.Idborrow = Idborrow;
    }
}
