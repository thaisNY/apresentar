public interface ContractEmployee {
    public void admit(Employee employee); //adicionar funcionario a coleção

    public void dismiss(String cpf); //remover da coleção ColectionEmployee

    public void lookForEmployee(String cpf);//procurar funcionario especifico na coleção

    public void displayStaff();//exebir tds funcionarios na coleção

    public void isThereAnyEmployee();//atestar se a coleção está vazia ou não
}
