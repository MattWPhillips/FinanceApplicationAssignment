package mattPhillips.example.financeapplicationassignment;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	ImageButton bAccounts, bGoals, bQuickPay;
	Button bOptions;
	TextView tvAccount, tvAmmount;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		intialize();
	}

	private void intialize() {
		// TODO Auto-generated method stub
		bAccounts = (ImageButton) findViewById(R.id.bAccounts);
		bGoals = (ImageButton) findViewById(R.id.bGoals);
		bOptions = (Button) findViewById(R.id.bOptions);
		bQuickPay = (ImageButton) findViewById(R.id.bQuickPay);
		tvAccount = (TextView) findViewById(R.id.tvAccount);
		tvAmmount = (TextView) findViewById(R.id.tvAmount);

		bAccounts.setOnClickListener(this);
		bGoals.setOnClickListener(this);
		bOptions.setOnClickListener(this);
		bQuickPay.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bAccounts:
			Intent iAccounts = new Intent(getApplicationContext(), Accounts.class);
			startActivity(iAccounts);
			break;
		case R.id.bGoals:
			Intent iGoals = new Intent(getApplicationContext(), Goals.class);
			startActivity(iGoals);
			break;
		case R.id.bOptions:
			Intent iOptions = new Intent(getApplicationContext(), Options.class);
			startActivity(iOptions);
			break;
		case R.id.bQuickPay:
			Intent iQuickPay = new Intent(getApplicationContext(), QuickPay.class);
			startActivity(iQuickPay);
			break;
		default:
			break;
		}

	}

	
}
