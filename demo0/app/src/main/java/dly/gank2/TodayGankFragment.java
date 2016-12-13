package dly.gank2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dly on 2016/12/12.
 */
public class TodayGankFragment extends Fragment {

    public static final String TAG = TodayGankFragment.class.getSimpleName();

    public static TodayGankFragment newInstance() {
        return new TodayGankFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_today, container, false);
        return rootView;
    }
}
