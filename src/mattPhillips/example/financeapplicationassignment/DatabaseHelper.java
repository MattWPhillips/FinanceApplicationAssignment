package mattPhillips.example.financeapplicationassignment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String TABLE_NAME_Accounts = "Accounts";
	public static final String TABLE_NAME_ExpenseGoals = "ExpenseGoals";
	public static final String TABLE_NAME_ExpenseGoalsNames = "ExpenseGoalsNames";
	public static final String COL_ID = "_id integer primary key autoincrement";
	public static final String COL_ACCOUNTS = "Accounts  text not null";
	public static final String COL_EXPENSEGOALNAME = "Expense_Goal_Name  text not null";
	public static final String COL_AMOUNT = "Amount real not null";
	public static final String COL_GPS = "GPS text not null";
	public static final String COL_TIMEDATE = "TimeDate text not null";
	public static final String COL_DEFAULTCOST = "Default_Value real not null";
	public static final String COL_DISCRIPTION = "Discription text not null";
	

	private static final String DATABASE_NAME = "costdatabase.db";
	private static final int DATABASE_VERSION = 1;

	// Database Accounts creation sql statement
	private static final String DATABASE_CREATE_Accounts = "create table "
			+ TABLE_NAME_Accounts + "(" + COL_ID + ", " + COL_ACCOUNTS + ", "
			+ COL_AMOUNT + ");";

	// Database Expense goals table creation sql statement
	private static final String DATABASE_CREATE_ExpenseGoals = "create table "
			+ TABLE_NAME_ExpenseGoals + "(" + COL_ID + ", " + COL_AMOUNT + ", "
			+ COL_GPS + ", " + COL_TIMEDATE + ", " + COL_DEFAULTCOST + ", "
			+ COL_DISCRIPTION + ");";

	// Database Expense Goals Names table creation sql statement
	private static final String DATABASE_CREATE_ExpenseGoalsNames = "create table "
			+ TABLE_NAME_ExpenseGoals
			+ "("
			+ COL_ID
			+ ", "
			+ COL_EXPENSEGOALNAME
			+ ", "
			+ COL_ACCOUNTS
			+ ", "
			+ COL_AMOUNT
			+ ");";

	public DatabaseHelper(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE_Accounts);
		database.execSQL(DATABASE_CREATE_ExpenseGoals);
		database.execSQL(DATABASE_CREATE_ExpenseGoalsNames);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(DatabaseHelper.class.getName(), "Upgrading database from version "
				+ oldVersion + " to " + newVersion
				+ ", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_Accounts);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_ExpenseGoals);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_ExpenseGoalsNames);
		onCreate(db);
	}



	public static void execMySQL(String query) {
		
		
	}
}