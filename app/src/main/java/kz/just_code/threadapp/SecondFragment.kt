package kz.just_code.threadapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class SecondFragment: Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red))
        SingleClass1.number++

        Toast.makeText(requireContext(), SingleClass1.number.toString(), Toast.LENGTH_SHORT).show()
    }
}