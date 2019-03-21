package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin : Button = findViewById<Button>(R.id.btLogin)


            btLogin.setOnClickListener(View.OnClickListener {

                val textViewLogin: TextView = findViewById<TextView>(R.id.txtNome) as TextView
                val textViewSenha: TextView = findViewById<TextView>(R.id.txtPassword) as TextView


                val LoginResult: Boolean = Validar.login(
                        textViewLogin.text.toString(),
                        textViewSenha.text.toString())

                if( LoginResult == true ){
                    toast("Login realizado com Sucesso")
                }else{
                    toast("Usuário ou senha incorretos")
                }


            })
    }
}
