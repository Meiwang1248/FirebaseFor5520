package edu.neu.cs5520.Week8;


        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

        import com.google.firebase.database.DatabaseReference;

        import edu.neu.cs5520.Week8.models.User;


public class MainActivity extends AppCompatActivity {

    private static final String SERVER_KEY = "AAAADSk70sk:APA91bE5pbobY4eklHx46vhsoFJGIMfzqNjgqfywBlcJFPxS-hKwIMgJDnza4DjlAeSkSeCEMoorcH9ie5hEzJo1mlvxuce3bx-EHvmu-WIe7cSCI17Se6YiTEJaPJVfMMKqsF6uWQTW";

    private DatabaseReference databaseReference;
    protected static User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }
}