package heranca;

public class FuncionarioXGerenteMain {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		 if(g1.autentica(4320)) {
			 System.out.println("Autenticado");
		 }else {
			 System.out.println("senha Invalida");
		 }

		
	}

}
