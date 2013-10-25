package re9.model;

public class Cliente {

	private String prenome;
	private String sobrenome;
	private String login;
	private String email;
	private String senha;
	
	
	public Cliente(String login, String email, String senha) {
		this.login = login;
		this.email = email;
		this.senha = senha;
	}

	public String getPrenome() {
		return prenome;
	}


	public void setPrenome(String prenome) {
		this.prenome = prenome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
