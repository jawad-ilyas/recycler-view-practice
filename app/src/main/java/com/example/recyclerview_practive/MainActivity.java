package com.example.recyclerview_practive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_practive.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<User> users = new ArrayList<>();

        users.add( new User(R.drawable.baseline_person_24 , "kawad")  );
        users.add( new User(R.drawable.baseline_person_24 , "111")  );
        users.add( new User(R.drawable.baseline_person_24 , "222")  );
        users.add( new User(R.drawable.baseline_person_24 , "333")  );
        users.add( new User(R.drawable.baseline_person_24 , "555")  );
        users.add( new User(R.drawable.baseline_person_24 , "6666")  );


        RecyclerView recyclerView = binding.recyclerView;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MainAdapter adapter = new MainAdapter(this , users);

        recyclerView.setAdapter(adapter);
    }
}