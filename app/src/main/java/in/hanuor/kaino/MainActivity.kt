package `in`.hanuor.kaino

import android.annotation.SuppressLint
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
        var locationManager: LocationManager = this.getSystemService(android.content.Context.LOCATION_SERVICE) as LocationManager
        var locationListener = object:LocationListener{
            override fun onLocationChanged(p0: Location?) {
                //get location
                Log.d("Hey location!", "" + p0?.accuracy)
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
    }
}
