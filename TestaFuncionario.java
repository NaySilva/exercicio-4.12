public class TestaFuncionario {
	
	public static void main (String[] args){
	
		Funcionario func1 = new Funcionario();
		Data data = new Data();
		
		//se não declarar, no metodo 'mostra' do func1, o dia, o mes e o ano saem com valor 0 
		data.dia = 06;
		data.mes = 01;
		data.ano = 2016;
		
		func1.nome = "Maria";
		func1.salario = 900.0;
		func1.recebeAumento(100.0);
		func1.dataDeEntrada = data;
		
		//formula 1
		//Funcionario func2 = new Funcionario();
		//func2.nome = "Maria";
		//func2.salario = 900.0;
		//func2.recebeAumento(100.0);
		//func2.dataDeEntrada = data;
		
		//formula 2
		Funcionario func2 = func1;
	
		
		if (func1 == func2){
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		//pela formula 1 o codigo acima imprime como diferentes mesmo com os mesmos valores nos atributos
		//pela formula 2 o codigo acima imprime como iguais
		
		
		//System.out.println("salario atual: " + func1.salario());
		//System.out.println("Ganho Anual: " + func1.calculaGanhoAnual());
		func1.mostra();
	}
	
}