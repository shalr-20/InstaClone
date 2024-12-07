package com.tweak.instaclone;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.tweak.instaclone.databinding.ActivityMainBinding;
import com.tweak.instaclone.ui.dashboard.DashboardFragment;
import com.tweak.instaclone.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView cameraToolbar = toolbar.findViewById(R.id.camera);
        cameraToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Camera is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        navView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                if (menuItem.getItemId() == R.id.navigation_home) {
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.nav_host_fragment, homeFragment); // Correct ID
                    transaction.commit();
                } else if (menuItem.getItemId() == R.id.navigation_dashboard) {
                    Toast.makeText(MainActivity.this, "Search Fragment coming soon", Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.navigation_create) {
                    Toast.makeText(MainActivity.this, "Create Fragment coming soon", Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.navigation_reels) {
                    Toast.makeText(MainActivity.this, "Reels Fragment coming soon", Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.navigation_profile) {
                    Toast.makeText(MainActivity.this, "Profile Fragment coming soon", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}
