package ru.sberbank.learning.callsapp;

import android.content.pm.LabeledIntent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tan-DS on 6/10/2017.
 */

public class CallsRecyclerAdapter extends RecyclerView.Adapter<CallViewHolder> {

    private List<Call> mCalls;

    public CallsRecyclerAdapter(){
        this.mCalls = new ArrayList<>();
    }

    @Override
    public CallViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_elem, parent, false);
        return new CallViewHolder(view);
    }


    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public void onBindViewHolder(CallViewHolder holder, int position) {
        holder.bindView(mCalls.get(position));
    }

    @Override
    public int getItemCount() {
        return mCalls.size();
    }

    public void remakeCalls(List<Call> calls){
        mCalls.clear();
        mCalls.addAll(calls);
        notifyDataSetChanged();
    }
}
