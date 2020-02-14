package com.project.goodreadsclone.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager2.widget.ViewPager2;

import com.project.goodreadsclone.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
//
//public class CollectionDemoFragment extends Fragment {
//    // When requested, this adapter returns a DemoObjectFragment,
//    // representing an object in the collection.
//    DemoCollectionAdapter demoCollectionAdapter;
//    ViewPager2 viewPager;
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_home, container, false);
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        demoCollectionAdapter = new DemoCollectionAdapter(this);
//        viewPager = view.findViewById(R.id.pager);
//        viewPager.setAdapter(demoCollectionAdapter);
//    }
//}
//
//public class DemoCollectionAdapter extends FragmentStateAdapter {
//    public DemoCollectionAdapter(Fragment fragment) {
//        super(fragment);
//    }
//
//    @NonNull
//    @Override
//    public Fragment createFragment(int position) {
//        // Return a NEW fragment instance in createFragment(int)
//        Fragment fragment = new DemoObjectFragment();
//        Bundle args = new Bundle();
//        // Our object is just an integer :-P
//        args.putInt(DemoObjectFragment.ARG_OBJECT, position + 1);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public int getItemCount() {
//        return 100;
//    }
//}
//
//// Instances of this class are fragments representing a single
//// object in our collection.
//public class DemoObjectFragment extends Fragment {
//    public static final String ARG_OBJECT = "object";
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_collection_object, container, false);
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        Bundle args = getArguments();
//        ((TextView) view.findViewById(android.R.id.text1))
//                .setText(Integer.toString(args.getInt(ARG_OBJECT)));
//    }
//}
