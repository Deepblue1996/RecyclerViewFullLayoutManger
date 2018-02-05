package com.prohua.recyclerviewfulllayoutmanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.prohua.manger.FullyLinearLayoutManager;
import com.prohua.universal.DefaultAdapter;
import com.prohua.universal.DefaultViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringList.add(""+i+"");
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new FullyLinearLayoutManager(getBaseContext()));
        DefaultAdapter defaultAdapter = new DefaultAdapter(getBaseContext(), stringList, R.layout.recycler_item, 0 , 0);
        defaultAdapter.setOnBindItemView(new DefaultAdapter.OnBindItemView() {
            @Override
            public void onBindItemViewHolder(DefaultViewHolder defaultViewHolder, int i) {
                defaultViewHolder.setText(R.id.textId, stringList.get(i));
            }
        });
        recyclerView.setAdapter(defaultAdapter);
    }
}
