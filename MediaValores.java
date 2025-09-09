import java.util.Scanner;
public class MediaValores{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3+ nota4)/4;
        
        if(media >= 7){
            System.out.printf("Aluno aprovado. Média: %.2f ",media);
        }
        else if(media < 7 && media >= 5){
             System.out.printf("Aluno de recuperação. Média: %.2f ",media);
        }
        else{
             System.out.printf("Aluno reprovado. Média: %.2f ",media);
        }
    }
}