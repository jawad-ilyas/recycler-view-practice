package com.example.recyclerview_practive;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_practive.databinding.SingleRowLayoutBinding;

import java.util.ArrayList;

public class MainAdapter  extends RecyclerView.Adapter<MainAdapter.ViewHolder>{



    ArrayList<User> users ;
    Context context;


    MainAdapter(Context context,  ArrayList<User> users)
    {
        this.context = context;
        this.users = users;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.binding.imageView.setImageResource(users.get(position).Image);
        holder.binding.name.setText(users.get(position).name);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        SingleRowLayoutBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding  = SingleRowLayoutBinding.bind(itemView);
        }
    }
}
