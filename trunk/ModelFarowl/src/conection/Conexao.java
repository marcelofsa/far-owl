package conection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;

public class Conexao {

    private String driver = "com.mysql.jdbc.Driver";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    private static Conexao singleton;

    private Conexao() {
    }

    /**
     *
     * Metodo responsavel por gerar uma instancia unica da classe.
     *
     * @return instancia da classe BDMySql.
     *
     */
    public static Conexao getInstance() {

        if (singleton == null) {
            singleton = new Conexao();
        }
        return singleton;
    }

    public boolean Conectar(String url, String usuario, String senha) {

        try {

            Class.forName(driver);
            conexao = DriverManager.getConnection("jdbc:mysql://" + url + "/maridb", usuario, senha);
            return true;
        } catch (Exception ef) {
            return false;

        }
    }

    /**
     *
     * Metodo responsavel por fechar a conexao com o banco de dados.
     *
     * @return true se fechada a conex�o e false caso a conexao n�o tenha sido
     * fechada.
     *
     */
    public boolean fecharConexao() {
        try {
            conexao.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Connection getConnection() {

        return conexao;

    }

}
