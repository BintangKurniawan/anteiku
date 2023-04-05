package com.bintang.anteiku

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val txNama = findViewById<TextView>(R.id.nama_pemesan)
        val txEmail =findViewById<TextView>(R.id.email_pemesan)
        val txNohp = findViewById<TextView>(R.id.no_telpon)
        val txMinuman = findViewById<TextView>(R.id.minum)
        val txMakanan = findViewById<TextView>(R.id.makanan)
        val txTgl = findViewById<TextView>(R.id.tgl)
        val txByr = findViewById<TextView>(R.id.byr)
        val extras = intent.extras
        if(extras != null) {
            txNama.text = extras.getString("nama")
            txEmail.text = extras.getString("email")
            txTgl.text = extras.getString("tanggal")
            txMinuman.text = extras.getString("minuman")
            txByr.text = extras.getString("bayar")
            txNohp.text = extras.getString("noHp")
            var SnackSTR: String = "";
            for (snack in extras.getStringArrayList("snacks")!!) {
                SnackSTR += "$snack\n"
            }
            txMakanan.text = SnackSTR
        }
//        val namaPemesan = intent.getStringExtra("nama")
//        val emailPemesan = intent.getStringExtra("email")
//        val noTelpon = intent.getStringExtra("noHp")
//        val tanggalPesanan = intent.getStringExtra("tanggal")
//        val minuman = intent.getStringExtra("minuman")
//        val makanan = intent.getStringArrayListExtra("makanan")


    }
}