import java.util.Random;

public class Personagem {

    String nome;
    int nivel;
    int forca;

    void mostraStatus(){
        System.out.format("O seu herói %s, tem o nivel de %d, com força de %d\n", this.nome, this.nivel, this.forca);
    }

    void atacar(String alvo, String habilidade){
        if(habilidade.length() == 0){
            System.out.format("O herói %s causou %d de dano ao %s\n", this.nome, calcularDano(), alvo);
        }else if(alvo.length() == 0){
            System.out.format("Sem nenhum alvo para %s atacar\n", this.nome);
        }else if(alvo.length() == 0 && habilidade.length() == 0){
            System.out.format("Sem nenhum alvo para %s atacar\n", this.nome);
        }else{
            System.out.format("O herói %s atacou com %s, e causou %d de dano ao %s\n", this.nome, habilidade, calcularDano(), alvo);
        }

    }

    int calcularDano(){
        Random gerador = new Random();
        int dado = 1 + gerador.nextInt(20);
        int dano = this.forca + dado;
        return dano;
    }

    int mostrarVida(){
        int vidaEnemy = 100;
        int vidaEnemyRestante = vidaEnemy - calcularDano();
        System.out.format("O hydra ficou com %d de vida\n", vidaEnemyRestante);
        return vidaEnemyRestante;
    }
}




