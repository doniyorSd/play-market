package com.example.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playmarket.databinding.ActivityMainBinding
import com.example.playmarket.models.GeneralData
import com.example.playmarket.models.Programm

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var generalData: ArrayList<GeneralData>
    lateinit var playMarketAdapter: PlayMarketAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

        playMarketAdapter = PlayMarketAdapter(generalData)
        binding.rv.adapter = playMarketAdapter

    }

    private fun loadData() {
        generalData = ArrayList()

        val programm5 = Programm(R.drawable.ic_facebook,"Facebook")
        val programm1 = Programm(R.drawable.ic_whatsapp,"Whatsapp")
        val programm2 = Programm(R.drawable.ic_yandex,"Yandex")
        val programm3 = Programm(R.drawable.ic_instagram,"Instagram")
        val programm4 = Programm(R.drawable.ic_telegram,"Telegram")
        generalData.add(GeneralData("Recommended for you", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
        generalData.add(GeneralData("New", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
        generalData.add(GeneralData("Action", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
        generalData.add(GeneralData("Educational", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
        generalData.add(GeneralData("Music", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
        generalData.add(GeneralData("Book", arrayListOf(programm5,programm1,programm4,programm3,programm2)))
    }
}