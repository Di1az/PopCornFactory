package almada.daniel.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {

    private lateinit var iv_pelicula_imagen: ImageView
    private lateinit var tv_nombre_pelicula:TextView
    private lateinit var tv_pelicula_desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        iv_pelicula_imagen = findViewById(R.id.iv_pelicula_imagen)
        tv_nombre_pelicula = findViewById(R.id.tv_nombre_pelicula)
        tv_pelicula_desc = findViewById(R.id.tv_pelicula_desc)

        val bundle = intent.extras


        if(bundle != null){
            iv_pelicula_imagen.setImageResource(bundle.getInt("header"))
            tv_nombre_pelicula.setText(bundle.getString("nombre"))
            tv_pelicula_desc.setText(bundle.getString("sinopsis"))

        }

    }
}