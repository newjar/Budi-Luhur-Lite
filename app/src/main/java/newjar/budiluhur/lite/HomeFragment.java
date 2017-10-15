package newjar.budiluhur.lite;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by nfajar on 15/10/17.
 */

public class HomeFragment extends Fragment {

    private Button BtnJadwal;
    private Button BtnStudent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);

            BtnJadwal = (Button) view.findViewById(R.id.BtnJadwal);
            BtnJadwal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Fragment fragment = new JadwalFragment();
                    FragmentTransaction tr = getFragmentManager().beginTransaction();
                    tr.replace(R.id.frame, fragment);
                    tr.commit();
                }
            });

        BtnStudent = (Button) view.findViewById(R.id.BtnStudent);
        BtnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new StudentFragment();
                FragmentTransaction tr = getFragmentManager().beginTransaction();
                tr.replace(R.id.frame, fragment);
                tr.commit();
            }
        });

        return view;
    }
}