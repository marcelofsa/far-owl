package principal;

import java.sql.SQLException;

import conection.Conexao;
import conection.ActionsBD;

public class Principal {
	
	private static final Conexao c1 = Conexao.getInstance();
	private static ActionsBD conta = new ActionsBD();

	
	public static void main(String[] args) throws SQLException 
	 { 
	
		boolean i;
		
		i = c1.Conectar("maridb.hopto.org", "maridb", "marisenha");
		
		if (i==true){
			System.out.println("Conectado"); 
		}
		else System.out.println("erro ao conectar"); 
		

		/*i = conta.inserirUsuario(1, "kelvin4", "Kelvin", "Carmo","23/12/2013","Teof","Bahia","Brasil");
		
		if (i==true){
			System.out.println("Inserido com sucesso"); 
		}
		else System.out.println("erro de SQL");*/
		
	 } 

	
	

}
