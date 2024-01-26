package com.fullana.tablayoutyviewpager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Clase Tab2 que extiende de Fragment
 * Representa el contenido del primer tab
 * @author Jorge Fullana Estela
 * @version 1.0.0
 * @see Fragment subclase.
 **/
public class Tab2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Tab2() {
        // Required empty public constructor
    }

    /**
     * Utiliza este método de fábrica para crear una nueva instancia de
     * este fragmento utilizando los parámetros proporcionados.
     *
     * @param param1 Parámetro 1.
     * @param param2 Parámetro 2.
     * @return Una nueva instancia del fragmento Tab1.
     */
    public static Tab2 newInstance(String param1, String param2) {
        Tab2 fragment = new Tab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    /**
     * Metodo void que se ejecutará cuando se cree el fragmento
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    /**
     *
     * @param inflater: El objeto LayoutInflater que se puede utilizar para inflar
     * cualquier vista en el fragmento.
     * @param container: Si no es nulo, este es el vista principal a la que el
     * UI del fragmento debería estar adjunto. El fragmento no debe añadir la vista
     * por sí mismo, pero esto se puede utilizar para generar los LayoutParams de la vista.
     * @param savedInstanceState: Si no es nulo, este fragmento se está reconstruyendo
     * a partir de un estado guardado previamente, como se indica aquí.
     *
     * @return View: Devuelve la vista que se va a mostrar en el fragmento.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }
}