package com.mbtiholic.mobileprogramming_mbtiholic.PostItemInfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.mbtiholic.mobileprogramming_mbtiholic.R;
import com.mbtiholic.mobileprogramming_mbtiholic.domain.entity.Post;
import com.mbtiholic.mobileprogramming_mbtiholic.domain.entity.Reply;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.LinkedList;
import java.util.List;

public class PostItemInfoActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, PostItemInfoRecyclerViewAdapter.OnPostLikeClickListener, PostItemInfoRecyclerViewAdapter.OnReplyLikeClickListener, PostItemInfoRecyclerViewAdapter.OnReplyMenuClickListener {
    // views
    private SwipeRefreshLayout swipeRefreshLayout;

    private PostItemInfoRecyclerViewAdapter recyclerViewAdapter;
    private Post post = null;
    private List<Reply> replyList = new LinkedList<>();

    public final static String EXTRA_POST_BUNDLE_ID = "POST_BUNDLE_ID";
    private String postBundleId;
    public final static String EXTRA_POST_ID = "POST_ID";
    private String postId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_item_list);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //액션바 배경색 변경
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFFDFC8F8));
        //홈버튼 표시
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //뒤로가기 버튼
        getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setTitle(EXTRA_POST_ID);

        postBundleId = getIntent().getStringExtra(EXTRA_POST_BUNDLE_ID);
        postId = getIntent().getStringExtra(EXTRA_POST_ID);

        if(postBundleId == null || postBundleId.isEmpty() || postId == null || postId.isEmpty()) {
            Toast.makeText(this, "게시판 이름이 필요합니다.(EXTRA_POST_NAME)", Toast.LENGTH_LONG).show();
            finish();
            return;
        }
        setTitle("게시글");

        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this); // 이 두줄 무조건 쓰고 넘어가야 됨(복붙해서 사용)
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewAdapter = new PostItemInfoRecyclerViewAdapter(replyList); // 리사이클러뷰의 핵심. 어댑터를 잘 짜는게 핵심이다.......
        recyclerView.setAdapter(recyclerViewAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        recyclerViewAdapter.setOnPostLikeClickListener(this);
        recyclerViewAdapter.setOnReplyLikeClickListener(this);
        recyclerViewAdapter.setOnReplyMenuClickListener(this);

        onRefresh();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, R.anim.slide_out_right);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: { //toolbar의 back키 눌렀을 때 동작
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRefresh() {
        DatabaseReference postsRef = FirebaseDatabase.getInstance().getReference("postBundles").child(postBundleId).child("posts").child(postId);
        postsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                post = dataSnapshot.getValue(Post.class);
                post.setId(dataSnapshot.getKey());
                recyclerViewAdapter.setPost(post);
                if(recyclerViewAdapter != null) {
                    recyclerViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //replyList.add(new Reply()); 댓글 더미데이터 출력 주석처리
        //replyList.add(new Reply());
        //replyList.add(new Reply());

        recyclerViewAdapter.notifyDataSetChanged();
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onPostLikeClick(View view) {
        // TODO
        Toast.makeText(this, "post like", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onReplyLikeClick(View view, int position) {
        // TODO
        Toast.makeText(this, "reply like", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onReplyMenuClick(View view, int position) {
        // TODO
        Toast.makeText(this, "reply menu", Toast.LENGTH_SHORT).show();
    }
}
