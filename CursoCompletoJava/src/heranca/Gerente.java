package heranca;

public class Gerente extends Funcionario{
	
	private int senha=4321;
	
	public double getBonificacao() {
		return this.getSalario() * 0.1;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
