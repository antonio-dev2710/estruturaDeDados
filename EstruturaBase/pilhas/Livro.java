package EstruturaBase.pilhas;

public class Livro {
    String nome;
    String isbn;
    String ano;
    String autor;

    
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]"+"\n";

    }
    
}
