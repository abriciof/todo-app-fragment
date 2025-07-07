package com.abriciof.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.abriciof.todolist.databinding.FragmentTerceiroBinding

class TerceiroFragment : Fragment() {

    private var _binding: FragmentTerceiroBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTerceiroBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.botao3.setOnClickListener {
            findNavController().navigate(R.id.action_TerceiroFragmento_to_SegundoFragmento)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}