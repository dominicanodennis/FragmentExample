package com.example.fragmentexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentOne2 extends Fragment {

	ListView listview;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		String[] array = { "hans", "rudi", "heino", "sven" };
		listview = (ListView) getView().findViewById(R.id.listView1);

		List<String> liste = new ArrayList<String>(Arrays.asList(array));

		ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
				R.layout.single_list,R.id.txt_wifi_provider, liste);
		listview.setAdapter(adapter);

		return inflater.inflate(R.layout.fragment_one, container, false);

	}

}
