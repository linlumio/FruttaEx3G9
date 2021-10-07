package com.example.fruttaex3g9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fruttaex3g9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val mela = "1 Mela"
        val melaS = "La mela (dal latino malum)[1] è il falso frutto del melo (Malus domestica), infatti, il vero frutto è il torsolo, che invece buttiamo. Il melo ha origine in Asia centrale (attuale Kazakistan) e l'evoluzione dei meli botanici risalirebbe al Neolitico. La specie è presente in Italia nominalmente con circa 2000 varietà, ma la definizione più precisa è difficile data la sovrapposizione storica delle denominazioni, e le specie estinte o irreperibili."

        val pera = "2 Pere"
        val peraS = "La pera è il falso frutto delle piante del genere Pyrus a cui appartengono molte specie differenti. Alcune delle specie producono frutti eduli e vengono perciò coltivate, quella più diffusa è la specie Pyrus communis.\n" +
                "\n" +
                "La pera è ricca di zuccheri semplici, specialmente fruttosio. La prevalenza di potassio la rende adatta ad una dieta iposodica (cioè una dieta povera di sodio). "

        val mandarino = "3 Mandarini"
        val mandarinoS = "Il mandarino (Citrus reticulata Blanco, 1837) è un albero da frutto appartenente alla famiglia delle Rutaceae.[1].\n" +
                "È uno dei tre agrumi originali del genere Citrus assieme al cedro ed al pomelo. Nel 2014, un lavoro scientifico ha chiarito la complessa sistematica degli agrumi definendo come tutti gli agrumi derivino da tre sole specie[2] (mandarino, pomelo e cedro). Il mandarino ha certo acquistato importanza storica, in quanto si tratta dell'unico frutto dolce tra i tre originali."

        val ananas = "8 Ananas"
        val ananasS = "Buona fortuna"

        var counter = reset(mela, melaS)

        bind.avanti.setOnClickListener{
            println("ci va?")
            if (counter == 0){
                println("primo entro")
                bind.titolo.text = pera
                bind.spiegazione.text = peraS
                bind.progressBar.progress = 33
                counter++
                println(counter)
            }else if (counter == 1){
                bind.titolo.text = mandarino
                bind.spiegazione.text = mandarinoS
                bind.progressBar.progress = 66
                counter++
            }else if (counter == 2){
                bind.titolo.text = ananas
                bind.spiegazione.text = ananasS
                bind.progressBar.progress = 100
                counter++
            }else if (counter == 3){
                
                counter = reset(mela, melaS)
            }
        }

        /* ma perchè mi permette di crearla qua dentro?
        fun reset(){
            bind.titolo.text = mela
            bind.spiegazione.text = melaS
            bind.progressBar.progress = 0
            counter = 0

        }*/
    }

    private fun reset(a:String, b:String):Int {
        bind.titolo.text = a
        bind.spiegazione.text = b
        bind.progressBar.progress = 0
        return 0
    }

}