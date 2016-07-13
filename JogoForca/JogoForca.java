import java.io.IOException;
import java.util.Scanner;
/**

	Objetivo: Acostumar a olhar o javadoc
	
*/
class JogoForca {
	
	public static void main( String[] args ) throws IOException, InterruptedException {
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // clear console
		
		String word		= "VOFFICE";
		String mask 	= "*******";
		String partialAnswerS = "";
		StringBuilder partialAnswerB = new StringBuilder(mask);
		
		System.out.println(String.format("Bem vindo ao jogo da forca:\nTente descobrir qual palavra contem %s letras",word.length()));
		
		byte i = 0;
		byte j = 0;
		while ( i++ < 7 ) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite um valor: ");
			String valor = sc.nextLine().toString().toUpperCase();
			
			for ( j = 0 ; j < word.length() ; j++ ) {
				if ( word.charAt(j) == valor.charAt(0) ){
					partialAnswerB.setCharAt(j,valor.charAt(0));
 				}
			}
			partialAnswerS.trim();
			System.out.println();
			System.out.printf("%s\n\n", partialAnswerB);
		}
	}
}