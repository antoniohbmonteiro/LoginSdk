package com.antoniomonteiro.loginsdk

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signupBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

        loginBtn.setOnClickListener {
            Log.i("AntonioTesteTag", "funfou")
            activity?.setResult(Activity.RESULT_OK, Intent())
            activity?.finish()
        }
    }

}