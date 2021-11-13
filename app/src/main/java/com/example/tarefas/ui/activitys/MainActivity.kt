package com.example.tarefas.ui.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tarefas.R
import com.example.tarefas.models.Tarefa
import com.example.tarefas.ui.components.ListaTarefaAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaTarefaView = findViewById<RecyclerView>(R.id.lista_tarefas)
        val tarefas =  listOf(
            Tarefa("Medico", "marcar consulta"),
            Tarefa("Estudo", "Estudar kotlin")
        )
        listaTarefaView.adapter = ListaTarefaAdapter(tarefas, this)
    }
}