package com.bintang.anteiku
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    val nama: String = ""
    val email: String = ""
    val nohp: String = ""
    val tgl: String = ""
    val minuman: String = ""
    val snack = ArrayList<String>()
    val pembayaran: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val namaTx = findViewById<EditText>(R.id.nama_pemesan)
        val emailTx = findViewById<EditText>(R.id.email_pemesan)
        val noHpTx = findViewById<EditText>(R.id.notelpon)
        val tanggalTx = findViewById<EditText>(R.id.tanggal)
        val minumanTx = findViewById<Spinner>(R.id.daftarminuman)
        val pembayaran = findViewById<RadioGroup>(R.id.pembayaran)
        val cb1 = findViewById<CheckBox>(R.id.checkbox_food1)
        val cb2 = findViewById<CheckBox>(R.id.checkbox_food2)
        val cb3 = findViewById<CheckBox>(R.id.checkbox_food3)
        val cb4 = findViewById<CheckBox>(R.id.checkbox_food4)
        val button = findViewById<Button>(R.id.button_psn)
        button.setOnClickListener {
            val nama= namaTx.text.toString()
            val email= emailTx.text.toString()
            val nohp= noHpTx.text.toString()
            val tgl= tanggalTx.text.toString()
            val minuman= minumanTx.selectedItem.toString()
            val pembayaranSelected: Int = pembayaran.checkedRadioButtonId
            val pembayaranRadio: RadioButton = findViewById(pembayaranSelected)
            val bayar = pembayaranRadio.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            if (cb1.isChecked) {
                snack.add( "Sandwich")
            }
            if (cb2.isChecked) {
                snack.add( "Cake")
            }
            if (cb3.isChecked) {
                snack.add("Bakery")
            }
            if (cb4.isChecked) {
                snack.add("Banana Fried")
            }
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("noHp", nohp)
            intent.putExtra("tanggal", tgl)
            intent.putExtra("minuman", minuman)
            intent.putExtra("bayar", bayar)
            intent.putStringArrayListExtra("snacks", snack)
            startActivity(intent)
        }
    }

//    fun PilihMakanan(v: View) {
//        val cb: CheckBox = v as CheckBox
//        if(cb.isChecked) {
//            snack.add(cb.text.toString())
//        }else {
//            snack.remove(cb.text.toString())
//        }
//    }
}
