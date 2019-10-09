package vn.com.productfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvProduct;
    private ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProduct = (ListView) findViewById(R.id.lv_product);

        ArrayList<Product> arrayList = new ArrayList<>();
        Product product1 = new Product("Product 1", 3000, R.mipmap.ic_chrome);
        Product product2 = new Product("Product 2", 5000,  R.mipmap.ic_twitter);

        arrayList.add(product1);
        arrayList.add(product2);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_product,arrayList);
        lvProduct.setAdapter(customAdapter);
    }
}
