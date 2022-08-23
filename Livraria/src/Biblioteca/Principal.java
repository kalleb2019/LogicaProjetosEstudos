package Biblioteca;

public class Principal {
    public static void main(String args[]){
        Livro livro1 = new Livro();
        livro1.setAutor("Sean Murphy,");
        livro1.setTitulo("Batman: Cavaleiro Branco: Edição de Luxo,");
        livro1.setEditora("Panini,");
        livro1.setIdioma("Português,");
        livro1.setQtnPaginas(248);

        Livro livro2 = new Livro();
        livro2.setAutor("Frank Miller,");
        livro2.setTitulo("Batman - Ano Um ,");
        livro2.setEditora("Panini,");
        livro2.setIdioma("Português,");
        livro2.setQtnPaginas(132);

        Livro livro3 = new Livro();
        livro3.setAutor("Scott Snyder,");
        livro3.setTitulo("Batman - A Morte da Família,");
        livro3.setEditora("Panini,");
        livro3.setIdioma("Português,");
        livro3.setQtnPaginas(252);

        Livro livro4 = new Livro();
        livro4.setAutor("Alan Moore,");
        livro4.setTitulo("Batman: A Piada Mortal,");
        livro4.setEditora("Panini,");
        livro4.setIdioma("Português,");
        livro4.setQtnPaginas(288);

        Livro livro5 = new Livro();
        livro5.setAutor("Mike W. Barr,");
        livro5.setTitulo("Batman: Ano Dois,");
        livro5.setEditora("Panini, ");
        livro5.setIdioma("Português,");
        livro5.setQtnPaginas(176 );

        Livro livro6 = new Livro();
        livro6.setAutor("Tom King,");
        livro6.setTitulo("Batman/Mulher-Gato,");
        livro6.setEditora("Panini,");
        livro6.setIdioma("Português,");
        livro6.setQtnPaginas(112 );

        Livro livro7 = new Livro();
        livro7.setAutor("Grant Morrison,");
        livro7.setTitulo("Batman - O Retorno de Bruce Wayne,");
        livro7.setEditora("Panini,");
        livro7.setIdioma("Português,");
        livro7.setQtnPaginas(216);

        System.out.print(livro1.toString());


    }
}
