package teste;
import java.util.*;

public class Codigo {
	static ArrayList<Integer> qtdpecas = new ArrayList<>();
	static ArrayList<Integer> qtdMaquinas = new ArrayList<>();
	static ArrayList<Integer> maisProdutivo = new ArrayList<>();
	static int quantidade;
	static int maquinas;
	static int pecas;
	

	public static void cadastrar(Scanner scan){
		System.out.println("Digite a quantidade de setores");
		quantidade = scan.nextInt();


		for (int i=0; i < quantidade; i++) {  // loop para cada setor
			int produção = 0;
			System.out.println("Digite quanto tem de máquinas neste setor " + (i + 1));
			maquinas = scan.nextInt();	
			qtdMaquinas.add(maquinas);
			for (int j = 0 ; j < maquinas; j++){	// loop para cada máquina de cada setor
				System.out.println("Quantas peças a máquina " + (j + 1) + " produziu: ");
				pecas = scan.nextInt();
				qtdpecas.add(pecas);
				produção += pecas;	
			}
			maisProdutivo.add(produção);
		}
	}
	
	public static void relatório() {
		int pecas = 0;		//Variável para as peças produzidas em cada máquina
		int produtivo = 0;  //Variável do setor mais produtivo
		int x = 0;			//Variável para usar no for loop a seguir
		for (int i = 0; i < maisProdutivo.size(); i ++) {	 // Verifica qual setor foi mais produtivo
			if (x < maisProdutivo.get(i)) {
				x = maisProdutivo.get(i);
				produtivo = i;
				System.out.println(i);
			}
		}
		
		
		for (int i = 0; i < quantidade; i++) {  	//Relatório de cada máquina e cada setor
			if (i == produtivo) {
				System.out.println("\nSetor " + (i+1) + " *Mais produtivo*\n");
			}else {
				System.out.println("\nSetor " + (i+1) + "\n");
			}
			
			for(int j = 0; j < qtdMaquinas.get(i); j++) {
				if (qtdpecas.get(pecas) < 10) {		//verificação da quantidade de pecas
					System.out.println("Máquina " + (j+1) + " produziu: " + qtdpecas.get(pecas) + " *Abaixo do limite*");
				}else {
					System.out.println("Máquina " + (j+1) + " produziu: " + qtdpecas.get(pecas));
				}
				pecas ++;
			}
		}
	}

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
			while (true) {		//loop de repetição
				System.out.println("----Menu---- \n1- Cadastro de setores \n2- Relátório \n3- Sair");
		int opcao = scan.nextInt();
				switch(opcao){
			case 1:
				cadastrar(scan);
				break;
			case 2:
				relatório();
				break;
			case 3:	
				System.exit(1);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
