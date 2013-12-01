package conection;

import java.sql.PreparedStatement;// classe usada como intermedio pra se comunicar com o banco.
import java.sql.ResultSet;// VCS IRAO USAR !!!!
import java.sql.SQLException;

public class ActionsBD {
	
	private Conexao c1 = Conexao.getInstance();//classe conexao, um singleton, para se conectar com o banco.
	public ResultSet resultset;
        static ActionsBD instance;
	
	private ActionsBD(){
		
		c1.Conectar("maridb.hopto.org", "maridb", "marisenha");
		
	}
        
        public static ActionsBD getInstance() {

        if (instance == null) {
            instance = new ActionsBD();
        }
        return instance;
    }
	
	public boolean inserirConta(int id,String nome,String login, String senha, String email) throws SQLException{
		
		try{
		String query = "INSERT INTO Conta VALUES (?,?,?,?)"; // COMANDO SQL !!!
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, id);
                        stmt.setString(2, login);
                        stmt.setString(3, senha);
                        stmt.setString(4, email);
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirUsuario(int id,String login, String nome, String sobrenome,String datanasc, String Cidade, String Estado, String Pais) throws SQLException{
		
		try{
		String query = "INSERT INTO Usuario VALUES (?,?,?,?,?,?,?,?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, id);
                        stmt.setString(2, login);
                        stmt.setString(3, nome);
                        stmt.setString(4, sobrenome);
                        stmt.setString(5, datanasc);
                        stmt.setString(6, Cidade);
                        stmt.setString(7, Estado);
                        stmt.setString(8, Pais);
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirAdministrador(int id) throws SQLException{
		
		try{
		
		String query = "INSERT INTO Administrador VALUES (?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, id);
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirComum(int id) throws SQLException{
		
		try{
		
		String query = "INSERT INTO Comum VALUES (?,?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, id);
                        stmt.setInt(2, 0);
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirOficial(int id, String cnpj, String endereco, String setor_atua) throws SQLException{
		
		try{
		
		String query = "INSERT INTO Oficial VALUES (?,?,?,?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, id);
                        stmt.setString(2, cnpj);
                        stmt.setString(3, endereco);
                        stmt.setString(4, setor_atua);
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirNotificacao(int idUsuario, int idNot, String tag, boolean status, String foto, String video, String texto, int apoio) throws SQLException{
		
		try{
		
		String query = "INSERT INTO Notificacao VALUES (?,?,?,?,?,?,?,?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, idUsuario);
                        stmt.setInt(2, idNot);
                        stmt.setString(3, tag);
                        stmt.setBoolean(4, status);
                        stmt.setString(5, foto);
                        stmt.setString(6, video);
                        stmt.setString(7, texto);
                        stmt.setInt(8, apoio);
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}
	

	public boolean inserirComentario(int idUsuario, int idNot, int idCom, String texto, String video, String foto) throws SQLException{
		
		try{
		
		String query = "INSERT INTO Comentario VALUES (?,?,?,?,?,?)";
                    try (PreparedStatement stmt = c1.getConnection().prepareStatement(query)) {
                        stmt.setInt(1, idUsuario);
                        stmt.setInt(2, idNot);
                        stmt.setInt(3, idCom);
                        stmt.setString(4, texto);
                        stmt.setString(5, foto);
                        stmt.setString(6, video);
                        
                        
                        stmt.executeUpdate();
                    }
		
		return true;
		
		}catch(SQLException ex){
			
		return false;	
			
		}
		
	}

}
