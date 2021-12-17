package com.example.fresco

import android.graphics.Color
import android.graphics.ColorFilter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.fresco.R
import com.google.android.material.snackbar.Snackbar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [home.newInstance] factory method to
 * create an instance of this fragment.
 */
class home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val txt_why: TextView = view.findViewById(R.id.txt_why)
        txt_why.setOnClickListener {
            Snackbar.make(it, "А вот зачем", Snackbar.LENGTH_SHORT).show()
        }
        val txt_name: TextView = view.findViewById(R.id.textView)
        txt_name.setOnClickListener {
            Snackbar.make(it, "Красавчик", Snackbar.LENGTH_SHORT).show()
        }
        val txt_ava: CardView = view.findViewById(R.id.cardView)
        txt_ava.setOnClickListener {
            Snackbar.make(it, "Что может быть лучше", Snackbar.LENGTH_SHORT).show()
        }
        val ll_blue: LinearLayout = view.findViewById(R.id.linearLayout)
        ll_blue.setOnClickListener {
            Snackbar.make(it, "А вот так меняется", Snackbar.LENGTH_SHORT).show()
            ll_blue.background.setTint(Color.GREEN)
        }
        //Антон, ты заебал смотреть мои коммиты.
        // Я ведь такими темпами буду делать онли приватные репы или постить еще большую хуйню)
        return view
    }


}
/*
button.read.setOnClickListener{
  If (it.view == requireContext() ) {
      Toast.makeText(requireContext(), "fuck",Toast.LengthShort) 

    }else{
      Val uid = user.id
      Val emails = user. Emails
      Val quality = user. Quantity
      sendMessage (uid, emails, quantity) 
}
fun send msg(uid, emails,quantity) {
   SendMessage = sendMessage (uid, emails, quantity) 
return SendMessage
}
val view = inflater.inflate(R.layout.fragment_home, container, false) 
val txt_why: TextView = view.findViewById(R.id.txt_why) 
txt_why.setOnClickListener { 
Snackbar.make(it, "А вот зачем", Snackbar.LENGTH_SHORT).show() }
 val txt_name: TextView = view.findViewById(R.id.textView) 
txt_name.setOnClickListener { 
Snackbar.make(it, "Красавчик", Snackbar.LENGTH_SHORT).show() } 
val txt_ava: CardView = view.findViewById(R.id.cardView) 
txt_ava.setOnClickListener { 
Snackbar.make(it, "Что может быть лучше", Snackbar.LENGTH_SHORT).show() } 
val ll_blue: LinearLayout = view.findViewById(R.id.linearLayout)
 ll_blue.setOnClickListener { Snackbar.make(it, "А вот так меняется", Snackbar.LENGTH_SHORT).show()
 ll_blue.background.setTint(Color.GREEN) 
 return view
}
*/
