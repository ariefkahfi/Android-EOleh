package com.example.arief.ecommerceoleholeh.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.arief.ecommerceoleholeh.R;
import com.example.arief.ecommerceoleholeh.model.CardProduct;

import java.util.List;

public class RecListProductAdapter extends RecyclerView.Adapter<RecListProductAdapter.RecListProductViewHolder> {


    private CardProduct[] cardProducts = new CardProduct[]{
            new CardProduct(R.mipmap.oleh1 , "Pempek",2500),
            new CardProduct(R.mipmap.oleh2 , "Kue", 5000),
            new CardProduct(R.mipmap.oleh3 , "Baju" , 25000),
            new CardProduct(R.mipmap.oleh4 , "Kain Songket", 50000)
    };


    @NonNull
    @Override
    public RecListProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout , parent , false);
        return new RecListProductViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecListProductViewHolder holder, int position) {
        CardProduct currentCardProduct = cardProducts[position];


        holder.iProductImage.setImageResource(currentCardProduct.getProductImage());
        holder.tProductName.setText(currentCardProduct.getProductName());
        holder.tProductPrice.setText(String.valueOf(currentCardProduct.getProductPrice()));

    }

    @Override
    public int getItemCount() {
        return cardProducts.length;
    }

    class RecListProductViewHolder extends RecyclerView.ViewHolder {

        TextView tProductName,tProductPrice;
        ImageView iProductImage;
        ImageButton iBuyProduct;


        RecListProductViewHolder(View itemView) {
            super(itemView);
            tProductName = itemView.findViewById(R.id.t_product_name);
            tProductPrice = itemView.findViewById(R.id.t_product_price);
            iProductImage = itemView.findViewById(R.id.i_product_image);
            iBuyProduct = itemView.findViewById(R.id.i_buy_product);
        }
    }
}
