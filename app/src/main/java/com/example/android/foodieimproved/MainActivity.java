package com.example.android.foodieimproved;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	ItemAdapter adapter;
	static List<String> items = new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		adapter = new ItemAdapter();
		RecyclerView recyclerView = findViewById(R.id.recyclerview);
		recyclerView.setAdapter(adapter);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}

	public void addItem(View view) {
		items.add(((EditText) findViewById(R.id.editText_food_item_name)).getText().toString());
		adapter.notifyDataSetChanged();
	}

	public void displayList(View view) {
		Intent intent = new Intent(this, ItemAdapter.class);
	}
}