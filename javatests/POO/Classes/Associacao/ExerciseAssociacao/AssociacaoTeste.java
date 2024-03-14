package javatests.POO.Classes.Associacao.ExerciseAssociacao;

public class AssociacaoTeste {
    public static void main(String[] args) {
        // Regras do exercício

        // Instância do objeto
        // Local
        Local local = new Local("Rua Comerciante Terezinha Maria Alves");
        // Aluno
        Aluno aluno = new Aluno("Heloisa", 18);
        // Professor e sua especialidade
        Professor professor = new Professor("Pedro", "Matemática");
        // Array de alunos para o seminário
        Aluno aluno2 = new Aluno("Thiago", 18);
        Aluno[] alunosParaSeminario = {aluno, aluno2};
        // Seminário com seu título, quantidade de alunos (quem são) e o local do seminário
        Seminario seminario = new Seminario("Potenciação", alunosParaSeminario, local);
        // Seminário disponíveis para um professor - pois um professor pode realizar mais de um seminário
        Seminario[] seminarioDisponiveis = {seminario};
        // Set dos seminários para o professor que foi criado
        professor.setSeminarios(seminarioDisponiveis);
        // Imprimir dados professor
        professor.imprimir();
    }
}
