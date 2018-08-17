package optional;

import java.util.Optional;

/**
 * Uma vantagem de usar o Optional � que batendo o olho na assinatura do metodo j� podemos dizer
 * que o atributo ou metodo pode ser vazio
 * @author decision
 *
 */
public class Aula1 {
	
	private String nome;
	
	public static void main(String[] args) {
		Aula1 v1 = new Aula1();
		
		// 1 forma de usar, deve ser usada certeza que o atributo nunca ser� nulo
		Optional <String> optional1 = Optional.of("Michel");		
		// 2 forma de usar, deve ser usada para inicial um Optional vazio
		Optional <String> optional2 = Optional.empty();		
		// 3 forma de usar, deve ser usada quando n�o temos certeza que a varial n�o ser� nula
		Optional <String> optional3 = Optional.ofNullable(v1.nome);
			
		//Imprimindo
		System.out.println(optional1);
		System.out.println(optional2);
		System.out.println(optional3);
		
		//Buscando Valores
		
		//Neste exemplo o optional consegue buscar o valor do atributo
		System.out.println(optional1.get());
		//Neste exemplo o optional toma uma desicao caso n�o encontre valor no atributo
		System.out.println(optional2.orElse("vazio"));
		// Neste exemplo eu verifico se existe algo dentro do atibuto e posso tomar uma decisao, � um boolean
		System.out.println(optional3.isPresent());
	}
}
