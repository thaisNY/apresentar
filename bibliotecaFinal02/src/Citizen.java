public abstract class Citizen {
    private String name;
    private String cpf;

    public Citizen(){

    }

    public Citizen(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCpf(){
        return cpf;
    }
    //N tem set cpf pq nunca pode ser modificado

    public String toString(){
        return "Name: " +
                name +
                "CPF: " +
                cpf;

    }
}
