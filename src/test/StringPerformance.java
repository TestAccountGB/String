package test;

public class StringPerformance {
	public static void main(String[] args) {
		//Agora voce deve estar se perguntando, mas se eu tiver um metodo que cria varias Strings uma diferentes das outras, entao
		//O sistema vai ficar lento nao e? Sim, mas a gente tem uma classe chamada "StringBuilder" que e basicamente uma String,
		//Mas sem essa coisa da String Pool, ou seja, tem como trabalhar com o mesmo objeto, sem ficar criando uma nova na
		//String na memoria toda hora. Obs.: Isso poder ser bom ou ruim, tente analizar a situacao direito.
		
		//Mas como a gente vai calcular a diferenca de tempo? Assim...
		
		long inicio = System.currentTimeMillis();//Aqui ele vai comecar a contar desde o comeco do codigo
		//Usamos "long" pq pode ser um numero muito grande, pq e em milisegundos.
		criarStrings(50000); //Aqui a gente esta criando 5 mil Strings
		long fim = System.currentTimeMillis();//Aqui ele vai comecar a contar quando acabar o metodo
		
		System.out.println("Tempo gasto String: " + (fim-inicio) + " ms");
		
		inicio = System.currentTimeMillis();//A gente bota isso no comeco do codigo que a gente quer ver o tempo de demora
		criarStringsBuilder(50000);//Aqui a gente esta criando 5 mil StringsBuilder
		fim = System.currentTimeMillis();//E aqui a gente bota no fonal do codigo que a gente quer ver o tempo de demora
		
		System.out.println("Tempo gasto StringBuilder: " + (fim-inicio) + " ms");
		
		System.out.println("\nComo voce pode ver, tem uma diferenca tremenda. Obs.: O tempo depende do seu processador");
		System.out.println("Mas Isso depende da situacao. Pense bem antes de usar, aqui estamos criando 5k de Strings diferentes,"
				+ "Ou seja, tornando a StringPool \nalgo ruim, mas ela pode ajudar bastante, dependendo da situacao.");
		//Quanto melhor o processador, menor o tempo.
	}
	
	private static void criarStrings(int tam) {
		@SuppressWarnings("unused")
		String string = "";
		for(int i = 0; i < tam; i++) {
			string += i; //Aqui ele sempre vai criar uma nova String na pool
			
			//System.out.println(string); //Se a gente quiser ver as Strings criadas, mas vao ser muitas, entao vai ficar dificil a vizuliazacao
		}
	}
	
	private static void criarStringsBuilder(int tam) {
		StringBuilder string = new StringBuilder(tam);//Precisamos aumentar o tamanho dela conforme o numero vai ficando maior.
		for(int i = 0; i < tam; i++) {
			string.append(i);
			//Aqui a gente esta trabalhando com o mesmo objeto. Obs.: O metodo "append" na classe StringBuilder
			//Significa adicionar algo, como voce pode ver eu estou adicionando um tipo de dado Int, mas a StringBuilder aceita do
			//Mesmo jeito.
			
			//System.out.println(string);
		}
	}
	
}