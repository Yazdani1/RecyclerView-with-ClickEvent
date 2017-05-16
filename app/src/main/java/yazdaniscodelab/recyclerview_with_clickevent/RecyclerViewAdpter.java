package yazdaniscodelab.recyclerview_with_clickevent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yazdani on 5/16/2017.
 */

public class RecyclerViewAdpter extends RecyclerView.Adapter<RecyclerViewAdpter.MyRecyclerView> {

    private ArrayList<Data>arrayList=new ArrayList<Data>();

    Context ct;

    public RecyclerViewAdpter(ArrayList<Data>arrayList,Context ct){

        this.arrayList=arrayList;
        this.ct=ct;

    }


    @Override
    public MyRecyclerView onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyRecyclerView myRecyclerView=new MyRecyclerView(myview,ct,arrayList);
        return myRecyclerView;
    }

    @Override
    public void onBindViewHolder(MyRecyclerView holder, int position) {

        Data data=arrayList.get(position);

        holder.imageView.setImageResource(data.getImg_res());
        holder.title.setText(data.getTitle());
        holder.description.setText(data.getDescription());
        holder.author.setText(data.getAuthor());
        holder.price.setText(data.getPrice());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyRecyclerView extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView title;
        TextView description;
        TextView author;
        TextView price;

        private ArrayList<Data>arrayList=new ArrayList<Data>();
        Context ct;

        public MyRecyclerView(View view,Context ct,ArrayList<Data>arrayList){
            super(view);
            this.arrayList=arrayList;
            this.ct=ct;
            view.setOnClickListener(this);
            imageView=(ImageView)view.findViewById(R.id.image_xml);
            title=(TextView)view.findViewById(R.id.title_xml);
            description=(TextView)view.findViewById(R.id.description_xml);
            author=(TextView)view.findViewById(R.id.author_xml);
            price=(TextView)view.findViewById(R.id.price_xml);
        }

        @Override
        public void onClick(View view) {

            int position=getAdapterPosition();
            Data data=this.arrayList.get(position);
            Intent intent=new Intent(this.ct,DetailsActivity.class);
            Bundle b=new Bundle();
            b.putInt("image_id",data.getImg_res());
            b.putString("tittle_id",data.getTitle());
            b.putString("description_id",data.getDescription());
            b.putString("author_id",data.getAuthor());
            b.putString("price_id",data.getPrice());
            intent.putExtras(b);
            this.ct.startActivity(intent);
        }
    }



}
