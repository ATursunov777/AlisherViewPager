package kg.itrun.pagerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String usaText = "The United States of America (USA), commonly known as the United States (U.S. or US) or America, is a country primarily located in North America. It consists of 50 states, a federal district, five major self-governing territories, 326 Indian reservations, and some minor possessions.[h] At 3.8 million square miles (9.8 million square kilometers), it is the world's third- or fourth-largest country by total area.[d] With a population of more than 330 million people, it is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city is New York City.";

        String ruText = "Russia (Russian: Россия, Rossiya, Russian pronunciation:  or the Russian Federation,[c] is a transcontinental country spanning Eastern Europe and Northern Asia. It covers over 17,125,191 square kilometres (6,612,073 sq mi), consists of more than one-eighth of the Earth's inhabited land area, extends to eleven time zones, and has borders with sixteen sovereign nations. Moscow is the country's capital and largest city, while Saint Petersburg is the second-largest city. The Russians are the largest Slavic and European nation, and Russian is the most spoken Slavic language; as well as the most spoken native language in Europe.";

        String kgText = "Kyrgyzstan's history spans a variety of cultures and empires. Although geographically isolated by its highly mountainous terrain, Kyrgyzstan has been at the crossroads of several great civilizations as part of the Silk Road and other commercial routes. Inhabited by a succession of tribes and clans, Kyrgyzstan has periodically fallen under larger domination. Between periods of self-government it was ruled by Göktürks, the Uyghur Empire and the Khitan people, before being conquered by the Mongols in the 13th century; it regained independence but was invaded by Kalmyks, Manchus and Uzbeks. In 1876, it became part of the Russian Empire, remaining in the USSR as the Kirghiz Soviet Socialist Republic after the Russian Revolution. Following Mikhail Gorbachev's democratic reforms in the USSR, in 1990 pro-independence candidate Askar Akayev was elected president. On 31 August 1991, Kyrgyzstan declared independence from Moscow and a democratic government was established. Kyrgyzstan attained sovereignty as a nation state after the breakup of the Soviet Union in 1991.";

        String caText = "Canada is a country in the northern part of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area. Its southern and western border with the United States, stretching 8,891 kilometres (5,525 mi), is the world's longest bi-national land border. Canada's capital is Ottawa, and its three largest metropolitan areas are Toronto, Montreal, and Vancouver.";

        ArrayList<CountRu> myList = new ArrayList();
        myList.add(new CountRu("Usa","DC",usaText,R.drawable.usa));
        myList.add(new CountRu("Russia","Moskva",ruText,R.drawable.ru));
        myList.add(new CountRu("Canada","Ottawa",caText,R.drawable.can));
        myList.add(new CountRu("Kyrgizstan","Bishkek",kgText,R.drawable.kg));

        ViewPager viewPager = findViewById(R.id.pager);
        CountryAdapter adapter = new CountryAdapter(myList,this);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}