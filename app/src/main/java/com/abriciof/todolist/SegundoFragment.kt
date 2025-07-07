package com.abriciof.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.abriciof.todolist.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {

    private var _binding: FragmentSegundoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.botao2.setOnClickListener {
            findNavController().navigate(R.id.action_SegundoFragmento_to_TerceiroFragmento)
        }

        binding.linearLayoutMain.setOnClickListener{
            findNavController().navigate(R.id.descricoes)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}