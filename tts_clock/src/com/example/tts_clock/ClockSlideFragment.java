package com.example.tts_clock;

import com.example.android.animationsdemo.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class ClockSlideFragment extends Fragment {
	private int pagePosition ;
	
	public static final String ARG_POS = "position";
	
	public static ClockSlideFragment create(int position) {
		// Store state information, data, etc
		ClockSlideFragment fragment = new ClockSlideFragment();
		Bundle args = new Bundle();
		
		args.putInt(ARG_POS, position);
        fragment.setArguments(args);
		
		return fragment;
	}
	
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		// Unpack state information, data, etc
		super.onCreate(savedInstanceState);
        pagePosition = getArguments().getInt(ARG_POS);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		// Choose the correct layout here
		
		// Switch or if statement to choose the layout based on the position
		// Pos 1 - Stop
		// Pos 2 - Alarm/Clock
		// Pos 3 - Timer
		ViewGroup rootView ;
		
		switch(pagePosition) {
			/*
		// Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_screen_slide_page, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(
                getString(R.string.title_template_step, mPageNumber + 1));
			 */
			case 0:
				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_stopwatch_page, container, false);
			case 1:
				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_clock_page, container, false);
			case 2:
				rootView = (ViewGroup) inflater.inflate(R.layout.fragment_timer
						_page, container, false);
		}
	}
}
