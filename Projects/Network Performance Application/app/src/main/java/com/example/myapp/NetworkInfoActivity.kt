//package com.example.myapp
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.telephony.TelephonyManager
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
////class NetworkInfoActivity : AppCompatActivity() {
////
////    private lateinit var textViewDetails: TextView
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_network_info)
////
////        textViewDetails = findViewById(R.id.textViewDetails)
////
////        displayNetworkInfo()
////    }
////
////    private fun displayNetworkInfo() {
////        val telephonyManager = getSystemService(TELEPHONY_SERVICE) as TelephonyManager
////        val signalStrength = getSignalStrength()
////        val simDetails = getSimDetails(telephonyManager)
////
////        val networkInfo = """
////            Nearest Base Station: ${getNearestBaseStation()}
////            Signal Strength: $signalStrength dBm
////            SIM Module: $simDetails
////            Mobility Management: ${getMobilityManagementInfo()}
////        """.trimIndent()
////
////        textViewDetails.text = networkInfo
////    }
////
////    private fun getSignalStrength(): Int {
////        // Implement logic to get signal strength
////        return -70 // Placeholder value
////    }
////
////    private fun getSimDetails(telephonyManager: TelephonyManager): String {
////        val simSerialNumber = telephonyManager.simSerialNumber
////        val simOperatorName = telephonyManager.simOperatorName
////        return "SIM Serial: $simSerialNumber, Operator: $simOperatorName"
////    }
////
////    private fun getNearestBaseStation(): String {
////        // Implement logic to get nearest base station
////        return "Base Station XYZ" // Placeholder value
////    }
////
////    private fun getMobilityManagementInfo(): String {
////        // Implement logic to get mobility management information
////        return "Mobility Management Info" // Placeholder value
////    }
////}
//
//class NetworkInfoActivity : AppCompatActivity() {
//
//    private lateinit var textViewDetails: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_network_info)  // Ensure correct layout is set
//
//        textViewDetails = findViewById(R.id.textViewDetails)
//
//        displayNetworkInfo()
//    }
//
//    private fun displayNetworkInfo() {
//        val telephonyManager = getSystemService(TELEPHONY_SERVICE) as TelephonyManager
//        val signalStrength = getSignalStrength()
//        val simDetails = getSimDetails(telephonyManager)
//
//        val networkInfo = """
//            Nearest Base Station: ${getNearestBaseStation()}
//            Signal Strength: $signalStrength dBm
//            SIM Module: $simDetails
//            Mobility Management: ${getMobilityManagementInfo()}
//        """.trimIndent()
//
//        textViewDetails.text = networkInfo  // Ensure correct display
//    }
//
//    private fun getSignalStrength(): Int {
//        // Implement actual logic to get signal strength
//        return -70 // Placeholder value
//    }
//
//    @SuppressLint("MissingPermission")
//    private fun getSimDetails(telephonyManager: TelephonyManager): String {
//        val simSerialNumber = telephonyManager.simSerialNumber
//        val simOperatorName = telephonyManager.simOperatorName
//        return "SIM Serial: $simSerialNumber, Operator: $simOperatorName"
//    }
//
//    private fun getNearestBaseStation(): String {
//        // Implement actual logic to get nearest base station
//        return "Base Station XYZ"  // Placeholder value
//    }
//
//    private fun getMobilityManagementInfo(): String {
//        // Implement actual logic to get mobility management info
//        return "Mobility Management Info"  // Placeholder value
//    }
//}
//
//package com.example.myapp
//
//import android.annotation.SuppressLint
//import android.os.Bundle
//import android.telephony.TelephonyManager
//import android.util.Log
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//
//class NetworkInfoActivity : AppCompatActivity() {
//
//    private lateinit var textViewDetails: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_network_info)
//
//        Log.d("NetworkInfoActivity", "onCreate called")  // Log for debugging
//
//        textViewDetails = findViewById(R.id.textViewDetails)
//        displayNetworkInfo()
//    }
//
//    private fun displayNetworkInfo() {
//        val telephonyManager = getSystemService(TELEPHONY_SERVICE) as TelephonyManager
//        val signalStrength = getSignalStrength()  // This will be a placeholder for now
//        val simDetails = getSimDetails(telephonyManager)
//
//        val networkInfo = """
//            Nearest Base Station: ${getNearestBaseStation()}
//            Signal Strength: $signalStrength dBm
//            SIM Module: $simDetails
//            Mobility Management: ${getMobilityManagementInfo()}
//        """.trimIndent()
//
//        Log.d("NetworkInfoActivity", "Displaying Network Info: $networkInfo")  // Log for debugging
//        textViewDetails.text = networkInfo
//    }
//
//    private fun getSignalStrength(): Int {
//        // Placeholder implementation, replace with real logic if available
//        return -70 // Simulated signal strength value
//    }
//
//    @SuppressLint("MissingPermission", "HardwareIds")
//    private fun getSimDetails(telephonyManager: TelephonyManager): String {
//        val simSerialNumber = telephonyManager.simSerialNumber ?: "N/A"
//        val simOperatorName = telephonyManager.simOperatorName ?: "N/A"
//        return "SIM Serial: $simSerialNumber, Operator: $simOperatorName"
//    }
//
//    private fun getNearestBaseStation(): String {
//        // Placeholder for now
//        return "Base Station XYZ"
//    }
//
//    private fun getMobilityManagementInfo(): String {
//        // Placeholder for now
//        return "Mobility Management Info"
//    }
//}
//


// next update
//package com.example.myapp
//
//import android.Manifest
//import android.content.pm.PackageManager
//import android.os.Build
//import android.os.Bundle
//import android.telephony.TelephonyManager
//import android.util.Log
//import android.widget.TextView
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.app.ActivityCompat
//import androidx.core.content.ContextCompat
//
//class NetworkInfoActivity : AppCompatActivity() {
//
//    private lateinit var textViewDetails: TextView
//    private val REQUEST_PHONE_STATE_PERMISSION = 1
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_network_info)
//
//        textViewDetails = findViewById(R.id.textViewDetails)
//
//        // Check and request permission for accessing phone state
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_PHONE_STATE), REQUEST_PHONE_STATE_PERMISSION)
//            } else {
//                displayNetworkInfo()
//            }
//        } else {
//            displayNetworkInfo()
//        }
//    }
//
//    // Handle the result of the permission request
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == REQUEST_PHONE_STATE_PERMISSION && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            displayNetworkInfo()
//        } else {
//            textViewDetails.text = "Permission not granted to read phone state."
//        }
//    }
//
//    private fun displayNetworkInfo() {
//        Log.d("NetworkInfoActivity", "Fetching network info...")
//
//        val telephonyManager = getSystemService(TELEPHONY_SERVICE) as TelephonyManager
//        val signalStrength = getSignalStrength()  // Placeholder value
//        val simDetails = getSimDetails(telephonyManager)
//
//        val networkInfo = """
//            Nearest Base Station: ${getNearestBaseStation()}
//            Signal Strength: $signalStrength dBm
//            SIM Module: $simDetails
//            Mobility Management: ${getMobilityManagementInfo()}
//        """.trimIndent()
//
//        Log.d("NetworkInfoActivity", "Displaying Network Info: $networkInfo")
//        textViewDetails.text = networkInfo
//    }
//
//    // Replace with valid methods that do not require privileged access
//    private fun getSimDetails(telephonyManager: TelephonyManager): String {
//        val simOperatorName = telephonyManager.simOperatorName ?: "N/A"  // Public info, no privileged access required
//        return "Operator: $simOperatorName"
//    }
//
//    private fun getSignalStrength(): Int {
//        return -70  // Placeholder for signal strength
//    }
//
//    private fun getNearestBaseStation(): String {
//        return "Base Station XYZ"  // Placeholder
//    }
//
//    private fun getMobilityManagementInfo(): String {
//        return "Mobility Management Info"  // Placeholder
//    }
//}



// another update:
//package com.example.myapp
//
//import android.Manifest
//import android.content.Context
//import android.content.pm.PackageManager
//import android.os.Build
//import android.os.Bundle
//import android.telephony.CellInfo
//import android.telephony.CellSignalStrength
//import android.telephony.TelephonyManager
//import android.widget.TextView
//import androidx.annotation.RequiresApi
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.app.ActivityCompat
//
//class NetworkInfoActivity : AppCompatActivity() {
//
//    private lateinit var textViewDetails: TextView
//    private val REQUEST_CODE_PERMISSIONS = 1
//    private val requiredPermissions = arrayOf(
//        Manifest.permission.ACCESS_FINE_LOCATION,
//        Manifest.permission.READ_PHONE_STATE
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_network_info)
//
//        textViewDetails = findViewById(R.id.textViewDetails)
//
//        if (arePermissionsGranted()) {
//            displayNetworkInfo()
//        } else {
//            ActivityCompat.requestPermissions(this, requiredPermissions, REQUEST_CODE_PERMISSIONS)
//        }
//    }
//
//    private fun arePermissionsGranted(): Boolean {
//        for (permission in requiredPermissions) {
//            if (ActivityCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
//                return false
//            }
//        }
//        return true
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == REQUEST_CODE_PERMISSIONS) {
//            if (grantResults.isNotEmpty() && grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
//                displayNetworkInfo()
//            } else {
//                textViewDetails.text = "Permissions not granted"
//            }
//        }
//    }
//
//    @RequiresApi(Build.VERSION_CODES.R)
//    private fun displayNetworkInfo() {
//        val telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
//
//        // Nearest Base Station Information
//        if (ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) == PackageManager.PERMISSION_GRANTED
//        ) {
//            val cellInfoList: List<CellInfo> = telephonyManager.allCellInfo
//            val baseStationInfo = StringBuilder()
//
//            for (cellInfo in cellInfoList) {
//                val cellSignalStrength: CellSignalStrength = cellInfo.cellSignalStrength
//                baseStationInfo.append("Base Station Info: $cellSignalStrength\n")
//            }
//
//            textViewDetails.append("Nearest Base Station:\n$baseStationInfo\n")
//        }
//
//        // Signal Strength Information
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            val signalStrength = telephonyManager.signalStrength
//            textViewDetails.append("Signal Strength: ${signalStrength?.level ?: "N/A"}\n")
//        }
//
//        // SIM Module Information
//        val simOperatorName = telephonyManager.simOperatorName
//        val simCountryIso = telephonyManager.simCountryIso
//        val simState = telephonyManager.simState
//
//        textViewDetails.append(
//            """
//            SIM Module Information:
//            Operator: $simOperatorName
//            Country: $simCountryIso
//            SIM State: $simState
//            """.trimIndent()
//        )
//
//        // Mobility Management Information (basic info)
//        val networkOperator = telephonyManager.networkOperatorName
//        val networkType = telephonyManager.networkType
//
//        textViewDetails.append(
//            """
//            Mobility Management Info:
//            Network Operator: $networkOperator
//            Network Type: $networkType
//            """.trimIndent()
//        )
//    }
//}
//



// another update:

package com.example.myapp
import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.telephony.CellInfo
import android.telephony.TelephonyManager
import android.telephony.SignalStrength
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class NetworkInfoActivity : AppCompatActivity() {

    private lateinit var textViewBaseStation: TextView
    private lateinit var textViewSignalStrength: TextView
    private lateinit var textViewSIMDetails: TextView
    private lateinit var textViewMobilityInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network_info)

        textViewBaseStation = findViewById(R.id.textViewBaseStation)
        textViewSignalStrength = findViewById(R.id.textViewSignalStrength)
        textViewSIMDetails = findViewById(R.id.textViewSIMDetails)
        textViewMobilityInfo = findViewById(R.id.textViewMobilityInfo)

        // Initialize Logout Button
        val buttonLogout: Button = findViewById(R.id.buttonLogout)
        buttonLogout.setOnClickListener {
            // Navigate to Login Activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Optional: Call finish() if you want to close this activity
        }

        fetchNetworkInfo()
    }

    private fun fetchNetworkInfo() {
        // Check for necessary permissions
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.READ_PHONE_STATE
            ) != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.READ_PHONE_STATE, Manifest.permission.ACCESS_FINE_LOCATION),
                101
            )
            return
        }

        // Get TelephonyManager instance
        val telephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

        // Retrieve and display nearest base station information
        val allCellInfo = telephonyManager.allCellInfo
        if (allCellInfo != null && allCellInfo.isNotEmpty()) {
            for (cellInfo in allCellInfo) {
                if (cellInfo is CellInfo) {
                    // Nearest Base Station information
                    textViewBaseStation.text = "Base Station Info: $cellInfo"
                }
            }
        }

        // Get signal strength
        telephonyManager.listen(object : android.telephony.PhoneStateListener() {
            override fun onSignalStrengthsChanged(signalStrength: SignalStrength?) {
                super.onSignalStrengthsChanged(signalStrength)
                if (signalStrength != null) {
                    textViewSignalStrength.text = "Signal Strength: ${signalStrength.level}"
                }
            }
        }, android.telephony.PhoneStateListener.LISTEN_SIGNAL_STRENGTHS)

        // SIM module details
        val simOperatorName = telephonyManager.simOperatorName
        val simCountryIso = telephonyManager.simCountryIso
        val simState = telephonyManager.simState
        textViewSIMDetails.text =
            "SIM Operator: $simOperatorName\nSIM Country: $simCountryIso\nSIM State: $simState"

        // Mobility Management Information (e.g., network type)
        val networkType = telephonyManager.networkType
        textViewMobilityInfo.text = "Network Type: ${getNetworkTypeString(networkType)}"
    }

    private fun getNetworkTypeString(networkType: Int): String {
        return when (networkType) {
            TelephonyManager.NETWORK_TYPE_LTE -> "LTE"
            TelephonyManager.NETWORK_TYPE_NR -> "5G"
            TelephonyManager.NETWORK_TYPE_HSPA -> "HSPA"
            TelephonyManager.NETWORK_TYPE_EDGE -> "EDGE"
            TelephonyManager.NETWORK_TYPE_GPRS -> "GPRS"
            else -> "Unknown"
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        // Show confirmation dialog on back press
        AlertDialog.Builder(this)
            .setTitle("Logout")
            .setMessage("Do you want to logout?")
            .setPositiveButton("Yes") { _, _ ->
                // If the user confirms, logout and go to login activity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
            .setNegativeButton("No", null)
            .show()
    }
}