package com.mbtiholic.mobileprogramming_mbtiholic.PostItemList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mbtiholic.mobileprogramming_mbtiholic.R;
import com.mbtiholic.mobileprogramming_mbtiholic.domain.entity.Post;

import java.util.List;

public class PostItemListRecyclerViewAdapter extends RecyclerView.Adapter<PostItemListRecyclerViewAdapter.ItemViewHolder> {
    private List<Post> itemList;
    private OnItemClickListener onItemClickListener;

    public PostItemListRecyclerViewAdapter(List<Post> itemList){
        this.itemList = itemList;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item_list_each, parent, false),
                onItemClickListener
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.onBind(itemList.get(position),position);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView timeTextView;
        private TextView contentTextView;
        private TextView likeCountTextView;
        private TextView replyCountTextView;
        private int position;

        ItemViewHolder(View itemView, final OnItemClickListener onItemClickListener) {
            super(itemView);

            timeTextView = itemView.findViewById(R.id.timeTextView);
            contentTextView = itemView.findViewById(R.id.contentTextView);
           // likeCountTextView = itemView.findViewById(R.id.likeCountTextView);
           // replyCountTextView = itemView.findViewById(R.id.replyCountTextView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(view, position);
                }
            });
        }

        void onBind(Post post, int position) {
            this.position = position;

            // TODO timeTextView
            contentTextView.setText(post.getContent());
            // TODO likeCountTextView
            // TODO replyCountTextView
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
}