package com.example.riskofrain2survivors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.acrid).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        view.findViewById<ImageButton>(R.id.artificer).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_thirdFragment)
        }
        view.findViewById<ImageButton>(R.id.commando).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_fourthFragment)
        }
        view.findViewById<ImageButton>(R.id.engineer).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_fithFragment)
        }
        view.findViewById<ImageButton>(R.id.huntress_title).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_sixthFragment)
        }
        view.findViewById<ImageButton>(R.id.loader).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_seventhFragment)
        }
        view.findViewById<ImageButton>(R.id.mercenary).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_eighthFragment)
        }
        view.findViewById<ImageButton>(R.id.mul_t).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_ninthFragment)
        }
        view.findViewById<ImageButton>(R.id.rex).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_tenthFragment)
        }
    }
}