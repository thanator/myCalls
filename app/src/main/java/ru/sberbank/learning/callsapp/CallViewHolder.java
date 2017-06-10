package ru.sberbank.learning.callsapp;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Тичер on 10.06.2017.
 */
public class CallViewHolder extends RecyclerView.ViewHolder {

    private TextView mNumber,mDuration, mDate;
    private ImageView mImageView;

    public CallViewHolder(View itemView) {
        super(itemView);
        mNumber = (TextView) itemView.findViewById(R.id.number_text_view);
        mDuration = (TextView) itemView.findViewById(R.id.duration_text_view);
        mDate = (TextView) itemView.findViewById(R.id.date_text_view);
        mImageView = (ImageView) itemView.findViewById(R.id.img_caller);
    }

    @SuppressLint("ResourceAsColor")
    public void bindView(Call call) {

        mNumber.setText(call.number);
        mDuration.setText(String.valueOf(call.duration));
        mDate.setText(String.valueOf(call.date));
        if (call.duration == 0){
            mImageView.setImageResource(R.drawable.ic_not_check_black_24dp);
            mImageView.setBackgroundColor(R.color.notAnswered);
        } else{
            mImageView.setImageResource(R.drawable.ic_check_black_24dp);
            mImageView.setBackgroundColor(R.color.Answered);
        }


    }
}
