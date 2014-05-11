package mattPhillips.example.financeapplicationassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class QuickPay extends Activity implements OnClickListener{
	
	Button bBack, bOptions, bGps, bSubmit;
	RadioGroup rPayExp;
	Spinner sSelect;
	EditText etValue;
	TextView tvGps;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quick_pay);
		intialize();
	}

	private void intialize() {
		bGps = (Button) findViewById(R.id.bGetGPS);
		bSubmit = (Button) findViewById(R.id.bSubmit);
		bBack = (Button) findViewById(R.id.bBack);
		bOptions = (Button) findViewById(R.id.bOptions);
		rPayExp  = (RadioGroup) findViewById(R.id.rgPayExpense); 
		sSelect = (Spinner) findViewById(R.id.sExpenseGoal);
		etValue = (EditText) findViewById(R.id.etValue);
		tvGps = (TextView) findViewById(R.id.tvGPScoOrd);

		bGps.setOnClickListener(this);
		bSubmit.setOnClickListener(this);
		//bBack.setOnClickListener(this);
		//bOptions.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bGetGPS:
			//todo
			break;
		case R.id.bSubmit:
			//todo
			break;
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
