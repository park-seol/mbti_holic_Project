package com.example.mobileprogramming_mbtiholic;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class RelationshipTabFragment extends Fragment {
    Button btn_M_P;
    Spinner spinner1, spinner2;

    public RelationshipTabFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_relationship_tab, container, false); // 전체 뷰를 가져옴
        // 홈메뉴에서 istj버튼 클릭시 istj뷰를 나오게 하기 위해
        spinner1 = (Spinner) view.findViewById(R.id.spinner_mbti1);
        spinner2 = (Spinner) view.findViewById(R.id.spinner_mbti1);

        btn_M_P = view.findViewById(R.id.btn_m_p); // 홈메뉴에서 istj버튼 클릭시 istj뷰를 나오게 하기 위해
        btn_M_P.setOnClickListener(new View.OnClickListener() { // 홈메뉴에서 istj버튼 클릭시
            @Override
            public void onClick(View view) {
                String str_mbti1 = spinner1.getSelectedItem().toString();
                String str_mbti2 = spinner2.getSelectedItem().toString();
                int relationResult=0;

                //if문 작성
                //궁합 0퍼센트인 애들 오른쪽귀퉁이 위부터 아래로
                if ((str_mbti1.equals("ISFP") && str_mbti2.equals("INFP")) || (str_mbti1.equals("ESFP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ISFJ")&&str_mbti2.equals("INFP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ISTJ"))|(str_mbti1.equals("ENFP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ISTJ")) ||(str_mbti1.equals("INFP") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ESTJ")))
                        relationResult=1;
                //궁합 25퍼센트인 애들 -노랑
               else if((str_mbti1.equals("ISFJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("intp"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ISFP")) ||(str_mbti1.equals("ISFP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("esfp")) ||(str_mbti1.equals("ISFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ISFJ")) ||(str_mbti1.equals("INTJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ESTJ")))
                        relationResult=2;

                //궁합 50퍼센트인 애들-연두색      우선 네모 2개부터
                else if((str_mbti1.equals("INTJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("INTP")&&str_mbti2.equals("ESTP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ENTP"))|| (str_mbti1.equals("ISTP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ENTP")) ||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ENTJ")) ||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ESTJ")) ||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ISFP"))|| (str_mbti1.equals("ISTJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ESFP")) ||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ISTP"))|| (str_mbti1.equals("ISTJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ESTP"))|| (str_mbti1.equals("ESTJ") && str_mbti2.equals("ESTP")) ||(str_mbti1.equals("ISFP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ESTJ")))
                        relationResult=3;

                 //75퍼센트 궁합률 초록색 부분 왼쪽 파랑 제외한 귀퉁이 부분
                 else if((str_mbti1.equals("INFP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("INFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("INFJ")) ||(str_mbti1.equals("ENFP") && str_mbti2.equals("ENFJ")) ||(str_mbti1.equals("INFJ") && str_mbti2.equals("ENFJ")) ||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ENFJ")) ||(str_mbti1.equals("INFP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ENTJ")) ||(str_mbti1.equals("INFP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ISFJ")) ||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ESFJ")) ||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ESTJ")))
                      relationResult=4;

                //궁합률 100퍼센트 파랑이들
                else if((str_mbti1.equals("ENFJ") && str_mbti2.equals("INFP"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("INFP")) ||(str_mbti1.equals("INFJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ENFP"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("INFJ"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ENFP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("ENTP") && str_mbti2.equals("INTJ"))||(str_mbti1.equals("INFP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ENTJ"))||(str_mbti1.equals("ENTJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INFJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("INTJ") && str_mbti2.equals("ENTP"))||(str_mbti1.equals("ENFJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("INTP"))||(str_mbti1.equals("INTP") && str_mbti2.equals("ESTJ")) ||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ISFP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ENFJ"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ESFP")) ||(str_mbti1.equals("ESFJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ESTJ") && str_mbti2.equals("ISTP"))||(str_mbti1.equals("ISFJ") && str_mbti2.equals("ESTP"))||(str_mbti1.equals("ISTJ") && str_mbti2.equals("ESFP"))||(str_mbti1.equals("ESFP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ISFJ"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ESFJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ESFJ")) ||(str_mbti1.equals("ESFP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ESTP") && str_mbti2.equals("ISTJ"))||(str_mbti1.equals("ISFP") && str_mbti2.equals("ESTJ"))||(str_mbti1.equals("ISTP") && str_mbti2.equals("ESTJ")))
                    relationResult=5;




                Intent intent = new Intent(getActivity(), RelationshipActivity.class); // 액티비티 띄우기 전에 만드는 intent
                intent.putExtra("relationResult",relationResult);

            startActivity(intent);}

    });
        return view;
}
}
