package com.example.arief.ecommerceoleholeh.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arief.ecommerceoleholeh.R;
import com.example.arief.ecommerceoleholeh.adapter.RecListProductAdapter;

public class ListProductFragment extends Fragment {


    private RecyclerView recView;
    private RecListProductAdapter productAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_product_fragment , container ,false);
        recView = v.findViewById(R.id.rec_view);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recView.setHasFixedSize(true);


        RecyclerView.LayoutManager latMgr = new GridLayoutManager(getActivity(),2);
        recView.setLayoutManager(latMgr);


        productAdapter = new RecListProductAdapter();
        recView.setAdapter(productAdapter);
    }
}
