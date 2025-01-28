package com.example.interfaces1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view=inflater.inflate(R.layout.fragment_3, container, false);
        //Referencia al boton que realiza la accion
        Button buttonToNext=view.findViewById((R.id.btnF31));
        //Configurar la accion del boton
        buttonToNext.setOnClickListener(v -> {
            NavController navController= Navigation.findNavController(view);
            navController.navigate(R.id.action_fragment3_to_fragment2);
        });

        Button buttonToNext2=view.findViewById((R.id.btnF32));
        //Configurar la accion del boton
        buttonToNext2.setOnClickListener(v -> {
            NavController navController= Navigation.findNavController(view);
            navController.navigate(R.id.action_fragment3_to_fragment1);
        });

        // Inflate the layout for this fragment
        return view;
    }
}