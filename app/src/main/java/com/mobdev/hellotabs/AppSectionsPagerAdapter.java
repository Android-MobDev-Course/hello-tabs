package com.mobdev.hellotabs;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.Random;

/**
 * A FragmentPagerAdapter that returns a fragment corresponding to the current page
 * of the ViewPager
 */
public class AppSectionsPagerAdapter extends FragmentPagerAdapter {

	public AppSectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/**
	 * Returns the Fragment associated to the element in position 'i'
	 */
	@Override
	public Fragment getItem(int i) {
		
		Random rand = new Random();
		
		switch (i) {
		case 0:
			return new NumberInfoFragment(rand.nextInt((1000) + 1));
		case 1:
			return new NumberInfoFragment(rand.nextInt((1000) + 1));
		default:
			return new NumberInfoFragment(rand.nextInt((1000) + 1));
		}
	}

	/**
	 * Returns the number of element in the ViewPager
	 */
	@Override
	public int getCount() {
		return 2;
	}

	/**
	 * Returns the title (as CharSequence) of the Page at position 'position'
	 */
	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return "Page 1";
		case 1:
			return "Page 2";
		default:
			return "No Title !";
		}
	}
}
