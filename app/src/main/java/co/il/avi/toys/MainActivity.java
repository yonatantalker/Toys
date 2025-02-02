package co.il.avi.toys;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvToys;
    private Toys toys;
    private ToysAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initializeViews();
        getAllToys();
        setRecyclerView();
    }

    private void initializeViews() {
        rvToys = findViewById(R.id.rvToys);
    }

    private void getAllToys() {
        toys = new Toys();
        toys.add(new Toy("Car", 50));
        toys.add(new Toy("Doll", 100));
        toys.add(new Toy("Robot", 150));
        toys.add(new Toy("Monopoly", 75));
        toys.add(new Toy("Taki", 80));
    }

    private void setRecyclerView() {
        adapter = new ToysAdapter(this, toys, R.layout.toy_single_layout);
        rvToys.setLayoutManager(adapter);
        rvToys.setAdapter(new LinearLayoutManager(this));
    }
}
