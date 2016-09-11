package com.st.accounts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;




public class Main extends Activity {
	//Button btnEnter;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	}

	 @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			return Utils.inflateMenu(this,menu);
		}
		
		@Override 
		public boolean onOptionsItemSelected(MenuItem item) {
			return  Utils.handleMenuOption(this,item);
		}
	
	public void ListAccounts(View v) {
		
		Intent intent = new Intent(this,ListAccounts.class);
    	startActivity(intent);
    	Toast.makeText(this, "Welcome To Personal Account Management!", Toast.LENGTH_LONG).show();
	} 
}