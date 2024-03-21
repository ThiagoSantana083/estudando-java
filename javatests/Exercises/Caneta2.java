package javatests.Exercises;

public class Caneta2 {

    // public - público ( + ) - Todos podem ter acesso
    // private - privado ( - ) - Apenas a classe podem ter acesso
    // protected - protegido ( # ) - Apenas a Classe e seus filhos podem ter acesso
        public String modelo;
        public String cor;
        protected int carga;
        private float ponta;
        private boolean isTampada;

        public void status () {
            System.out.println("Modelo da caneta: " + this.modelo);
            System.out.println("Cor da caneta: " + this.cor);
            System.out.println("Carga da caneta: " + this.carga);
            System.out.println("Ponta da caneta: " + this.ponta);
            System.out.println("Está tampada? " + this.isTampada);
        }

        public void rabiscar() {
            if(this.isTampada) {
                System.out.println("Erro, a caneta está tampada e não pode ser usada para rabiscar");
            } else {
                System.out.println("Rabiscando");
            }
        }

        public void tampar() {
            this.isTampada = true;
        }

        public void destampar () {
            this.isTampada = false;
        }
    }

