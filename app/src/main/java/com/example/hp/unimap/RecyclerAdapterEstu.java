package com.example.hp.unimap;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by hp on 19/04/2017.
 */

public class RecyclerAdapterEstu extends RecyclerView.Adapter<RecyclerAdapterEstu.ViewHolder> {


    private List<RecyclerItemEstu> listItems;
    private Context mContext;

    public RecyclerAdapterEstu(List<RecyclerItemEstu> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public RecyclerAdapterEstu.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_notification_estu, parent, false);
        return new RecyclerAdapterEstu.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapterEstu.ViewHolder holder, final int position) {

        final RecyclerItemEstu itemList = listItems.get(position);
        holder.txtTitle.setText(itemList.getTitle());
        holder.txtDescription.setText(itemList.getDescription());
        holder.txtOptionDigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                //Display option menu_admi
                PopupMenu popupMenu = new PopupMenu(mContext, holder.txtOptionDigit);
                popupMenu.inflate(R.menu.option_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.mnu_item_mostrar:
                                Context context = v.getContext();
                                Intent intent = new Intent(context, DetalleMensajeEstu.class);
                                context.startActivity(intent);
                                break;

                            case R.id.mnu_item_eliminar:
                                //Delete item
                                listItems.remove(position);
                                notifyItemRemoved(position);
                                notifyItemRangeChanged(position, listItems.size());
                                Toast.makeText(mContext, "Eliminado", Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle;
        public TextView txtDescription;
        public TextView txtOptionDigit;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            txtDescription = (TextView) itemView.findViewById(R.id.txtDescription);
            txtOptionDigit = (TextView) itemView.findViewById(R.id.txtOptionDigit);
        }
    }


}


