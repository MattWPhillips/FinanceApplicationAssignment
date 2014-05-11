package mattPhillips.example.financeapplicationassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Accounts extends Activity implements OnClickListener {

	Button bBack, bOptions;
	ExpandableListView elvAccounts;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accounts);
		intialize();
	}

	private void intialize() {
		bBack = (Button) findViewById(R.id.bBack);
		bOptions = (Button) findViewById(R.id.bOptions);
		elvAccounts = (ExpandableListView) findViewById(R.id.elvAccounts);

		bBack.setOnClickListener(this);
		bOptions.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bBack:
			Intent iMain = new Intent(getApplicationContext(),
					MainActivity.class);
			startActivity(iMain);
			break;
		case R.id.bOptions:
			Intent iOptions = new Intent(getApplicationContext(), Options.class);
			startActivity(iOptions);
			break;
		default:
			break;
		}
	}

}
