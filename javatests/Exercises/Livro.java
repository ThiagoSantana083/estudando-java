package javatests.Exercises;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo = '" + titulo + '\'' +
                ", autor do livro = '" + autor + '\'' +
                "\n, totPag = " + totPag +
                ", pagAtual = " + pagAtual +
                "\n, aberto = " + aberto +
                "\n, leitor = " + leitor.getNome() +
                ", idade do leitor(a) = " + leitor.getIdade() +
                ", sexo do leitor(a) = " + leitor.getSexo() +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Fechando livro...");
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.getTotPag()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(pagina);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() <= 0) {
            System.out.println("Não pode voltar a página");
        } else {
            this.setPagAtual(this.getPagAtual() - 1);

        }
    }
}
