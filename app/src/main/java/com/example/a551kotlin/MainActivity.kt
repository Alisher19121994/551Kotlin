package com.example.a551kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay.Adapter.AdapterMarket
import com.example.ebay.Adapter.Market_adapter_2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        watch()
        products()
    }

    private fun watch() {
        main_recyclerView_id.setHasFixedSize(true)
        main_recyclerView_id.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list = ArrayList<Watch>()

        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))
        list.add(Watch(R.drawable.ic_baseline_watch_24, "Apple Watch"))

        val adapter = Market_adapter_2(this, list)
        main_recyclerView_id.adapter = adapter
    }

    private fun products() {

        rec_2.setHasFixedSize(true)
        rec_2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list = ArrayList<Products>()
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )
        list.add(
            Products(
                R.drawable.ic_baseline_watch_24,
                "Base QuieCompact",
                "$199.00",
                "$279.00 - 29% OFF"
            )
        )

        val adapter = AdapterMarket(this, list)
        rec_2.adapter = adapter
    }
}