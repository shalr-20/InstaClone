package com.tweak.instaclone.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tweak.instaclone.R;
import com.tweak.instaclone.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {
    TextView tv;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        tv = view.findViewById(R.id.nav_view);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DashboardFragment.class);
                startActivity(intent);
            }
        });


        return view;
    }
}

