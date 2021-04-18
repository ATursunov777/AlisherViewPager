package kg.itrun.pagerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class CountryAdapter extends PagerAdapter {
    private ArrayList<CountRu>data;
    private Context context;

    public CountryAdapter(ArrayList<CountRu> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override


    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return data.get(position).country;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup)inflater.inflate(R.layout.item_country,container,false);
        CountRu countryObject = data.get(position);

        ImageView flag = layout.findViewById(R.id.flag);
        TextView countryText = layout.findViewById(R.id.country);
        TextView capitalText = layout.findViewById(R.id.capital);
        TextView discriptionText = layout.findViewById(R.id.discription);

        flag.setImageResource(countryObject.countryId);
        countryText.setText(countryObject.country);
        capitalText.setText(countryObject.capital);
        discriptionText.setText(countryObject.description);

        container.addView(layout);

        return layout;
    }
}

