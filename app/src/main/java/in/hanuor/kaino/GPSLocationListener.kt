package `in`.hanuor.kaino

import android.location.Location
import android.location.LocationListener
import android.os.Bundle
import android.util.Log

/*
 * Copyright (C) 2016 Hanuor Inc. by Shantanu Johri(https://hanuor.github.io/shanjohri/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class GPSLocationListener: LocationListener {
    override fun onLocationChanged(p0: Location?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
""
        Log.d("Hey GPS", "" + p0?.accuracy + "  as " + p0?.longitude)
    }

    override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProviderEnabled(p0: String?) {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProviderDisabled(p0: String?) {
     //   TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}