package com.example.mobileprogramming_mbtiholic;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mobileprogramming_mbtiholic.PostItemList.PostItemListActivity;
import com.example.mobileprogramming_mbtiholic.PostPage.Data;
import com.example.mobileprogramming_mbtiholic.PostPage.Post_ENFJ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PostTabFragment extends Fragment { //덤인데이터
    private PostsRecyclerViewAdapter adapter;
    GestureDetector gestureDetector;
    private ArrayList<Data> listData = new ArrayList<>(); // 변수는 맘대로 하면 됨
    public PostTabFragment() {
        // Required empty public constructor
    }


    public void onAttach(Context context) {
        super.onAttach(context);
        getData(); //방금 만든 함수 호출
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_feed, container, false); // 전체 뷰를 가져옴
        //여기에 recyclerView로 뭐가 뜰건지 다 셋팅 해줘야함
//        if(adapter== null) {
            RecyclerView recyclerView = view.findViewById(R.id.recyclerView); //리사이클러뷰 선어

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity()); // 이 두줄 무조건 쓰고 넘어가야 됨(복붙해서 사용)
            recyclerView.setLayoutManager(linearLayoutManager);

            adapter = new PostsRecyclerViewAdapter(listData); // 리사이클러뷰의 핵심. 어댑터를 잘 짜는게 핵심이다.......
            recyclerView.setAdapter(adapter); // 이 어댑터 써! 하고 셋팅하는 것
            adapter.setOnItemClickListener(new PostsRecyclerViewAdapter.OnItemClickListener() { // 화면이동
                @Override
                public void onClick(View view, int position) { // 한칸 클릭했을때
                    Intent intent = new Intent(getActivity(), PostItemListActivity.class); // 액티비티 띄우기 전에 만드는 intent
                    // intent.putExtra(키 번호,  ) // 다음 activity에서 내가 어디서 온건지도 알아야함
                    // intent.putExtra("user", listData.get(position));
                    // TODO 어떤 게시판인지 putExtra로 전달해야 합니다.
                    startActivity(intent);
                }

            });
            adapter.setOnItemPinClickListener(new PostsRecyclerViewAdapter.OnItemPinClickListener() {
                @Override
                public void onClick(View view, int position) { // 그 핀 클릭했을 때

                }
            });
            adapter.notifyDataSetChanged(); // 나지금 리스트 추가 아님 삭제 했어!! 알려줌. 그럼 리사이클러뷰가 다시 계산함.......

//        }
        return view;
        }
    private void getData() {
        // 임의의 데이터입니다.
        List<String> listTitle = Arrays.asList("내가 쓴 글", "댓글 단 글", "자유게시판", "ENFJ 게시판", "ENFP 게시판", "ENTJ 게시판", "ENTP 게시판",
                "ESTJ 게시판", "ESTP 게시판", "INFJ 게시판", "INFP 게시판", "INTJ 게시판", "INTP 게시판", "ISFJ 게시판", "ISFP 게시판", "ISTJ 게시판"
        , "ISTP 게시판");
        List<String> listContent = Arrays.asList(
                "내가 쓴 글",
                "댓글 단 글",
                "자유게시판",
                "ENFJ 게시판",
                "ENFP 게시판",
                "ENTJ 게시판",
                "ENTP 게시판",
                "ESTJ 게시판",
                "ESTP 게시판",
                "INFJ 게시판",
                "INFP 게시판",
                "INTJ 게시판",
                "INTP 게시판",
                "ISFJ 게시판",
                "ISFP 게시판",
                "ISTJ 게시판",
                "ISTP 게시판"
        );
        List<Integer> listResId = Arrays.asList(
                R.drawable.feed_star
        );
        for (int i = 0; i < listTitle.size(); i++) {
            // 각 List의 값들을 data 객체에 set 해줍니다.
            Data data = new Data();
            data.setTitle(listTitle.get(i));
            data.setContent(listContent.get(i));
            data.setResId(listResId.get(0)); // 이걸 i가 아닌 0으로 해주면 서로 숫자 안맞아도.. 데이터 출력 가능...

            // 각 값이 들어간 data를 adapter에 추가합니다.
            listData.add(data);
        }

    }


}
