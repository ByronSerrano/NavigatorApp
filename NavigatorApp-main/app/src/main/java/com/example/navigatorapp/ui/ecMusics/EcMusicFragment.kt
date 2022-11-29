package com.example.navigatorapp.ui.ecMusics


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigatorapp.recyclerEcMusics.EcMusicProvider
import com.example.navigatorapp.recyclerEcMusics.adapter.EcMusicAdapter
import com.example.navigatorapp.databinding.FragmentEcplayersBinding

class EcMusicFragment : Fragment() {
    private var _binding: FragmentEcplayersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEcplayersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerPlayers.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = EcMusicAdapter(EcMusicProvider.ecPlayersList)
        }
    }
}