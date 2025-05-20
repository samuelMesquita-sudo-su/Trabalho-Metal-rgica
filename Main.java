package teste;
import java.util.*;

public class Codigo {
	static ArrayList<Integer> qtdpecas = new ArrayList<>();
	static ArrayList<Integer> qtdMaquinas = new ArrayList<>();
	static ArrayList<Integer> maisProdutivo = new ArrayList<>();
	static ArrayList<Integer> peças1 = new ArrayList<>();
	static ArrayList<Integer> peças2 = new ArrayList<>();
	static ArrayList<Integer> peças3 = new ArrayList<>();
	static int quantidade;
	static int pecas;
	

	public static void cadastrar(Scanner scan){
		int maquinas;
		quantidade ++;
		System.out.println("Setor " + quantidade + "\n");
		System.out.println("Qual a quantidade de máquinas desse setor:");
		maquinas = scan.nextInt();
		qtdMaquinas.add(maquinas);
		
		int produção = 0;
		for (int j = 0 ; j < maquinas; j++){	// loop para cada máquina de cada setor
			
			System.out.println("Quantas peças a máquina " + (j + 1) + " produziu: ");
			pecas = scan.nextInt();
			qtdpecas.add(pecas);
			System.out.println("Qual o tipo de peças produzidas na máquina "+ (j+1) + "? [1-Grande 2-Média 3-Pequena]");
			int op = scan.nextInt();
			switch (op) {
			case 1: 
				peças1.add(pecas);
				break;
			case 2: 
				peças2.add(pecas);
				break;
			case 3: 
				peças3.add(pecas);
				break;
			default:
				System.out.println("Opção inválida");
			}
			produção += pecas;	
		}
		maisProdutivo.add(produção);
	}
	
	public static void relatórioGeral() {
		Scanner scan = new Scanner(System.in);
		if (quantidade == 0 ) {
			System.out.println("Nenhum setor cadastrado");
		}
		else {
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
		
		for (int i = 0; i < quantidade; i++) {  //Relatório de cada máquina de cada setor
			if (i == produtivo) {
				System.out.println("\nSetor " + (i+1) + ": *Mais produtivo*\n");
			}else {
				System.out.println("\nSetor " + (i+1) + ":\n");
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

		System.out.println("\nProdução por tipo de peça: \n");	//Essa parte mostra a produção por tipo de peça
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
				for (int i = 0; i < peças1.size(); i++) {
					total1 += peças1.get(i);
				}for (int i = 0; i < peças2.size(); i++) {
					total2 += peças2.get(i);
				}for (int i = 0; i < peças3.size(); i++) {
					total3 += peças3.get(i);
				}
			System.out.println("Prudução de peças grandes: " + total1);
			System.out.println("Prudução de peças médias: " + total2);
			System.out.println("Prudução de peças pequenas: " + total3);
		}
	}
		
	
	public static void relatórioPeças(){
		Scanner scan = new Scanner(System.in);
		System.out.println("\nProdução por tipo de peça: \n");
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
				for (int i = 0; i < peças1.size(); i++) {
					total1 += peças1.get(i);
				}for (int i = 0; i < peças2.size(); i++) {
					total2 += peças2.get(i);
				}for (int i = 0; i < peças3.size(); i++) {
					total3 += peças3.get(i);
				}
			System.out.println("Prudução de peças grandes: " + total1);
			System.out.println("Prudução de peças médias: " + total2);
			System.out.println("Prudução de peças pequenas: " + total3);
		
	}
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
			while (true) {		//loop de repetição
				System.out.println("\n----Menu---- \n1- Cadastro de setores \n2- Relátório Geral\n3- Produção apenas por tipo de peças \n4- Sair");
		int opcao = scan.nextInt();
				switch(opcao){
			case 1:
				cadastrar(scan);
				break;
			case 2:
				relatórioGeral();
				break;
			case 3:	
				relatórioPeças();
				break;
			case 4:
				scan.close();
				System.exit(1);
				break;
			default:
				System.out.println("Opção Inválida");
			}
		}
	}
}
