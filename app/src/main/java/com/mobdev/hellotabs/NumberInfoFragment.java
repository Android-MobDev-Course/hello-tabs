package com.mobdev.hellotabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * Created by Marco Picone (picone.m@gmail.com) 12/03/2020
 * Simple Fragment to show the generated random number
 */
public  class NumberInfoFragment extends Fragment {

	private int randomNumber;

	public NumberInfoFragment(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.number_fragment, container, false);
		
		TextView numberTextView = (TextView)rootView.findViewById(R.id.numberTextView);
		numberTextView.setText(String.valueOf(randomNumber));
		
		return rootView;
	}
	
}