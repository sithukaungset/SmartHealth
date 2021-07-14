package com.example.smarthealth.ui.information;

import android.animation.ValueAnimator;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.smarthealth.R;

public class ViewHolderQnA extends  RecyclerView.ViewHolder {

    TextView qna_title;
    TextView qna_script;
    LinearLayout linearLayout;

    OnViewHolderItemClickListener onViewHolderItemClickListener;

    public ViewHolderQnA(@NonNull View itemView){
        super(itemView);

        qna_title = itemView.findViewById(R.id.qna_title);
        qna_script = itemView.findViewById(R.id.qna_script);
        linearLayout = itemView.findViewById(R.id.linearlayout);

        linearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onViewHolderItemClickListener.onViewHolderItemClick();
            }
        });
    }

    public void onBind(DataQnA data, int position, SparseBooleanArray selectedItems){
        qna_title.setText(data.getTitle());
        qna_script.setText(data.getScript());
        changeVisibility(selectedItems.get(position));
    }

    private void changeVisibility(final boolean isExpanded){
        // ValueAnimator.ofInt(int... values)는 View가 변할 값을 지정, 인자는 int 배열
        ValueAnimator va = isExpanded ? ValueAnimator.ofInt(0, 600) : ValueAnimator.ofInt(600, 0);
        // Animation이 실행되는 시간, n/1000초
        va.setDuration(500);
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                // imageView의 높이 변경
                qna_script.getLayoutParams().height = (int) animation.getAnimatedValue();
                qna_script.requestLayout();
                // imageView가 실제로 사라지게하는 부분
                qna_script.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
            }
        });
        // Animation start
        va.start();
    }

    public void setOnViewHolderItemClickListener(OnViewHolderItemClickListener onViewHolderItemClickListener) {
        this.onViewHolderItemClickListener = onViewHolderItemClickListener;
    }
}

