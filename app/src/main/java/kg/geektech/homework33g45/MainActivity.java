package kg.geektech.homework33g45;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> address;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.activity_main_recyclerView);
        address = new ArrayList<>();
        for (int i = 0; i < 50; i++) address.add("2 Молодой Гвардии, Бишкек");
        recyclerView.setAdapter(new AddressAdapter(address));

    }
}