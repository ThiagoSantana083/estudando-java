package javatests.POO.Classes.Associacao.ExerciseAssociacao;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    // Imprimir informações do professor - em que seminário ele está, o local do seminário, nome dos alunos que ele
    // vai possuir

    public void imprimir() {
        System.out.println("----Dados do Professor---");
        System.out.println("-Professor: " + this.nome);
        System.out.println("-Especialidade: " + this.especialidade);
        if (seminarios == null) return;
        System.out.println("## Seminários cadastrados para dar aula ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(" -> "+ seminario.getTitulo());
            System.out.println("## Local do seminário ##");
            System.out.println(" -> " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) return;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(" -> " +" Nome: "+ aluno.getNome() +","+ " Idade: " + aluno.getIdade());
            }
        }
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
