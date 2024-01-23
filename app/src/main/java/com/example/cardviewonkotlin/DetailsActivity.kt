package com.example.cardviewonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val text = findViewById<TextView>(R.id.textViewdetails)

        val clicked = receiveName()
        val fussball = "Fußball ist eine Ballsportart, bei der zwei Mannschaften mit dem Ziel gegeneinander antreten, mehr Tore als der Gegner zu erzielen und so das Spiel zu gewinnen. Die Spielzeit ist üblicherweise zweimal 45 Minuten, zuzüglich Nachspielzeit sowie gegebenenfalls Verlängerung und/oder Elfmeterschießen. Eine Mannschaft besteht in der Regel aus elf Spielern, von denen einer der Torwart ist. Der Ball darf mit dem ganzen Körper gespielt werden mit Ausnahme der Arme und Hände; vorwiegend wird er mit dem Fuß getreten. Nur der Torwart (innerhalb des eigenen Strafraums) – bzw. die Feldspieler beim Einwurf – dürfen den Ball mit den Händen berühren."
        val basketball = "Basketball ist eine meist in der Halle betriebene Ballsportart, bei der zwei Mannschaften versuchen, den Ball in den jeweils gegnerischen Korb zu werfen. Die Körbe sind 3,05 Meter hoch an den beiden Schmalseiten des Spielfelds angebracht. Eine Mannschaft besteht in der Regel aus fünf Feldspielern (wobei es auch andere Variationen wie die zunehmend populäre 3-gegen-3-Variante gibt) und bis zu sieben Auswechselspielern, die beliebig oft wechseln können. Jeder Treffer in den Korb aus dem Spiel heraus zählt je nach Entfernung zwei oder drei Punkte. Ein getroffener Freiwurf zählt einen Punkt. Es gewinnt die Mannschaft mit der höheren Punktzahl."
        val badminton = "Die Ballsportart Badminton ist ein Rückschlagspiel, das mit einem Federball und jeweils einem Badmintonschläger pro Person gespielt wird. Dabei versuchen die Spieler, den Ball so über ein Netz zu schlagen, dass die Gegenseite ihn nicht den Regeln entsprechend zurückschlagen kann. Es kann sowohl von zwei Spielern als Einzel, als auch von vier Spielern als Doppel oder Mixed gespielt werden. Es wird in der Halle ausgetragen und erfordert wegen der Schnelligkeit und der großen Laufintensität eine hohe körperliche Fitness. Weltweit wird Badminton von über 14 Millionen Spielern in mehr als 160 Nationen wettkampfmäßig betrieben."
        val tischtennis = "Tischtennis ist eine gegen Ende des 19. Jahrhunderts in England entstandene Ballsportart. Es handelt sich um eine Rückschlagsportart."
        val tennis = "Tennis ist ein Rückschlagspiel, bei dem der Spielball von den Spielern mit speziellen Schlägern wechselseitig über ein Netz in die gegnerische Spielfeldhälfte geschlagen wird. Dieser ursprünglich als eher elitär geltende Sport hat sich mit fortschreitender Zeit zum beliebten Breitensport entwickelt. Nach einer ersten Phase von 1896 bis 1924 ist Tennis seit 1988 wieder eine olympische Sportart."
        val mp = mapOf("Fussball" to fussball, "Basketball" to basketball, "Badminton" to badminton, "Tischtennis" to tischtennis, "Tennis" to tennis)


        text.text = mp[clicked]

    }





    fun receiveName():String{
        var bnd:Bundle?= intent.extras
        var username = bnd?.getString("name")
        return username.toString()
    }
}