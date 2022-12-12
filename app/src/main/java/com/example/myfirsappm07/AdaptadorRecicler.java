package com.example.myfirsappm07;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class AdaptadorRecicler extends Adapter<AdaptadorRecicler.TitularesViewHolder>{
    private final Titular[] datos;
    Context context;

    public AdaptadorRecicler(Titular[] datos) {
        super();
        this.datos = datos;
    }

    public static final class TitularesViewHolder extends ViewHolder {

        private final TextView lblTitulo;
        private final TextView lblSubtitulo;
        private final View item;

        public TitularesViewHolder(View item) {
            super(item);
            this.item = item;
            this.lblTitulo = item.findViewById(R.id.lblTitulo);
            this.lblSubtitulo = item.findViewById(R.id.lblSubtitulo);
        }

        public TextView getLblTitulo() {
            return this.lblTitulo;
        }
        public TextView getLblSubtitulo() {
            return this.lblSubtitulo;
        }
        public View getItem() {return this.item;}

        public void bindTitular(Titular titular) {
            this.lblTitulo.setText(titular.getTitulo());
            this.lblSubtitulo.setText(titular.getSubtitulo());
        }
    }


    public AdaptadorRecicler.TitularesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout item = (LinearLayout) LayoutInflater.from
                (parent.getContext()).inflate(R.layout.visual_recicler, parent, false);;
        return (new AdaptadorRecicler.TitularesViewHolder((View) item));
    }

    @Override
    public void onBindViewHolder(TitularesViewHolder holder, int position) {
        Titular titular = datos[position];
        holder.bindTitular(titular);
    }

    public int getItemCount() {
        return this.datos.length;
    }
}
