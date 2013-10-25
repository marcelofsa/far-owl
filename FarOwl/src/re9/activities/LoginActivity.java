package re9.activities;

import re9.farowl.R;
import re9.model.Cliente;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

	Cliente teste;
	Cliente temp;
	public final static String ID_EXTRA="re9.activities._ID";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		teste = new Cliente("paulopena", "email@bol.com.br", "123456");

		Button entrar = (Button) findViewById(R.id.entrarButton);
		TextView cadastrar = (TextView) findViewById(R.id.fazCadastroTextView);
		TextView esquecesenha = (TextView) findViewById(R.id.textEsqueciConta);
		
		cadastrar.setClickable(true);
		esquecesenha.setClickable(true);
		
		esquecesenha.setOnClickListener(onEsqueceSenha);
		cadastrar.setOnClickListener(onCadastrar);
		entrar.setOnClickListener(onLogin);
	}

	private View.OnClickListener onLogin = new View.OnClickListener() {
		public void onClick(View v) {
			EditText login = (EditText) findViewById(R.id.loginEditText);
			EditText senha = (EditText) findViewById(R.id.senhaEditText);
			temp = new Cliente(login.getText().toString(), null, senha
					.getText().toString());

			checaUsuario(temp);
		}
	};
	
	private View.OnClickListener onCadastrar = new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(LoginActivity.this, CadastrarActivity.class);
			LoginActivity.this.startActivity(i);
		}
	};
	
	private View.OnClickListener onEsqueceSenha = new View.OnClickListener() {
		public void onClick(View v) {
			Intent i = new Intent(LoginActivity.this, EsqueceSenhaActivity.class);
			LoginActivity.this.startActivity(i);
		}
	};
	
	

	public void checaUsuario(Cliente c) {
		if ((c.getLogin().equals(teste.getLogin()))
				&& (c.getSenha().equals(teste.getSenha()))) {
			Intent i = new Intent(LoginActivity.this, PrincipalActivity.class);
			i.putExtra(ID_EXTRA, c.getLogin());
			LoginActivity.this.startActivity(i);
			LoginActivity.this.finish();
		} else {
			EditText login = (EditText) findViewById(R.id.loginEditText);
			EditText senha = (EditText) findViewById(R.id.senhaEditText);
			login.setText("");
			senha.setText("");
			Toast.makeText(this, "Usuário ou senha incorretos.", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
