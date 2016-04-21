package com.it.userslogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	public void fun(View view){
		EditText nameET=(EditText) findViewById(R.id.editText1);
		EditText passET=(EditText) findViewById(R.id.editText2);
		String name=nameET.getText().toString();
		String pass=passET.getText().toString();
		if(name.equals("5633")  &&pass.equals("000")){
			Toast.makeText(this, "succeed", Toast.LENGTH_LONG).show();
			Intent aba=new Intent(this,MainActivity.class);
			startActivity(aba);
		}
		else
			Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
