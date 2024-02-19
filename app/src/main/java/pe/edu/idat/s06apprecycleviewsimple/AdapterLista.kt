package pe.edu.idat.s06apprecycleviewsimple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.s06apprecycleviewsimple.databinding.ActivityMainBinding
import pe.edu.idat.s06apprecycleviewsimple.databinding.ItemListaBinding

class AdapterLista(private var lstItem:List<String>) : RecyclerView.Adapter<AdapterLista.ViewHolder>() {

    inner class ViewHolder(val binding: ItemListaBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }
    override fun getItemCount()= lstItem.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNombre.setText(lstItem.get(position))
    }

}