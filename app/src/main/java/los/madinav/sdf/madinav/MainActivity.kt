package los.madinav.sdf.madinav

import android.graphics.Canvas
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Objects

class MainActivity : AppCompatActivity() {

    lateinit var myView : ViewClassElements



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        myView = findViewById(R.id.my_view)



        val dropdoSPIN_FROM = findViewById<Spinner>(R.id.from_id)
        val items = arrayListOf("404", "405", "406", "407", "408", "409","410")
        val adapterSpinFrom = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        dropdoSPIN_FROM.adapter = adapterSpinFrom



        dropdoSPIN_FROM.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                 println(" selected number = $p2")

                when(p2){
                    0 -> {  selectFrom = 404 }
                    1 -> {  selectFrom = 405 }
                    2 -> {  selectFrom = 406 }
                    3 -> {  selectFrom = 407 }
                    4 -> {  selectFrom = 408 }
                    5 -> {  selectFrom = 409 }
                    6 -> {  selectFrom = 410 }
                }


                needUpdate()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
               // TODO("Not yet implemented")
                selectFrom = 404
            }

        }


        val dropdoSPIN_To = findViewById<Spinner>(R.id.to_id);
        val adapterSpinTo = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        dropdoSPIN_To.adapter = adapterSpinTo


        dropdoSPIN_To.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                 println(" selected number = $p2")

                when(p2){
                    0 -> {  selectTo = 404 }
                    1 -> {  selectTo = 405 }
                    2 -> {  selectTo = 406 }
                    3 -> {  selectTo = 407 }
                    4 -> {  selectTo = 408 }
                    5 -> {  selectTo = 409 }
                    6 -> {  selectTo = 410 }
                }


                needUpdate()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
               // TODO("Not yet implemented")
                selectTo = 404
            }

        }


        myView.loadAll()

    }


    fun needUpdate() {

  myView.loadNewPathToDraw(selectFrom, selectTo)
    }


    companion object {
        var selectFrom = 0
        var selectTo   = 0
    }

}