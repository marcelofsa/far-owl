package re9.activities;

import re9.farowl.R;
import re9.model.Cliente;
import android.os.Bundle;
import android.app.Activity;
import android.text.LoginFilter;
import android.view.Menu;
import android.widget.TextView;

public class PrincipalActivity extends Activity {

	Cliente logado = new Cliente(null, null, null);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		logado.setLogin(getIntent().getExtras().getString(LoginActivity.ID_EXTRA));
		
		TextView nome = (TextView) findViewById(R.id.bemvindo);
		nome.setText(logado.getLogin().toUpperCase() + " LOGADO COM SUCESSO!");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
