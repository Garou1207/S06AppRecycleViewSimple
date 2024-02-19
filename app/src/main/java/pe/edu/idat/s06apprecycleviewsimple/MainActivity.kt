package pe.edu.idat.s06apprecycleviewsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.s06apprecycleviewsimple.databinding.ActivityMainBinding
import pe.edu.idat.s06apprecycleviewsimple.databinding.ItemListaBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvLista.layoutManager = LinearLayoutManager(
            applicationContext)
        binding.rvLista.adapter = AdapterLista(listado())
    }
    private fun listado():List<String>{
        val lista = ArrayList<String>()
        var i = 0
        while(i<10){
            lista.add("Valor $i")
            i++
        }
        return  lista
    }
}