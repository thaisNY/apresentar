public interface ContractBook {
    public void addBook(Book book); //adicionar livro a coleção

    public void removeBook(String Id); //remover da coleção ColectionBook

    public void lookForBook(String Id);//procurar livro especifico na coleção

    public void displayBooks();//exebir tds livros na coleção

    public void isThereAnyBook();//atestar se a coleção está vazia ou não
}
