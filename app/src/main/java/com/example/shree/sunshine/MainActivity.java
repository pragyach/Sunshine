package com.example.shree.sunshine;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new  PlaceholderFragment()).commit();
        }
    }
    @Override
       public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                       getMenuInflater().inflate(R.menu.main, menu);
               return true;
           }
    public static class  PlaceholderFragment extends Fragment {
        private ArrayAdapter<String>mForecastAdapter;
        public PlaceholderFragment(){}

        @Override
        public String toString() {
            return super.toString();
        }



        @Override
      public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState)
        {
            View rootView = inflater.inflate(R.layout.fragment_main, container);





        String[] forecastArray ={
                "Today-Sunny-88/63",
                "Tomorrow-Foggy-70/63",
                "Weds-Cloudy-72/63",
                "Thursday-Asteriods-75/65",
                "Friday-HeavyRain-65/56",
                "Saturday-Help trapped in weatherStation-60/51",
                "Sunday-Sunny-80/68"

        };
        List<String> weekForecast = new ArrayList<String>
                (
                        Arrays.asList(forecastArray));
        mForecastAdapter= new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
            View rootview;
            return rootView;
    }






    }
}
