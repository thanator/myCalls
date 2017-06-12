package ru.sberbank.learning.callsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Тичер on 10.06.2017.
 */
public class CallViewHolder extends RecyclerView.ViewHolder {

    private TextView mNumber,mDuration, mDate;
    private ImageView mImageView;
    private Context mContext;

    public CallViewHolder(View itemView) {
        super(itemView);
        mContext = itemView.getContext();
        mNumber = (TextView) itemView.findViewById(R.id.number_text_view);
        mDuration = (TextView) itemView.findViewById(R.id.duration_text_view);
        mDate = (TextView) itemView.findViewById(R.id.date_text_view);
        mImageView = (ImageView) itemView.findViewById(R.id.img_caller);
    }

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    public void bindView(Call call) {

        mNumber.setText(call.number);
        mDuration.setText(String.valueOf(call.duration) + "c.");
        Date date = new Date(call.date);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(mContext);
        mDate.setText(dateFormat.format(date));
        if (call.duration == 0){
            mImageView.setImageResource(R.drawable.ic_not_check_black_24dp);
            mImageView.setBackgroundResource(R.drawable.nope_bg_drawable);
        } else{
            mImageView.setImageResource(R.drawable.ic_check_black_24dp);
            mImageView.setBackgroundResource(R.drawable.yep_bg_drawable);
        }


    }
}
