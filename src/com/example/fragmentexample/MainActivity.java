package com.example.fragmentexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		

	}
	public void selectFragment(View view){
		
		FragmentOne fr = new FragmentOne();
		FragmentManager fm = getFragmentManager();
		
		FragmentTransaction fragmentTransaction = fm.beginTransaction();
		
		 fragmentTransaction.add(R.layout.fragment_one, fr);
		
		 fragmentTransaction.commit();
	}

	// public void selectFrag(View view) {
	//
	// Fragment fr = null;
	//
	//
	//
	// if(view == findViewById(R.id.button2)) {
	//
	// fr = new FragmentTwo();
	//
	//
	//
	// }else {
	//
	// fr = new FragmentOne2();
	//
	// }
	//
	//
	//
	// FragmentManager fm = getFragmentManager();
	//
	// FragmentTransaction fragmentTransaction = fm.beginTransaction();
	//
	// fragmentTransaction.replace(R.id.fragment_place, fr);
	//
	// fragmentTransaction.commit();
	//
	//
	//
	// }
	public static class FragmentOne extends Fragment {

		 public FragmentOne() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			String[] array = { "hans", "rudi", "heino", "sven" };

			List<String> liste = new ArrayList<String>(Arrays.asList(array));

			View rootview = inflater.inflate(R.layout.fragment_one, container,
					false);
			ListView listview = (ListView) rootview.findViewById(R.id.listView1);
			ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
					android.R.layout.simple_list_item_1, liste);
			listview.setAdapter(adapter);

			return rootview;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
