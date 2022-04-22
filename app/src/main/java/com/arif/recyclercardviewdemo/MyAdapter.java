package com.arif.recyclercardviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {

    Context context;
    private int[] images;
    private String[] titles, desc;

    public MyAdapter(Context context, int[] images, String[] titles, String[] desc) {
        this.context = context;
        this.images = images;
        this.titles = titles;
        this.desc = desc;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout,viewGroup,false);


        return new  MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder myViewholder, int i) {
        myViewholder.imageView.setImageResource(images[i]);
        myViewholder.t1.setText(titles[i]);
        myViewholder.t2.setText(desc[i]);

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class MyViewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView t1, t2;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.myImageViewId);
            t1 = itemView.findViewById(R.id.titleTextViewId);
            t2 = itemView.findViewById(R.id.descriptionTextViewId);
        }
    }
}
