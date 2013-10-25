package re9.activities;

import re9.farowl.R;
import re9.model.Cliente;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadastrarActivity extends Activity {

	Cliente logado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_criarconta);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
