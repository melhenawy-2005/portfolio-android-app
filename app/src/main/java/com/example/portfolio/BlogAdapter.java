
package com.example.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.BlogViewHolder> {

    private ArrayList<String> titles;
    private ArrayList<String> descriptions;

    public BlogAdapter(ArrayList<String> titles, ArrayList<String> descriptions) {
        this.titles = titles;
        this.descriptions = descriptions;
    }

    @NonNull
    @Override
    public BlogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_blog, parent, false);

        return new BlogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlogViewHolder holder, int position) {
        holder.tvArticleTitle.setText(titles.get(position));
        holder.tvArticleDescription.setText(descriptions.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder {

        TextView tvArticleTitle, tvArticleDescription;

        public BlogViewHolder(@NonNull View itemView) {
            super(itemView);

            tvArticleTitle = itemView.findViewById(R.id.tvArticleTitle);
            tvArticleDescription = itemView.findViewById(R.id.tvArticleDescription);
        }
    }
}
