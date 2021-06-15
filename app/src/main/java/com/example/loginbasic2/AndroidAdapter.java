package com.example.loginbasic2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginbasic2.models.AndroidVersion;

import java.util.ArrayList;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<AndroidVersion> listAndroidVersion;

    public AndroidAdapter(Context mContext, ArrayList<AndroidVersion> listAndroidVersion) {
        this.mContext = mContext;
        this.listAndroidVersion = listAndroidVersion;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View androidView = inflater.inflate(R.layout.activity_android_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(androidView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AndroidVersion version = listAndroidVersion.get(position);
        //holder.vImage.setImageResource(version.getImage());
        holder.vName.setText(version.getName());
        holder.vNumber.setText(version.getVersion().toString());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //private ImageView vImage;
        private TextView vName;
        private TextView vNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //vImage = itemView.findViewById(R.id.iv_android);
            vName = itemView.findViewById(R.id.tv_androidname);
            vNumber = itemView.findViewById(R.id.tv_androidversion);
        }
    }


}