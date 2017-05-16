package yazdaniscodelab.recyclerview_with_clickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title;
    TextView description;
    TextView author;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView=(ImageView)findViewById(R.id.image_xml);
        title=(TextView)findViewById(R.id.title_xml);
        description=(TextView)findViewById(R.id.description_xml);
        author=(TextView)findViewById(R.id.author_xml);
        price=(TextView)findViewById(R.id.price_xml);

        String mtitle="its test";

        Bundle b=getIntent().getExtras();

        imageView.setImageResource(b.getInt("image_id"));
        title.setText(b.getString("tittle_id"));
        description.setText(b.getString("description_id"));
        author.setText(b.getString("author_id"));
        price.setText(b.getString("price_id"));

    }
}
