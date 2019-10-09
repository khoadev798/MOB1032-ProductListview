package vn.com.productfinal;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Product> {
    private Context context;
    private int resource;
    private ArrayList<Product> arrProduct;

    final private  String TAG = getClass().getSimpleName();
    public CustomAdapter(Context context, int resource, ArrayList<Product> objects){
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrProduct = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.row_product,parent,false);
            viewHolder.iv_show = (ImageView) convertView.findViewById(R.id.imageView);
            viewHolder.tv_id =(TextView) convertView.findViewById(R.id.tv_id);
            viewHolder.tv_name =(TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tv_price =(TextView) convertView.findViewById(R.id.tv_price);
            convertView.setTag(viewHolder);
            Log.d(TAG, "getView"+(position+1));
        }
        else{
            viewHolder =(ViewHolder) convertView.getTag();
        }
        Product product = arrProduct.get(position);
        viewHolder.iv_show.setImageResource(product.getImgSrc());
        viewHolder.tv_id.setText((position+1)+"");
        viewHolder.tv_name.setText(product.getName());
        viewHolder.tv_price.setText((product.getPrice())+"");
        return convertView;
}
    public class ViewHolder{
        TextView tv_id;
        TextView tv_name;
        TextView tv_price;
        ImageView iv_show;
    }
}