package Biblioteca;

public class Livro {
    private String autor, titulo ,idioma ,editora;
    private int qtnPaginas;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtnPaginas() {
        return qtnPaginas;
    }

    public void setQtnPaginas(int qtnPaginas) {
        this.qtnPaginas = qtnPaginas;
    }

    public String toString(){
        return "Nome autor: "+this.autor + " Titulo: " + this.titulo + " Quantidade de Paginas: " + this.qtnPaginas ;
    }
}
