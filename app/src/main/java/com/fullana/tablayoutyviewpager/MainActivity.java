package com.fullana.tablayoutyviewpager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

/**
 * @author Jorge Fullana Estela
 * @version 1.0.0
 * @see AppCompatActivity subclase.
 * @see TabLayout subclase. se utiliza para crear los tabs
 * @see FragmentContainerView subclase. se utiliza para crear el contenedor de los fragments
 * @see FragmentManager subclase. se utiliza para gestionar los fragments
 * @see com.google.android.material.tabs.TabLayout.OnTabSelectedListener subclase. se utiliza para animar los tabs
 */
public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FragmentContainerView containerView;
    FragmentManager fragmentManager;

    /**
     * Metodo que se ejecuta al crear la actividad
     * @param savedInstanceState estado de la instancia
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Inicializacion de los componentes de la vista
     * y la logica de los tabs
     * @param savedInstanceState estado de la instancia
     *
     */
     @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        tabLayout = findViewById(R.id.tabLayout);
        containerView = findViewById(R.id.fragmentContainerView);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, new Tab1())
                .commit();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment;
                switch (tab.getText().toString()) {
                    case "Tab1" -> fragment = new Tab1();
                    case "Tab2" -> fragment = new Tab2();
                    default -> fragment = new Tab3();
                }
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, fragment)
                        .commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}