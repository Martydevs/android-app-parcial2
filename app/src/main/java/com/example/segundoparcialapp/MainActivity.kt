package com.example.segundoparcialapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var descripcionEditText: EditText
    private lateinit var infoLibroEditText: EditText
    private lateinit var totalTextInput: TextInputLayout
    private lateinit var cantidadTextInputLayout: TextInputLayout
    private lateinit var precioSugTextInputLayout: TextInputLayout
    private lateinit var calcularBtn: Button
    private lateinit var limpiarBtn: Button
    private lateinit var salirBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        descripcionEditText = findViewById(R.id.edit_txt_descripcion)
        infoLibroEditText = findViewById(R.id.edit_txt_informacion_libro)
        totalTextInput = findViewById(R.id.input_total)
        cantidadTextInputLayout = findViewById(R.id.input_cantidad)
        precioSugTextInputLayout = findViewById(R.id.input_precio)
        calcularBtn = findViewById(R.id.btn_calcular)
        limpiarBtn = findViewById(R.id.btn_limpiar)
        salirBtn = findViewById(R.id.btn_salir)

        calcularBtn.setOnClickListener {
            totalTextInput.editText?.setText(calcularTotal().toString())
        }

        limpiarBtn.setOnClickListener {
            limpiar()
        }

        salirBtn.setOnClickListener {
            salir()
        }
    }

    fun calcularTotal(): Double {
        val cantidad = cantidadTextInputLayout.editText?.text.toString().toDouble()
        val precioSugerido = precioSugTextInputLayout.editText?.text.toString().toDouble()
        return cantidad * precioSugerido
    }

    fun limpiar() {
        descripcionEditText.setText("")
        infoLibroEditText.setText("")
        totalTextInput.editText?.setText("")
        cantidadTextInputLayout.editText?.setText("")
        precioSugTextInputLayout.editText?.setText("")
    }

    fun salir() {
        finish()
    }


}