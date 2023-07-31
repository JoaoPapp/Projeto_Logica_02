import java.util.Scanner;

public class Main { 
	
	public int[] numeros = {10,20,30};
	
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		int pontos = 0;
		System.out.println("Bem-Vindo! Pressione S para continuar.");
		String string = scanner.nextLine();
		if(string.equals("s")) {
			System.out.println("Qual a capital do Brasil?");
			string = scanner.nextLine();
			if(string.equals("brasilia")) {
				pontos++;
				System.out.println("Você pontuou!");
				System.out.println("Você deseja continuar? (s) ou desistir? (d)");
				string = scanner.nextLine();
				if(string.equals("s")) {
					//Próxima pergunta.
					System.out.println("Em qual continente fica o Brasil?");
					string = scanner.nextLine();
					if(string.equals("america do sul")){
						pontos++;
						System.out.println("Você pontuou!");
						System.out.println("Você deseja continuar? (s) ou desistir? (d)");
						string = scanner.nextLine();
						if(string.equals("s")) {
							System.out.println("Qual o nome da melhor escole de t.i do Brasil?");
							string = scanner.nextLine();
							if(string.equals("danki code")) {
								pontos++;
								System.out.println("Você ganhou!");
								System.out.println("Sua pontuação final foi de: "+pontos);
							}else {
								System.out.println("Game Over! Sua pontuação foi de: "+pontos);
							}
						}else {
							System.out.println("Game Over! Sua pontuação foi de: "+pontos);
						}
					}else {
						System.out.println("Game Over! Sua pontuação foi de: "+pontos);
					}
				}else {
					System.out.println("Game Over! Sua pontuação foi de: "+pontos);
				}
			}else {
				System.out.println("Game Over! Sua pontuação foi de: "+pontos);
			}
		}else {
			System.out.println("Acabou o jogo... Você pontuou 0");
		}
	
	}
	

	
	
}
