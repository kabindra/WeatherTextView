package com.threecallistos.weathertextview.sample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.threecallistos.weathertextview.sample.R;
import com.threecallistos.weathertextview.widget.WeatherTextView;

public class WeatherListAdapter extends BaseAdapter {
    private final Context mContext;
    private final int[] mWeather;

    private int[] yahooWeather = {
            R.string.wi_tornado,
            R.string.wi_day_sleet_storm,
            R.string.wi_hurricane,
            R.string.wi_day_thunderstorm,
            R.string.wi_thunderstorm,
            R.string.wi_rain_mix,
            R.string.wi_day_sleet_storm,
            R.string.wi_day_sleet,
            R.string.wi_snowflake_cold,
            R.string.wi_snowflake_cold,
            R.string.wi_day_rain_wind,
            R.string.wi_showers,
            R.string.wi_showers,
            R.string.wi_snowflake_cold,
            R.string.wi_day_snow,
            R.string.wi_snow_wind,
            R.string.wi_snow,
            R.string.wi_hail,
            R.string.wi_sleet,
            R.string.wi_dust,
            R.string.wi_fog,
            R.string.wi_day_haze,
            R.string.wi_smoke,
            R.string.wi_cloudy_gusts,
            R.string.wi_windy,
            R.string.wi_night_snow,
            R.string.wi_cloudy,
            R.string.wi_night_cloudy,
            R.string.wi_day_cloudy,
            R.string.wi_night_cloudy_gusts,
            R.string.wi_day_cloudy_gusts,
            R.string.wi_night_clear,
            R.string.wi_day_sunny,
            R.string.wi_night_clear,
            R.string.wi_day_sunny,
            R.string.wi_night_alt_hail,
            R.string.wi_hot,
            R.string.wi_thunderstorm,
            R.string.wi_thunderstorm,
            R.string.wi_thunderstorm,
            R.string.wi_showers,
            R.string.wi_snow,
            R.string.wi_night_snow_wind,
            R.string.wi_night_snow,
            R.string.wi_night_partly_cloudy,
            R.string.wi_night_thunderstorm,
            R.string.wi_night_alt_showers,
            R.string.wi_thunderstorm,
            R.string.wi_cloud
    };
    private int[] wiWeather = {
            R.string.wi_alien,
            R.string.wi_beafort_0,
            R.string.wi_beafort_1,
            R.string.wi_beafort_10,
            R.string.wi_beafort_11,
            R.string.wi_beafort_12,
            R.string.wi_beafort_2,
            R.string.wi_beafort_3,
            R.string.wi_beafort_4,
            R.string.wi_beafort_5,
            R.string.wi_beafort_6,
            R.string.wi_beafort_7,
            R.string.wi_beafort_8,
            R.string.wi_beafort_9,
            R.string.wi_celsius,
            R.string.wi_cloud,
            R.string.wi_cloud_down,
            R.string.wi_cloud_refresh,
            R.string.wi_cloud_up,
            R.string.wi_cloudy,
            R.string.wi_cloudy_gusts,
            R.string.wi_cloudy_windy,
            R.string.wi_day_cloudy,
            R.string.wi_day_cloudy_gusts,
            R.string.wi_day_cloudy_windy,
            R.string.wi_day_fog,
            R.string.wi_day_hail,
            R.string.wi_day_haze,
            R.string.wi_day_lightning,
            R.string.wi_day_rain,
            R.string.wi_day_rain_mix,
            R.string.wi_day_rain_wind,
            R.string.wi_day_showers,
            R.string.wi_day_sleet,
            R.string.wi_day_sleet_storm,
            R.string.wi_day_snow,
            R.string.wi_day_snow_thunderstorm,
            R.string.wi_day_snow_wind,
            R.string.wi_day_sprinkle,
            R.string.wi_day_storm_showers,
            R.string.wi_day_sunny,
            R.string.wi_day_sunny_overcast,
            R.string.wi_day_thunderstorm,
            R.string.wi_day_windy,
            R.string.wi_degrees,
            R.string.wi_down,
            R.string.wi_down_left,
            R.string.wi_down_right,
            R.string.wi_dust,
            R.string.wi_fahrenheit,
            R.string.wi_fog,
            R.string.wi_hail,
            R.string.wi_horizon,
            R.string.wi_horizon_alt,
            R.string.wi_hot,
            R.string.wi_hurricane,
            R.string.wi_left,
            R.string.wi_lightning,
            R.string.wi_lunar_eclipse,
            R.string.wi_meteor,
            R.string.wi_moon_3rd_quarter,
            R.string.wi_moon_first_quarter,
            R.string.wi_moon_full,
            R.string.wi_moon_new,
            R.string.wi_moon_waning_crescent_1,
            R.string.wi_moon_waning_crescent_2,
            R.string.wi_moon_waning_crescent_3,
            R.string.wi_moon_waning_crescent_4,
            R.string.wi_moon_waning_crescent_5,
            R.string.wi_moon_waning_crescent_6,
            R.string.wi_moon_waning_gibbous_1,
            R.string.wi_moon_waning_gibbous_2,
            R.string.wi_moon_waning_gibbous_3,
            R.string.wi_moon_waning_gibbous_4,
            R.string.wi_moon_waning_gibbous_5,
            R.string.wi_moon_waning_gibbous_6,
            R.string.wi_moon_waxing_cresent_1,
            R.string.wi_moon_waxing_cresent_2,
            R.string.wi_moon_waxing_cresent_3,
            R.string.wi_moon_waxing_cresent_4,
            R.string.wi_moon_waxing_cresent_5,
            R.string.wi_moon_waxing_cresent_6,
            R.string.wi_moon_waxing_gibbous_1,
            R.string.wi_moon_waxing_gibbous_2,
            R.string.wi_moon_waxing_gibbous_3,
            R.string.wi_moon_waxing_gibbous_4,
            R.string.wi_moon_waxing_gibbous_5,
            R.string.wi_moon_waxing_gibbous_6,
            R.string.wi_night_alt_cloudy,
            R.string.wi_night_alt_cloudy_gusts,
            R.string.wi_night_alt_cloudy_windy,
            R.string.wi_night_alt_hail,
            R.string.wi_night_alt_lightning,
            R.string.wi_night_alt_rain,
            R.string.wi_night_alt_rain_mix,
            R.string.wi_night_alt_rain_wind,
            R.string.wi_night_alt_showers,
            R.string.wi_night_alt_sleet,
            R.string.wi_night_alt_sleet_storm,
            R.string.wi_night_alt_snow,
            R.string.wi_night_alt_snow_thunderstorm,
            R.string.wi_night_alt_snow_wind,
            R.string.wi_night_alt_sprinkle,
            R.string.wi_night_alt_storm_showers,
            R.string.wi_night_alt_thunderstorm,
            R.string.wi_night_clear,
            R.string.wi_night_cloudy,
            R.string.wi_night_cloudy_gusts,
            R.string.wi_night_cloudy_windy,
            R.string.wi_night_fog,
            R.string.wi_night_hail,
            R.string.wi_night_lightning,
            R.string.wi_night_partly_cloudy,
            R.string.wi_night_rain,
            R.string.wi_night_rain_mix,
            R.string.wi_night_rain_wind,
            R.string.wi_night_showers,
            R.string.wi_night_sleet,
            R.string.wi_night_sleet_storm,
            R.string.wi_night_snow,
            R.string.wi_night_snow_thunderstorm,
            R.string.wi_night_snow_wind,
            R.string.wi_night_sprinkle,
            R.string.wi_night_storm_showers,
            R.string.wi_night_thunderstorm,
            R.string.wi_rain,
            R.string.wi_rain_mix,
            R.string.wi_rain_wind,
            R.string.wi_refresh,
            R.string.wi_refresh_alt,
            R.string.wi_right,
            R.string.wi_showers,
            R.string.wi_sleet,
            R.string.wi_smog,
            R.string.wi_smoke,
            R.string.wi_snow,
            R.string.wi_snow_wind,
            R.string.wi_snowflake_cold,
            R.string.wi_solar_eclipse,
            R.string.wi_sprinkle,
            R.string.wi_sprinkles,
            R.string.wi_stars,
            R.string.wi_storm_showers,
            R.string.wi_strong_wind,
            R.string.wi_sunrise,
            R.string.wi_sunset,
            R.string.wi_thermometer,
            R.string.wi_thermometer_exterior,
            R.string.wi_thermometer_internal,
            R.string.wi_thunderstorm,
            R.string.wi_time_1,
            R.string.wi_time_10,
            R.string.wi_time_11,
            R.string.wi_time_12,
            R.string.wi_time_2,
            R.string.wi_time_3,
            R.string.wi_time_4,
            R.string.wi_time_5,
            R.string.wi_time_6,
            R.string.wi_time_7,
            R.string.wi_time_8,
            R.string.wi_time_9,
            R.string.wi_tornado,
            R.string.wi_umbrella,
            R.string.wi_up,
            R.string.wi_up_left,
            R.string.wi_up_right,
            R.string.wi_wind_default,
            R.string.wi_wind_east,
            R.string.wi_wind_north,
            R.string.wi_wind_north_east,
            R.string.wi_wind_north_west,
            R.string.wi_wind_south,
            R.string.wi_wind_south_east,
            R.string.wi_wind_south_west,
            R.string.wi_wind_west,
            R.string.wi_windy
    };

    public WeatherListAdapter(Context context) {
        mContext = context;
        //show wiWeather on default
        mWeather = wiWeather;
    }

    @Override
    public int getCount() {
        return mWeather.length;
    }

    @Override
    public Object getItem(int position) {
        return mWeather[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_weather, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tvWeather.setText(mWeather[position]);
        return convertView;
    }

    public static class ViewHolder {
        WeatherTextView tvWeather;

        ViewHolder(View view) {
            tvWeather = (WeatherTextView) view.findViewById(R.id.tvWeather);
        }
    }
}
