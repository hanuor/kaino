package `in`.hanuor.kaino

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log



class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Hey, "," sadasd")
        var locationManager: LocationManager = this.getSystemService(android.content.Context.LOCATION_SERVICE) as LocationManager
        var locationListener = object : LocationListener {
            override fun onLocationChanged(p0: Location?) {
                //get location
                Log.d("Hey location!", " bbbbbbb " + p0?.accuracy +" ???  " +  p0?.latitude + p0?.longitude)
            }

            override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProviderEnabled(p0: String?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onProviderDisabled(p0: String?) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0f, locationListener)

        val GPSlocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val gpsLocationListener = GPSLocationListener()
        GPSlocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,5000, 10f, gpsLocationListener)


    }
}
