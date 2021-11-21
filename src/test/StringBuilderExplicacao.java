package test;

public class StringBuilderExplicacao {
	public static void main(String[] args) {
		
		//Instanciando uma StringBuilder
		
		StringBuilder SB = new StringBuilder(16);//Dentro do construtor podemos escolher o tamanho, se a gente nao botar nada,
		//O tamanho e automaticamente definido para 16.
		
		//Metodo append...
		
		//Na StringBuilder nao podemos adicionar igual uma String. Precisamos de um metodo chamado "append", ele nao cria uma
		//String nova na memoria igual a String, a gente mexe apenas com o mesmo objeto.
		
		SB.append(false);//A gente pode passar MUITOS parametros mesmo, que ele vai transformar tudo em "String".
		
		System.out.println(SB);
		
		//Podemos passar Strings, Ints, Booleans e entre outros
		
		System.out.println("---------");
		SB.append("\nNumeros: ");
		SB.append(26189);
		
		System.out.println(SB);
		
		//Como com ele consegue imprimir no Sysout como String?
		
		//Metodo toString().
		
		//Ele esta fazendo isso...
		System.out.println("\n" + SB.toString());
		
		//E com esse metodo podemos fazer isso...
		
		String string = SB.toString(); //Se a gente passar sem o metodo vai dar erro.
		System.out.println("---------");
		System.out.println(string);
		
		//Metodo reverse();
		
		//Ele inverte a String inteira, kkkk, praq isso? Sla pora
		
		System.out.println("Reverse");
		System.out.println(SB.reverse());
		
		StringBuilder SBT = new StringBuilder();
		
		SBT.append("arara");
		System.out.println("-------------");
		System.out.println(SBT.reverse()); //KKKKKKKKKKKKK
		
		//Replace
		
		//Quase igual String
		
		System.out.println("Replace...");
		
		System.out.println(SBT);
		System.out.println(SBT.replace(0, 3, "AOPA"));//Primeiro numero comeco pelo index 0 e o segundo pelo 1. Obs.: Sempre que
		//Tiver um comeco e um fim, o fim sempre vai comecar pelo index 1.
		
		//Metodo trimToSize();
		
		System.out.println("Capacidade: " + SB.capacity());
		System.out.println("Tamanho Usado: " + SB.length());
		
		//Quando o Tamanho usado atinge a capacidade, ele aumenta automaticamente...
		
		System.out.println("\nEle aumenta automaticamente...");
		
		SB.append("MDWAIDMIAWDaaaaaa");
		System.out.println("Capacidade: " + SB.capacity());
		System.out.println("Tamanho Usado: " + SB.length());
		
		//Mas como podemos ver, ele aumenta um pouquinho demais, ou seja, podemos utilizar o metodo trimToSize() para ajustar
		//A capacidade para o exato tamanho que a gente esta usando
		
		System.out.println("\nDepois do trimToSize()");
		
		SB.trimToSize();
		System.out.println("Capacidade: " + SB.capacity());
		System.out.println("Tamanho Usado: " + SB.length());
		
		//Metodo delete()
		
		//Ele deleta '-'
		
		SB.delete(0, 0);//Primeiro index do comeco e o segundo do final, ou seja, o comeco comeca pelo 0 e o final no 1
		System.out.println("Tamanho Usado: " + SB.length());//Como podemos ver estou usando 38 de tamanho, eu quero apagar
		//Tudo...
		
		SB.delete(0, 38); //Se a gente nao saber o tamanho do StringBuilder e quiser apagar tudo, podemos fazer isso...
		SB.delete(0, SB.length());
		
		System.out.println("\nDepois do delete...\n");
		System.out.println("Vazio... " + SB);
		System.out.println("Tamanho Usado: " + SB.length());
		
		//Metodo insert()
		
		//Igual o replace, mas nao apaga nenhum valor
		
		SB.append("1234567890");
		System.out.println(SB.insert(2, "##"));//Comeca contando do 0. 0 sendo o comeco
		System.out.println(SB.insert(0, "##"));
		
		SB.delete(0, SB.length());
		
		SB.append("Def").insert(3, "ghi").reverse().delete(2, 4); //Podemos usar varios ao mesmo tempo kkk
		
		System.out.println(SB);
	}
}