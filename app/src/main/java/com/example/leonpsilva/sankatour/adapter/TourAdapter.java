package com.example.leonpsilva.sankatour.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.leonpsilva.sankatour.R;
import com.example.leonpsilva.sankatour.modelos.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourAdapter extends ArrayAdapter<Tour> {

    private Context context;
    private List<Tour> tours;

    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
        this.tours = tours;
        this.context = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listaTour = convertView;

        if (listaTour == null) {
            listaTour = LayoutInflater.from(context).
                    inflate(R.layout.layout__tour, parent, false);
        }

        Tour tourAtual = tours.get(position);

        TextView textViewNome = listaTour.findViewById(R.id.textViewNomeTour);
        TextView textViewDesc = listaTour.findViewById(R.id.textViewDescTour);
        ImageView imageviewTour = listaTour.findViewById(R.id.imageViewTour);

        textViewNome.setText(tourAtual.getNome());
        textViewDesc.setText("Distância:" + tourAtual.getDescricao() + "KM");
        imageviewTour.setImageResource(tourAtual.getImagem());

        return listaTour;
    }

}




