package mattPhillips.example.financeapplicationassignment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;

public class Goals extends Activity implements OnClickListener{
	
	Button bAdd, bBack, bOptions;
	ExpandableListView elvGoals;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.goals);
		intialize();
	}

	private void intialize() {
		bAdd = (Button) findViewById(R.id.bAddGoalExpense);
		bBack = (Button) findViewById(R.id.bBack);
		bOptions = (Button) findViewById(R.id.bOptions);
		elvGoals = (ExpandableListView) findViewById(R.id.elvAccounts);

		bAdd.setOnClickListener(this);
		bBack.setOnClickListener(this);
		bOptions.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bAddGoalExpense:
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
