package es.iessaladillo.pedrojoya.profile.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import es.iessaladillo.pedrojoya.profile.R
import es.iessaladillo.pedrojoya.profile.utils.*
import javax.naming.Context
import javax.xml.datatype.DatatypeConstants.DURATION

//import kotlinx.android.synthetic.main.profile_avatar.*
//import kotlinx.android.synthetic.main.profile_form.*

class ProfileActivity : AppCompatActivity() {


    private val DURATION_TOAST: Int = 2

    //TOAST
    private lateinit var message: Toast

    //BOTTON
    private lateinit var mnuSave: Button
    //  EDIT_TEXT
    private lateinit var txtName: EditText
    private lateinit var txtEmail: EditText
    private lateinit var txtPhone: EditText
    private lateinit var txtAddress: EditText
    private lateinit var txtWeb: EditText
    //  IMAGE
    private lateinit var imgAvatar: ImageView
    private lateinit var imgEmail: ImageView
    private lateinit var imgPhone: ImageView
    private lateinit var imgAddress: ImageView
    private lateinit var imgWeb: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        setContentView(R.layout.profile_activity)
        onStart()
        // TODO
    }

    override fun onStart() {
        super.onStart()
        mnuSave.setOnClickListener(checkFields())
    }

    private fun checkFields(): View.OnClickListener? {
        if(!isValidName() && txtEmail.text.toString().isValidEmail() && txtPhone.text.toString().isValidPhone() && txtWeb.text.toString().isValidUrl()){
            Toast.makeText(this,"User save successfully", DURATION_TOAST).show()
        }
    }

    private fun isValidName(): Boolean = txtName.text.toString().isBlank()

    private fun setupView() {
        //Boton saves menu:
        mnuSave = findViewById(R.id.mnuSave)
        //Capturar TXT
        txtName = findViewById(R.id.txtName)
        txtEmail = findViewById(R.id.txtEmail)
        txtPhone = findViewById(R.id.txtPhoneNumber)
        txtAddress = findViewById(R.id.txtAddress)
        txtWeb = findViewById(R.id.txtWeb)
        //Capturar Imagenes
        imgAvatar = findViewById(R.id.imgAvatar)
        imgEmail = findViewById(R.id.imgEmail)
        imgPhone = findViewById(R.id.imgPhoneNumber)
        imgAddress = findViewById(R.id.imgAddress)
        imgWeb = findViewById(R.id.imgWeb)
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.mnuSave) {
            save()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun save() {
        // TODO
    }

}
