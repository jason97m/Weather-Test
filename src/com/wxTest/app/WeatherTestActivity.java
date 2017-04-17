package com.wxTest.app;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class WeatherTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LocationManager mlocManager =

        		(LocationManager)getSystemService(WeatherTestActivity.LOCATION_SERVICE);

        		LocationListener mlocListener = new MyLocationListener();


        		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
    }
    
    public class MyLocationListener implements LocationListener

    {

    public void onLocationChanged1(Location loc)

    {

    loc.getLatitude();

    loc.getLongitude();

    String Text = "My current location is: " +

    "Latitud = " + loc.getLatitude() +

    "Longitud = " + loc.getLongitude();


    Toast.makeText( getApplicationContext(),

    Text,

    Toast.LENGTH_SHORT).show();

    }


    public void onProviderDisabled(String provider)

    {

    Toast.makeText( getApplicationContext(),

    "Gps Disabled",

    Toast.LENGTH_SHORT ).show();

    }


    public void onProviderEnabled(String provider)

    {

    Toast.makeText( getApplicationContext(),

    "Gps Enabled",

    Toast.LENGTH_SHORT).show();

    }


    public void onStatusChanged(String provider, int status, Bundle extras)

    {


    }


	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		
	}

    }/* End of Class MyLocationListener */
}