package android.vscripts.com.au.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.vscripts.com.au.example.affirmations.adapter.ItemAdapter
import android.vscripts.com.au.example.affirmations.data.Datasource
// import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val textView: TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadAffirmations().size.toString()*/

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

    }
}