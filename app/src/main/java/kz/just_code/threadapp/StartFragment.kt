package kz.just_code.threadapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kz.just_code.threadapp.databinding.FragmentStartBinding

class StartFragment: Fragment() {
    private lateinit var binding: FragmentStartBinding
    private var number: Long = 0
    private var handler: Handler? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.run.setOnClickListener {
            number = System.currentTimeMillis()
            //getRequest()
            val car = Car.Builder()
                .setColor("Blue")
                .setDoorCount(4)
                .setTon(true)
                .build()

            Toast.makeText(requireContext(), car.toString(), Toast.LENGTH_LONG).show()

            Car.number
        }


    }

    private fun getRequest() {
        handler = Handler(Looper.getMainLooper())
        handler?.postDelayed({
            val millis = System.currentTimeMillis() - number
            binding.hello.text = "Hello i am a new thread, $millis"
            Log.e(">>>", "Hello i am a new thread, $millis")
        }, 3200)

        findNavController().navigate(R.id.action_startFragment_to_secondFragment)

        /*        val runnable = Runnable {
                    *//*runOnUiThread {
                binding.hello.text = "Hello i am a new thread"
            }
            binding.hello.post {
                binding.hello.text = "Hello i am a new thread"
            }*//*

            binding.hello.postDelayed({
                val millis = System.currentTimeMillis() - number
                binding.hello.text = "Hello i am a new thread, $millis"
            }, 1500)
        }

        val thread = Thread(runnable)
        thread.start()*/
    }
}