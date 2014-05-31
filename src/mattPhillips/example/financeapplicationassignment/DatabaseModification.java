package mattPhillips.example.financeapplicationassignment;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseModification {

	private SQLiteDatabase database;
	  private DatabaseHelper dbHelper;
	  private String[] allColumns = { DatabaseHelper.COL_ID,
			  						DatabaseHelper.COL_ACCOUNTS,
			  						DatabaseHelper.COL_AMOUNT,
			  						DatabaseHelper.COL_DEFAULTCOST,
			  						DatabaseHelper.COL_DISCRIPTION,
			  						DatabaseHelper.COL_EXPENSEGOALNAME,
			  						DatabaseHelper.COL_GPS,
			  						DatabaseHelper.COL_TIMEDATE };
	  
	  public DatabaseModification(Context context) {
	    dbHelper = new DatabaseHelper(context);
	  }

	  public void open() throws SQLException {
	    database = dbHelper.getWritableDatabase();
	  }

	  public void close() {
	    dbHelper.close();
	  }
	
	//add pay 2 things to try
	  public void createExpense(String comment) {
		  open();	
		  String query = "INSERT INTO " + DatabaseHelper.TABLE_NAME_ExpenseGoals + " ("
	              + DatabaseHelper.COL_ACCOUNTS + ", " + DatabaseHelper.COL_AMOUNT + ", "
	              + DatabaseHelper.COL_EXPENSEGOALNAME + ", " + DatabaseHelper.COL_GPS + ", "
	              + DatabaseHelper.COL_TIMEDATE + ") Values ('Cash', '', '', '0', '')";
		  	database.execSQL(query);

		    close();
		  }
	  
	  public Expense addExpense(Expense expense) {
		    ContentValues values = new ContentValues();
		    values.put(DatabaseHelper.COL_EXPENSEGOALNAME, expense.expenseGoalName);
		    values.put(DatabaseHelper.COL_AMOUNT, expense.amount);
		    values.put(DatabaseHelper.COL_GPS, expense.gps);
		    values.put(DatabaseHelper.COL_DISCRIPTION, expense.discrtiption);
		    values.put(DatabaseHelper.COL_TIMEDATE, expense.timeDate);
		    
		    long insertId = database.insert(DatabaseHelper.TABLE_NAME_ExpenseGoals, null,
		        values);
		    Cursor cursor = database.query(DatabaseHelper.TABLE_NAME_ExpenseGoals,
		        allColumns, DatabaseHelper.COL_ID + " = " + insertId, null,
		        null, null, null);
		    cursor.moveToFirst();
		    Expense newComment = cursorToExpense(cursor);
		    cursor.close();
		    return newComment;
		  }  

	
	//add expense
	  
	  public GoalExpense newGoalExpense(GoalExpense goalExpense) {
		    ContentValues values = new ContentValues();
		    values.put(DatabaseHelper.COL_EXPENSEGOALNAME, goalExpense.getName());
		    values.put(DatabaseHelper.COL_ACCOUNTS, goalExpense.getAccount());
		    values.put(DatabaseHelper.COL_AMOUNT, goalExpense.getAmmount());
		    
		    long insertId = database.insert(DatabaseHelper.TABLE_NAME_ExpenseGoalsNames, null,
		        values);
		    Cursor cursor = database.query(DatabaseHelper.TABLE_NAME_ExpenseGoalsNames,
		        allColumns, DatabaseHelper.COL_ID + " = " + insertId, null,
		        null, null, null);
		    cursor.moveToFirst();
		    GoalExpense newGoalExpense = cursorToGoalExpense(cursor);
		    cursor.close();
		    return newGoalExpense;
		  }  
	
	//remove expense
	  
	  public void deleteGoalExpense(GoalExpense goalExpense) {
		    long id = goalExpense.getId();
		    System.out.println("Goal/Expense deleted with id: " + id);
		    database.delete(DatabaseHelper.TABLE_NAME_ExpenseGoalsNames, DatabaseHelper.COL_ID
		        + " = " + id, null);
		  }
	
	//add account
	  public Account addAccount(Account account) {
		    ContentValues values = new ContentValues();
		    values.put(DatabaseHelper.COL_ACCOUNTS, account.getName());
		    values.put(DatabaseHelper.COL_AMOUNT, account.getAmount());
		    
		    long insertId = database.insert(DatabaseHelper.TABLE_NAME_Accounts, null,
		        values);
		    Cursor cursor = database.query(DatabaseHelper.TABLE_NAME_Accounts,
		        allColumns, DatabaseHelper.COL_ID + " = " + insertId, null,
		        null, null, null);
		    cursor.moveToFirst();
		    Account newAccount = cursorToAccount(cursor);
		    cursor.close();
		    return newAccount;
		  }
	//remove accounts
	
	  
	  public List<Expense> getAllExpenses() {
		    List<Expense> expenses = new ArrayList<Expense>();

		    Cursor cursor = database.query(DatabaseHelper.TABLE_NAME_ExpenseGoals,
		        allColumns, null, null, null, null, null);

		    cursor.moveToFirst();
		    while (!cursor.isAfterLast()) {
		      Expense expense = cursorToExpense(cursor);
		      expense.add(cursor);
		      cursor.moveToNext();
		    }
		    // make sure to close the cursor
		    cursor.close();
		    return expenses;
		  }

		  private Expense cursorToExpense(Cursor cursor) {
			  Expense expense = new Expense(cursor.getInt(0),cursor.getString(1),cursor.getString(2),
					  cursor.getString(3),cursor.getFloat(4),cursor.getFloat(5), cursor.getString(6),
					  cursor.getString(7));
		    return expense;
		  }
		  private Account cursorToAccount(Cursor cursor) {
			  Account account = new Account(cursor.getInt(0), cursor.getString(1),cursor.getFloat(2));
		    return account;
		  }
		  private GoalExpense cursorToGoalExpense(Cursor cursor) {
			  GoalExpense goalExpense = new GoalExpense(cursor.getInt(0), cursor.getString(1),
					  cursor.getString(2), cursor.getFloat(3));
		    return goalExpense;
		  }
}
