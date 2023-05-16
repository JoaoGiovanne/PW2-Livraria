public class LivroTeste {

    public static void main(String[] args) {

        RegistroVendas venda = new RegistroVendas();
        LivroFisico meuLivro = new LivroFisico("O Hobbit", 9.99);
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");
        Editora editora1 = new Editora();
        editora1.email = "EditoraJojoGigi@gmail.com";
        meuLivro.setEditora(editora1);
       // meuLivro.aplicarDesconto(0.5);

        venda.adicionar(meuLivro);
        meuLivro.exibirDados();



        ///////////////////////////////////////////////////////////////////////////////////////////

        LivroDigital livroFavorito = new LivroDigital("O Código Da Vinci", 99.9);
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setMarcaDAgua("teste@teste.com");
        Editora editora2 = new Editora("JojoGigi");
        editora2.email = "EditoraUai@gmail.com";
        livroFavorito.setEditora(editora2);
        //livroFavorito.aplicarDesconto(0.25);
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);


        venda.adicionar(livroFavorito);

        livroFavorito.exibirDados();
        ////////////////////////////////////////////////////////////////////////////////////////////
    }
}
