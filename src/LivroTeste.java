public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Hobbit", 9.99);
        //meuLivro.nome = "O Hobbit";
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora();
        //editora1.nome = "JojoGigi";
        editora1.email = "EditoraJojoGigi@gmail.com";
        meuLivro.setEditora(editora1);
        meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();

//        Livro livroFavorito = new Livro("O Código Da Vinci", 99.9);
//        //livroFavorito.nome = "O Código Da Vinci";
//        livroFavorito.setResumo("bla bla bla bla bla");
//        livroFavorito.setPaginas(500);
//        livroFavorito.setAutor("Dan Brown");
//        Editora editora2 = new Editora("JojoGigi");
//        //editora2.nome = "Uai";
//        editora2.email = "EditoraUai@gmail.com";
//        livroFavorito.setEditora(editora2);
//        livroFavorito.aplicarDesconto(0.25);
//        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        LivroDigital livroFavorito = new LivroDigital("O Código Da Vinci", 99.9);
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setMarcaDAgua("teste@teste.com");
        Editora editora2 = new Editora("JojoGigi");
        //editora2.nome = "Uai";
        editora2.email = "EditoraUai@gmail.com";
        livroFavorito.setEditora(editora2);
        livroFavorito.aplicarDesconto(0.25);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        livroFavorito.exibirDados();
    }
}
