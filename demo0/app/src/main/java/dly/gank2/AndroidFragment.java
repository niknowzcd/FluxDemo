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
public class AndroidFragment extends Fragment {

    public static final String TAG = AndroidFragment.class.getSimpleName();

    public static AndroidFragment newInstance() {
        return new AndroidFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_android, container, false);
        return rootView;
    }
}
