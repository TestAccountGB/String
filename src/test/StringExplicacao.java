package test;

public class StringExplicacao {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String saudacao = "Oi";

		//Voce sabia que Strings sao imutaveis? Ou seja, elas nao podem mudar. Ai voce deve estar falando, ela pode sim ue, so
		//Usar o comando:

		saudacao = "Ola";

		//Voce sabe o que acabou de acontecer aqui? Ela nao mudou a String "Oi", ela criou outra String com a mensagem
		//"Ola" e a variavel "saudacao" agora esta referenciando a String "Ola", mas a String "Oi" ainda existe e esta na memoria.
		//Que louco né? Isso se chama "String constant pool", ou seja, todas as Strings sao constantes, elas nao mudam, mas a cada
		//String que voce cria, ou "muda" ela cria outra String e joga ela na "pool (piscina)", esse e o espaco que o java reserva para
		//As Strings.

		//Ta agora eu entendi. Mas porque o java faz isso? Para economizar memoria meu amigo, por exemplo:

		saudacao = "Opa"; // Criei outra String com o a mensagem "Opa".

		String saudacao2 = "Ola";
		// Aqui eu criei "outra" String com o "Ola" correto? Nao. Eu apenas criei uma variavel de referencia
		//Que vai referenciar a String "Ola" que ja existe na String constant pool, ou seja, posso criar milhares de variaveis de
		//Referencia que referencia a mensagem "Ola" que o java vai fazer todas as variaveis referenciar a mesma String, e assim
		//Poupando memoria.

		//Metodo concat...

		saudacao2.concat(" and Hi");
		//O que esta acontecendo aqui? O Java esta criando uma nova String com a mensagem " and Hi"
		//E esta adicionando essa mensagem para a String que a variavel "saudacao2" esta fazendo referencia, ou seja, a String "Ola"
		//E ai criando uma nova String chamada "Ola and Hi" (Exatamente assim, com letras maiusculas e minusculas, acentos etc.).

		//Mesma coisa que... saudacao2 += " and Hi"; Acho que e ate melhor usar dessa forma, pois ele nao chama nenhum
		//Metodo, que possivelmente fica mais leve.

		//Entao se eu usar o Sysout para mostrar a "saudacao2" vai mostrar "Ola and Hi"? 
		//Nao, porque a variavel "saudacao2" ainda esta referenciando a String "Ola".

		System.out.println(saudacao2);

		saudacao2 = "Ola and Hi"; 
		//Aqui eu nao estou criando uma nova String, apenas estou referenciando uma String que ja existe.

		System.out.println(saudacao2);

		//Obs.: Se eu fizer: saudacao2 = "Ola and hi"; Com o "h" minusculo, ele vai criar outra String "Ola and hi", mas agora com o "h"
		//Minusculo, para fazer uma variavel de referencia referenciar uma String ja existente precisamos escrever exatamente igual

		//Como String e uma classe, tambem podemos instanciar ela, mas tem diferenca? Mano, quase nenhuma, alias
		//Nao faca isso. Vo fazer apenas para te mostrar a diferenca

		String saudacao3 = "Ola and Hi";
		System.out.println(saudacao3 == saudacao2);
		//Como podemos ver aqui, a gente consegue comparar duas variaveis de referencia que estao referenciando a 
		//Mesma String na pool de String, mas quando a gente instancia uma String, a gente ta criando uma nova String 
		//Na pool, mesmo se ela ja existir, ou seja, vao ter uas Strings iguais, e também criamos um
		// Objeto String que e inutil ._., ou seja, nao faco isso ;-;

		String saudacao4 = new String("Ola and Hi");

		System.out.println(saudacao4 == saudacao2);// Como podemos ver ele retorna false, porque as duas variaves nao
		//Estao referenciando a mesma String. Mas tem como usar o metodo "equals()", que ele verifica char por char para
		//Ver se e igual ou nao, ao inves de so ver se eles estao referenciando a mesma String

		System.out.println("Equals...");

		System.out.println(saudacao3.equals(saudacao2));

		System.out.println(saudacao4.equals(saudacao2));

		//Tambem temos um equals que ignora letra maiuscula e minuscula...

		saudacao3 = "Aopa meu Amigo";
		saudacao4 = "aopa meu AMIGO";

		System.out.println("Equals normal...");
		System.out.println(saudacao3.equals(saudacao4));

		System.out.println("Equals ignorando letras maiusculas e minusculas...");

		System.out.println(saudacao3.equalsIgnoreCase(saudacao4));

		//Claro que usar o metodo equals fica mais pesado do que usar dois iguais, mas ele e muito mais seguro do que usar
		//Os iguais.

		//Ate o java fala que o uso desse construtor nao e nescessario, entao so nao use ;-;, mas pelo menos agora voce sabe
		//A diferenca ._.

		//"Note that use of this constructor is unnecessary since Strings are immutable." - Java

		//Metodo charAt()...

		//Mostra o char que a gente ecolher pelo index.

		String anime = "Naruto";

		System.out.println(anime.charAt(1)); //Comeca pelo index 0, igual um array

		//length(), mostra o tamanho da String.

		saudacao3 = "oi";

		System.out.println("length...");
		System.out.println(saudacao3.length());

		//lower e upper case...

		//Deixa a letra maiuscula ou minuscula

		System.out.println("Lower e Upper Case...");

		saudacao3 = "OLA";

		System.out.println(saudacao3.toLowerCase());

		saudacao3 = "ola";
		System.out.println(saudacao3.toUpperCase());

		//replace() troca as letras

		System.out.println("Replace");

		saudacao3 = "aaaaOOOOO";

		System.out.println(saudacao3.replace('a', 'o'));//A gente tem que passar como char, e o primeiro parametro e a
		//Letra antiga e o segundo parametro a nova.

		//substring() ele parte a String

		String numeros = "1234567890";

		System.out.println("Substring...");
		System.out.println(numeros.substring(0, 4));//O primeiro parametro e aonde vc quer que comece e o segundo
		//Aonde termine. Obs.: O primeiro parametro comeca do 0, como vemos no Sysout o primeiro numero e o 1, e o
		//Segundo parametro comeca do 1, como vemos no Sysout a substring foi ate o numero 4.

		//Tambem podemos passar so o primeiro parametro que a gente escolhe de onde comeca.
		//Podemos fazer isso por causa da sobrecarga de metodos, se vc nao sabe o que e isso pesquise!

		System.out.println("Substring apenas com 1 parametro...");
		System.out.println(numeros.substring(3));

		//Metodo trim(), ele tira todos os espacos do comeco e do fim da String, SO DO COMECO E DO FIM, olhe o exemplo:

		String nome = "             Augusto Cesar                ";

		System.out.println("Normal...");
		System.out.println(nome);
		System.out.println("Sem Espaco...");
		System.out.println(nome.trim());

		//Metodo muito bom para usar com banco de dados, porque e muito ruim a gente salvar um nome com espaco
		//No comeco ou no fim, nao e ruim e HORRIVEL.

	}
}