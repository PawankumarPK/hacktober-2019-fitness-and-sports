package com.example.fitnessandsports.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fitnessandsports.R
import com.example.fitnessandsports.fragmentSubCatagories.BaseFragment
import android.widget.Toast




/**
 * A simple [Fragment] subclass.
 */
class AuthFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

/*

    fun SignIn(view: View) {

        val username = usernameET.getText().toString()
        val password = passwordET.getText().toString()

        if (username == "cake" && password == "robot") {
            Toast.makeText(this, "You Signed In", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
        }
    }
*/


}
