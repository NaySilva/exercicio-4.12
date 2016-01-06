
public class Funcionario{
	
	
	String nome;
	String departamento;
	double salario;
	//String dataDeEntrada;
	Data dataDeEntrada;
	String rg;
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataDeEntrada.formatada());
		//System.out.println("Dia: " + this.dataDeEntrada.dia);
		//System.out.println("Mes: " + this.dataDeEntrada.mes);
		//System.out.println("Ano: " + this.dataDeEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho Anual: " + this.calculaGanhoAnual());
	}
	
	public void recebeAumento(double valor){
		salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return salario * 12;
	}
	
}